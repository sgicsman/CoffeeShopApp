package grandcircus.labs.CoffeeShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@Autowired
	UsersList userList;
	
	// home page
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	//Do you want to register? -->adds user to list of Coffee Shop Users
	@RequestMapping("/user-register") 
	public ModelAndView registerUser() {
		
		ModelAndView mav = new ModelAndView("user-register");
		return mav;
	}
	
	
	@RequestMapping("/submit-user-registration") 
	public ModelAndView welcomeUser(
			@RequestParam("firstname") String firstName, 
			@RequestParam("lastname") String lastName,
			@RequestParam("email") String eMail,
			@RequestParam("age") int Age,
			@RequestParam("password") String passWord
			) 
	{
		
		ModelAndView mav = new ModelAndView("user-welcome");
		mav.addObject("firstname", firstName);
		mav.addObject("lastname", lastName);
		mav.addObject("email", eMail);
		mav.addObject("age", Age);
		mav.addObject("password", passWord);
		return mav;
	}
	
//	@PostMapping("/submit-user-registration")
//	
//	public ModelAndView welcomeUserPost(
//			@RequestParam("firstname") String firstName, 
//			@RequestParam("lastname") String lastName,
//			@RequestParam("email") String eMail,
//			@RequestParam("age") int Age,
//			@RequestParam("password") String passWord
//			) 
//	{
//		
//		ModelAndView mav = new ModelAndView("user-welcome");
//		mav.addObject("firstname", firstName);
//		mav.addObject("lastname", lastName);
//		mav.addObject("email", eMail);
//		mav.addObject("age", Age);
//		mav.addObject("password", passWord);
//		return mav;
//	}
	
	
}
