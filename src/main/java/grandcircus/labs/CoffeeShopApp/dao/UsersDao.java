package grandcircus.labs.CoffeeShopApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import grandcircus.labs.CoffeeShopApp.User;

@Repository
public class UsersDao {
	
	@Autowired
	private JdbcTemplate jdbc;

	public List<User> findAll() {		
		String sql = "SELECT * FROM csusers";
		return jdbc.query( sql, new BeanPropertyRowMapper<>(User.class) );
	}
	
	public void create(User csuser) {
		
		String sql = "INSERT INTO csusers (firstname, lastname, email, age, password, phonenumber, creditcardnumber, requestmail) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
		jdbc.update( sql, csuser.getFirstname(), csuser.getLastname(), csuser.getEmail(), csuser.getAge(), csuser.getPassword(), csuser.getPhonenumber(), csuser.getCreditcardnumber(), csuser.isRequestmail() );
	}
	

}
