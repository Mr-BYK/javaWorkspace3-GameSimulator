package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println("Game saved. " +game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated. " +game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted. " +game.getGameName());
	}
}
