package grandcircus.labs.CoffeeShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import grandcircus.labs.CoffeeShopApp.dao.ItemsDao;
import grandcircus.labs.CoffeeShopApp.dao.UsersDao;

@Controller
public class CoffeeShopController {

	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private ItemsDao itemsDao;

	// home page
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	// Do you want to register? -->adds User to list of Coffee Shop Users
	@RequestMapping("/User-register")
	public ModelAndView registerUser() {

		ModelAndView mav = new ModelAndView("user-register");
		return mav;
	}

	@RequestMapping("/user-welcome")
	public ModelAndView addSubmit(User csuser) {		
		
		usersDao.create(csuser);
		
		return new ModelAndView("user-welcome");
	}


}
