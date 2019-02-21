package grandcircus.labs.CoffeeShopApp.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import grandcircus.labs.CoffeeShopApp.Item;

@Repository
@Transactional
public class ItemsDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();
	}
	
	public Item findById(Long id) {
		return em.find(Item.class, id);
	}
	
	public List<Item> findByName(String name) {
		try {
			return em.createQuery("FROM Item WHERE name = :n", Item.class)
				.setParameter("n", name)
				.getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}
	
	public List<Item> findByKeyword(String keyword) {
		return null;
////		return em.createQuery("FROM Item WHERE LOWER(name) LIKE :regex", Food.class)
////				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
////				.getResultList();
	}
	
	public void create(Item item) {
		em.persist(item);
	}
	
	public void update(Item item) {
		em.merge(item); //MUST include ALL columns in a merge -- canNOT just edit one column in an existing row
	}
	
	public void delete(Long id) {
		Item item = em.getReference(Item.class, id);
		em.remove(item);
	}
	
//	public Set<String> findAllCategories() {
//		// This query returns a list of Strings, so I give it String.class
//		List<String> categoryList = null;
//		// Convert the List to a Set.
//		return new TreeSet<>(categoryList);
//	}
 

}
