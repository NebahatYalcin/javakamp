package Entity;

public class Campaing {
	
	private int campaingId;
	private String campaingName;
	private int campaingDiscount;
	
	
	public Campaing(int campaingId, String campaingName, int campaingDiscount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDiscount = campaingDiscount;
	}
	
	public int getCampaingId() {
		return campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public int getCampaingDiscount() {
		return campaingDiscount;
	}
	public void setCampaingDiscount(int campaingDiscount) {
		this.campaingDiscount = campaingDiscount;
	}

}
