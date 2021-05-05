package Concrete;

import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;
import Interfaces.IGameSellService;

public class GameSellManager implements IGameSellService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName()+ " adlý oyun " + game.getGamePrice() + " TL'ye " + gamer.getFirstname()
		+ " kullanýcýsýna satýldý. ");
		
	}

	@Override
	public void saleCampaing(Game game, Gamer gamer, Campaing campaing) {
		double priceCampaign = game.getGamePrice() - (game.getGamePrice() * ((double) campaing.getCampaingDiscount()/ 100));
		System.out.println(game.getGameName() + " adlý oyun " + gamer.getFirstname() + " kullanýcýsýna  "
				+ campaing.getCampaingName() + " kampanyasýyla " + priceCampaign + " TL'ye satýldý.");
		
	}

}
