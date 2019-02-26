package grandcircus.labs.CoffeeShopApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mark all entity classes with @Entity so that Hibernate knows about them.
@Entity
@Table(name="csusers") // name of SQL table
public class User {
	
	// Marks the ID as the Primary Key (PK), and designates that it is auto-generated & auto-incremented -- MUST HAVE THESE 2 ANNOTATIONS
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String userName;
	private String email;
	private int age;
	private String password;
	private String phonenumber;
	private String creditcardnumber;
	private boolean requestmail = true;
	
	public User () {}  //ALWAYS include a no-args constructor

	public User(Long id, String firstname, String lastname, String userName, String email, int age, String password,
			String phonenumber, String creditcardnumber, boolean requestmail) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.password = password;
		this.phonenumber = phonenumber;
		this.creditcardnumber = creditcardnumber;
		this.requestmail = requestmail;
	}

	public User(String firstname, String lastname, String userName, String email, int age, String password,
			String phonenumber, String creditcardnumber, boolean requestmail) {
//		this.id = id;  Make one constructor WITH id and one WITHOUT id
		this.firstname = firstname;
		this.lastname = lastname;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.password = password;
		this.phonenumber = phonenumber;
		this.creditcardnumber = creditcardnumber;
		this.requestmail = requestmail;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", age="
				+ age + ", password=" + password + ", phonenumber=" + phonenumber + ", creditcardnumber="
				+ creditcardnumber + ", requestmail=" + requestmail + "]";
	}
	
	
}
