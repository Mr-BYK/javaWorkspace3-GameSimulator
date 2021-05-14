package Concretes;

import Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	
	private GamerCheckManager gamerCheckService;
	
	
	public GamerManager() {
		
	}

	@Override
	public void save(Gamer gamer ) {
		if(gamerCheckService.CheckIfPerson(gamer)) {
			super.save(gamer);
			System.out.println("Gamer defined.");
		}
		else {
			System.out.println("Gamer undefined.");
		}
	}
	
	@Override
	public void update(Gamer gamer ) {
		super.update(gamer);
	}
	
	@Override
	public void delete(Gamer gamer ) {
		super.delete(gamer);
	}	
}
