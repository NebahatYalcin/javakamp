package Interfaces;

import Entity.Campaing;

public interface ICampaingService {
	
	void campaingadd(Campaing campaing);
	void campaingupdate(Campaing campaing,int campaingId, String campaingName, int campaingDiscount);
	void campaingdelete(Campaing campaing);

}
