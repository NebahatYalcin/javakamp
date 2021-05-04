package Ders38;



public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	
	public void add() {
		System.out.println("Müþteri eklendi");
		logger.log("Log mesajý");
		
	}

}
