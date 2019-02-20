package grandcircus.labs.CoffeeShopApp;

public class User {
	
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	private String password;
	private String phonenumber;
	private String creditcardnumber;
	private boolean requestmail = true;
	
	public User () {
	}

	public User(String firstname, String lastname, String email, int age, String password,
			String phonenumber, String creditcardnumber, boolean requestmail) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
		this.phonenumber = phonenumber;
		this.creditcardnumber = creditcardnumber;
		this.requestmail = requestmail;
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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public boolean isRequestmail() {
		return requestmail;
	}

	public void setRequestmail(boolean requestmail) {
		this.requestmail = requestmail;
	}
	
	
}
