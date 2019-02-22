package grandcircus.labs.CoffeeShopApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	Integer quantity;
	
	@ManyToOne
	Item item;

	
	public CartItem() {}
	
	public CartItem(Long id, Integer quantity, Item item) {
		this.id = id;
		this.quantity = quantity;
		this.item = item;
	}
	
	public CartItem(Integer quantity, Item item) {
		this.quantity = quantity;
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", quantity=" + quantity + ", item=" + item + "]";
	}
	
}
