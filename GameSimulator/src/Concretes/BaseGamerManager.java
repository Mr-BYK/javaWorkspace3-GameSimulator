package Concretes;

import Abstracts.GamerService;
import Entities.Gamer;

public class BaseGamerManager implements GamerService  {

	@Override
	public void save(Gamer gamer) {
		System.out.println("Saved  : " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated :  " + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted : " + gamer.getFirstName());
	}
}
