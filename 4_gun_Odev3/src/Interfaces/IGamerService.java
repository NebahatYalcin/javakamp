package Interfaces;

import Entity.Gamer;

public interface IGamerService {
	
	void register(Gamer gamer);
	void login(Gamer gamer);
	void delete(Gamer gamer);
	

}
