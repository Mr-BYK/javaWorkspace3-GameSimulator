package Concretes;

import Abstracts.SaleService;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void addToList(Game[] games,Gamer gamer) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " shopping cart " + game.getPrice() + " TL will be charged.");
		}
	}
}
