package controller;

import java.util.List;

import domain.Actor;
import service.JDBCActorService;

public class ActorController {

	public static void main(String[] args) {
		JDBCActorService jdbcActorService = new JDBCActorService();

		// 1. read all actor records
		List<Actor> actors = jdbcActorService.getAll();
		actors.forEach(a -> {
			System.out.println(a);
		});

		// 2. create actor
		jdbcActorService.add(new Actor("Sai", "Redy"));
		System.out.println("created a new record in actor table");
		actors = jdbcActorService.getAll();
		actors.forEach(a -> {
			System.out.println(a);
		});

		// 3. update
		jdbcActorService.update(new Actor("Sai", "Reddy"), 211);
		System.out.println("updated a record in actor table");
		actors = jdbcActorService.getAll();
		actors.forEach(a -> {
			System.out.println(a);
		});

		// 4. delete
		jdbcActorService.delete(211);
		System.out.println("deleted a record from actor table");
		actors = jdbcActorService.getAll();
		actors.forEach(a -> {
			System.out.println(a);
		});
	}

}
