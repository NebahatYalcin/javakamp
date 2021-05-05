package Concrete;

import Entity.Campaing;
import Interfaces.ICampaingService;

public class CampaingManager implements ICampaingService{

	@Override
	public void campaingadd(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"isimli kampanya eklenmiþtir.");
		
	}

	@Override
	public void campaingupdate(Campaing campaing,int campaingId, String campaingName, int campaingDiscount) {
		campaing.setCampaingId(campaingId);
		campaing.setCampaingName(campaingName);
		campaing.setCampaingDiscount(campaingDiscount);
		System.out.println(campaing.getCampaingName()+" isimli kampanya güncellenmiþtir.");
		
	}

	@Override
	public void campaingdelete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"isimli kampanya silinmiþtir.");
		
	}

}
