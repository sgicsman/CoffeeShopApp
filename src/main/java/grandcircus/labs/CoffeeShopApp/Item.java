package grandcircus.labs.CoffeeShopApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mark all entity classes with @Entity so that Hibernate knows about them.
@Entity
@Table(name="items") // name of SQL table
public class Item {

	// Marks the ID as the Primary Key (PK), and designates that it is auto-generated & auto-incremented -- MUST HAVE THESE 2 ANNOTATIONS
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") // name of SQL column
	private Long id;
	private String name;
	private String description;
	private int quantity;
	private double price;
	
	public Item() {}

	public Item(Long id, String name, String description, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Item(String name, String description, int quantity, double price) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
