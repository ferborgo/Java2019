package dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T, E> {
	
	Optional<T> get(E id);
	
	List<T> getAll();
	
	T save(T t);
	
	T update(T t);
	
	Boolean delete(T t);
}
