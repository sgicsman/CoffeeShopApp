package grandcircus.labs.CoffeeShopApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import grandcircus.labs.CoffeeShopApp.CartItem;

@Repository
@Transactional
public class CartItemDao {

	@PersistenceContext
	private EntityManager em;
	
	
	public List<CartItem> findAll() {
		return em.createQuery("FROM CartItem", CartItem.class).getResultList();
	}
	
	public CartItem findById(Long id) {
		return em.find(CartItem.class, id);
	}

}
