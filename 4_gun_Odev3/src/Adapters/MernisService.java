package Adapters;

import java.rmi.RemoteException;

import Entity.Gamer;
import Interfaces.IGamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements IGamerCheckService{

	@Override
	public boolean checkifrealperson(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstname().toUpperCase(), gamer.getLastname().toUpperCase(), gamer.getDateofBirth());
		}  catch (RemoteException e) {
			return false;
		}
		}
}
