package Concrete;

import Entity.Gamer;
import Interfaces.IGamerCheckService;
import Interfaces.IGamerService;

public class GamerManager extends BaseGamerManager implements IGamerService{

	private IGamerCheckService ýgamercheckservice;
	
	

	public GamerManager(IGamerCheckService igamercheckservice) {
		super();
		ýgamercheckservice = igamercheckservice;
	}

	@Override
	public void register(Gamer gamer) {
		if(ýgamercheckservice.checkifrealperson(gamer)) {
			super.register(gamer);
		}
		else {
			System.out.println("Giriþ geçerli deðildir.");
		}
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstname()+" isimli kullanýcý giriþ yaptý.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstname()+" isimli kullanýcý silindi.");
		
	}

	

	
	
	
}
