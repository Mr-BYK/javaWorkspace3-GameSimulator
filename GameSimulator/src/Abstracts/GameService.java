package Abstracts;

import Entities.Game;

public interface GameService {
	
	void save(Game game);
	void update(Game game);
	void delete(Game game);
}
