package dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Actor;
import util.HibernateConnectionUtil;

public class ActorHibernateDao implements Dao<Actor> {

	@Override
	public Optional<Actor> get(int id) {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		Actor actor = session.get(Actor.class, id);
		return Optional.of(actor);
	}

	@Override
	public List<Actor> get() {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		Query<Actor> getAllQuery = session.createQuery("from Actor", Actor.class);
		List<Actor> actors = getAllQuery.list();
		return actors;
	}

	public Actor getLastInserted() {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		Query<Actor> getAllQuery = session.createQuery("from Actor order by id desc limit 1", Actor.class);
		return getAllQuery.list().get(0);
	}

	@Override
	public void add(Actor actor) {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(actor);
		session.getTransaction().commit();
	}

	@Override
	public void update(Actor actor, int id) {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Actor actorToUpdate = session.get(Actor.class, id);
		if (actor.getFirstName() != null && actor.getFirstName() != "") {
			actorToUpdate.setFirstName(actor.getFirstName());
		}
		if (actor.getLastName() != null && actor.getLastName() != "") {
			actorToUpdate.setLastName(actor.getLastName());
		}
		session.merge(actorToUpdate);
		session.getTransaction().commit();
	}

	@Override
	public void delete(int id) {
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Actor actorToDelete = session.get(Actor.class, id);
		session.remove(actorToDelete);
		session.getTransaction().commit();
	}

}
