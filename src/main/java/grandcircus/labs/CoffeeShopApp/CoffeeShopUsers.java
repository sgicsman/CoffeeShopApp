package grandcircus.labs.CoffeeShopApp;

public class CoffeeShopUsers {
	
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	private String password;
	
	public CoffeeShopUsers () {
	}
	
	public CoffeeShopUsers(String firstname, String lastname, String email, int age, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
