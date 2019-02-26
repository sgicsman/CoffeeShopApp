package grandcircus.labs.CoffeeShopApp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import grandcircus.labs.CoffeeShopApp.dao.UsersDao;


@Controller
public class AuthorizationController {
	
	@Autowired
	UsersDao csusersDao;
	
	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login-form");
	}

	@PostMapping("/login")
	// get the username and password from the form when it's submitted.
	public ModelAndView submitLoginForm(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		
		// try to fetch existing user from database
		User csuser = csusersDao.findByUserName(username);
		// check for invalid username or password combination
		if (csuser == null || !( csuser.getPassword().equals(password) ) ) {
			return new ModelAndView("login-form", "message", "incorrect username or password");
		}
		
		// log the user in
		session.setAttribute("user", csuser);
		
		redir.addFlashAttribute("message", "Welcome back. Thanks for being a Preferred Member.");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		session.invalidate();  //!DESTROY ALL MONSTERS! clears session attributes, including user info
		redir.addFlashAttribute("message", "You are logged out.");  // FlashAttribute = shows up ONLY ONCE, when using REDIRECT
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/user-register")
	public ModelAndView showSignupForm() {
		return new ModelAndView("user-register");
	}

	@PostMapping("/user-register")
	public ModelAndView submitSignupForm(
			User csuser,
			@RequestParam("confirm-password") String confirmPassword, 
			HttpSession session, RedirectAttributes redir) {
		// Find the matching user.
		User existingUser = csusersDao.findByUserName(csuser.getUserName());
		if (existingUser != null) {
			// If user already exists, display an error message.
			return new ModelAndView("signup", "message", "A user with that username already exists.");
		}
		
		if (!confirmPassword.equals(csuser.getPassword())) {
			// If the user or passwords don't match, display an error message.
			return new ModelAndView("signup", "message", "Passwords do not match.");
		}
		
		csusersDao.create(csuser);
		
		// On successful sign-up, add the user to the session.
		session.setAttribute("user", csuser);
		
		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Thanks for signing up!");
		return new ModelAndView("redirect:/");
	}

}
