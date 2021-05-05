package Main;

import Adapters.MernisService;
import Concrete.BaseGamerManager;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GameSellManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager baseGamerManager= new GamerManager(new MernisService());
		Gamer gamer=new Gamer(1,"Nebahat","Balcý Yalçýn",1986,"13604836180","nebahatbalci34@gmail.com");
		baseGamerManager.register(gamer);
		baseGamerManager.login(gamer);
		baseGamerManager.delete(gamer);
		
		System.out.println("-----------------------------------");
		GameManager gameManager=new GameManager();
		Game game=new Game(1,"XXXX",50);
		gameManager.gameadd(game);
		gameManager.gameupdate(game, 1, "XXXX", 40);
		gameManager.gamedelete(game);
		System.out.println("-----------------------------------");
		
		CampaingManager campaingManager=new CampaingManager();
		Campaing campaing =new Campaing(1,"1 nolu Kampanya ", 10);
		campaingManager.campaingadd(campaing);
		campaingManager.campaingupdate(campaing, 1, "1 nolu Kampanya ", 15);
		campaingManager.campaingdelete(campaing);
		
		System.out.println("-----------------------------------");
		
		GameSellManager gameSellManager=new GameSellManager();
		gameSellManager.sale(game, gamer);
		gameSellManager.saleCampaing(game, gamer, campaing);

	}

}
