package grandcircus.labs.CoffeeShopApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import grandcircus.labs.CoffeeShopApp.User;

@Repository
@Transactional
public class UsersDao {

	@PersistenceContext
	private EntityManager em;

	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}

	public User findById(Long id) {
		return em.find(User.class, id);
	}

	public List<User> findByFirstName(String name) {
		try {
			return em.createQuery("FROM User WHERE firstname = :n", User.class)
				.setParameter("n", name)
				.getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}
	
	public void create(User csuser) {
		em.persist(csuser);
	}
	
	public void update(User csuser) {
		em.merge(csuser);
	}
	
	public void delete(Long id) {
		User csuser = em.getReference(User.class, id);
		em.remove(csuser);
	}
	
}
