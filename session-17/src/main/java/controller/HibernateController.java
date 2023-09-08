package controller;

import java.util.List;

import entity.Actor;
import service.HibenateActorService;

public class HibernateController {
	
	public static void main(String[] args) {
		
		HibenateActorService actorService = new HibenateActorService();
		
		//1. read all
		List<Actor> actors = actorService.getAll();
		actors.forEach(actor->{
			System.out.println(actor);
		});
	}

}
