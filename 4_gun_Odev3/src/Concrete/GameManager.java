package Concrete;

import Entity.Campaing;
import Entity.Game;
import Interfaces.IGameService;

public class GameManager implements IGameService {

	@Override
	public void campainggame(Campaing campaing, Game game) {
		
		
	}

	@Override
	public void gameadd(Game game) {
		System.out.println("Yeni oyunumuz: "+ game.getGameName()+" sisteme eklenmiþtir.");
		
	}

	@Override
	public void gamedelete(Game game) {
		System.out.println("Oyunumuz: "+ game.getGameName()+" sistemden silinmiþtir.");
		
	}

	@Override
	public void gameupdate(Game game,int gameId, String gameName, int gamePrice) {
		game.setGameId(gameId);
		game.setGameName(gameName);
		game.setGamePrice(gamePrice);
		System.out.println(game.getGameName()+"isimli ürün güncellendi.");
	}

}
