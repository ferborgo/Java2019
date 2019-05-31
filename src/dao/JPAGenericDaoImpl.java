package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public abstract class JPAGenericDaoImpl<T, E> implements Dao<T, E>{
	
	private EntityManager em;
	
	
	public JPAGenericDaoImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		this.em = emf.createEntityManager();
	} 
	
	public Class<T> getPersistenceClass() {
        ParameterizedType superclass =
            (ParameterizedType) getClass().getGenericSuperclass();

        return (Class<T>) superclass.getActualTypeArguments()[0];
    }
	
	@Override
	public Optional<T> get(E id) {
		return Optional.ofNullable(em.find(this.getPersistenceClass(), id));
	}

	@Override
	public List<T> getAll() {
		List<T> result = em.createQuery("from " + this.getPersistenceClass()).getResultList();
		return result;
	}

	@Override
	public T save(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.flush();
		em.getTransaction().commit();
		em.close();
		return t;
	}

	@Override
	public T update(T t) {
		
		return em.merge(t);	
	}

	@Override
	public Boolean delete(T t) {
		
		return null;		
	}

}
