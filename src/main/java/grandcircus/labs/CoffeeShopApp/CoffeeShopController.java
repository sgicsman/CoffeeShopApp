package grandcircus.labs.CoffeeShopApp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import grandcircus.labs.CoffeeShopApp.dao.ItemsDao;
import grandcircus.labs.CoffeeShopApp.dao.UsersDao;

@Controller
public class CoffeeShopController {

	@Autowired
	private UsersDao csusersDao;

	@Autowired
	private ItemsDao itemsDao;

	// home page
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	
	@RequestMapping("/showMenu")
	public ModelAndView showMenu() {
		ModelAndView mav = new ModelAndView("showMenu");
		List<Item> coffeeShopItems = itemsDao.findAll();
		mav.addObject("menuItems", coffeeShopItems); // "menuItems" == <c:forEach var="menu" items="${menuItems}">
														// -->index.jsp
		return mav;
	}
//		List<Item> coffeeShopItems = itemsDao.findAll();
//		return new ModelAndView("index", "menuItems", coffeeShopItems);
//		  ABOVE^^ is shortcut -- works ONLY when adding only ONE value to the model		

	// Do you want to register? -->adds User to list of Coffee Shop Users + @SessionAttribute = gets item from session
	@RequestMapping("/user-register")
	public ModelAndView registerUser(@SessionAttribute(name="profile", required=false) User csuser) {
		return new ModelAndView("user-register", "user", csuser);
	}
	
//  old version, before session setting	
//	@RequestMapping("/user-register")
//		public ModelAndView registerUser() {
//		ModelAndView mav = new ModelAndView("user-register");
//		return mav;
//	}

// Adds the user register information submitted to the csusers database + displays greeting
// Use HttpSession to set an attribute on the session
	@PostMapping("/user-register")
	public ModelAndView addNewCSUser(User csuser, HttpSession session) {
		session.setAttribute("profile", csuser);
		csusersDao.create(csuser);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}

//  old version, before session setting	
//	@PostMapping("/user-register") // Adds the user register information submitted to the csusers database + displays greeting
//	public ModelAndView addSubmit(User csuser) {
//
//		csusersDao.create(csuser);
//		ModelAndView mav = new ModelAndView("user-welcome");
//		mav.addObject("firstname", csuser.getFirstname());
//		return mav;
//	}

	@RequestMapping("/admin") // same as index/home page + includes edit & delete buttons
	public ModelAndView showAdminPage() {
		ModelAndView mav = new ModelAndView("admin");
		List<Item> coffeeShopItems = itemsDao.findAll();
		mav.addObject("menuItems", coffeeShopItems);
		return mav;
	}

	@RequestMapping("/item/delete")
	public ModelAndView delete(@RequestParam("id") Long id) { // path variable to identify item being deleted
		itemsDao.delete(id);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/item/update")
	public ModelAndView showEditForm(@RequestParam("id") Long id) { // path variable to identify item being edited
		ModelAndView mav = new ModelAndView("item-updateform");
		mav.addObject("item", itemsDao.findById(id));
		mav.addObject("title", "Edit Item");
		return mav;
	}

	@PostMapping("/item/update")
	public ModelAndView submitEditForm(Item item) {
		itemsDao.update(item);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/item/create")
	public ModelAndView showCreateForm() {
		return new ModelAndView("item-createForm", "title", "Add an Item"); 
	}

	@PostMapping("/item/create")
	public ModelAndView submitCreateForm(Item item, @RequestParam("name") String name) {
		
		if (itemsDao.findByName(name).size() == 0) {
			itemsDao.create(item);
			return new ModelAndView("redirect:/admin");
		} else {
			return new ModelAndView("/itemExists", "existingItem", name);
		}
	}
}
