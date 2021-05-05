package Interfaces;

import Entity.Campaing;
import Entity.Game;


public interface IGameService {

		
	void campainggame(Campaing campaing, Game game);
	void gameadd(Game game);
	void gamedelete(Game game);
	void gameupdate(Game game,int gameId, String gameName, int gamePrice);
}
