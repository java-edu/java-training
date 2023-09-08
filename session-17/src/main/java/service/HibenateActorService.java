package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Actor;
import util.HibernateConnectionUtil;

public class HibenateActorService {

	public List<Actor> getAll(){
		Session session = HibernateConnectionUtil.getSessionFactory().openSession();
		Query<Actor> getAllQuery = session.createQuery("from Actor", Actor.class);
		List<Actor> actors = getAllQuery.list();
		return actors;
	}

}
