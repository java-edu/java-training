package controller;

import java.time.LocalDateTime;
import java.util.List;

import dao.ActorHibernateDao;
import dao.ActorJDBCDao;
import dao.Dao;
import entity.Actor;

public class ApplicationController {

	public static void main(String[] args) {

		Dao<Actor> actorService = new ActorJDBCDao();

		// 1. read all
		List<Actor> actors = actorService.get();
		actors.forEach(a -> {
			System.out.println(a);
		});

		// 2. create
		Actor actor = new Actor("Sai", "Redy", LocalDateTime.now().toString());
		actorService.add(actor);
		actor = actorService.getLastInserted();
		System.out.println(actor);

		// 3. update
		actor = actorService.getLastInserted();
		actor.setLastName("Reddy");
		actorService.update(actor, actor.getActorId());
		System.out.println(actor);

		// 4. delete
		actorService.delete(actor.getActorId());

	}

}
