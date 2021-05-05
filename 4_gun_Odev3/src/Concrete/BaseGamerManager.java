package Concrete;

import Entity.Gamer;
import Interfaces.IGamerService;

public class BaseGamerManager implements IGamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstname()+" isimli kullanýcý kaydedildi.");
		
	}

	@Override
	public void login(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
