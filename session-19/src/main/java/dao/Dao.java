package dao;

import java.util.List;
import java.util.Optional;

import entity.Actor;

public interface Dao<T> {

	Optional<T> get(int id);

	List<T> get();

	void add(T t);

	void update(T t, int id);

	void delete(int id);

	Actor getLastInserted();


}
