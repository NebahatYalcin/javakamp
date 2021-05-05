package Interfaces;

import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public interface IGameSellService {

	 void sale(Game game,Gamer gamer);
	 void saleCampaing(Game game,Gamer gamer,Campaing campaing);
}
