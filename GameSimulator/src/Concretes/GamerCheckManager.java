package Concretes;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Gamer defined.");
		return true;
	}

}
