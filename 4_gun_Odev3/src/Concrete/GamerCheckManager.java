package Concrete;

import Entity.Gamer;
import Interfaces.IGamerCheckService;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean checkifrealperson(Gamer gamer) {
		
		return false;
	}

}
