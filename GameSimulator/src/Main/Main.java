package Main;

import Concretes.BaseGamerManager;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager();
		BaseGamerManager baseGamerManager = new BaseGamerManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		System.out.println("Welcome, please login or register");
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Your firstname ");
		String firstName = input.next();
		System.out.println("Your lastname ");
		String lastName = input.next();
		System.out.println("Your email ");
		String email = input.next();
		System.out.println("Your password ");
		String password = input.next();
		System.out.println("Your nationality id ");
		String nationalityId = input.next();
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setEmail(email);
		gamer.setPassword(password);
		gamer.setNationalityId(nationalityId);
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("RIDE 3");
		game1.setPrice(150);
		gameManager.save(game1);
		
		Game game2 = new Game();
		game2.setId(1);
		game2.setGameName("Moto GP");
		game2.setPrice(150);
		gameManager.save(game2);
		
		Game[] games = new Game[] {game1, game2};
		
		Campaign campaign = new Campaign();
		campaignManager.save(campaign);
		
		saleManager.addToList(games, gamer);
		
}}
