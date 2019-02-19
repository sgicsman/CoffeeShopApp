package grandcircus.labs.CoffeeShopApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


	@Component
	public class UsersList {
		
		private List<CoffeeShopUsers> list = new ArrayList<>();
		
		public UsersList() {
		}
		
		public void addCoffeeShopUser(CoffeeShopUsers user) {
			list.add(user);
		}
}
