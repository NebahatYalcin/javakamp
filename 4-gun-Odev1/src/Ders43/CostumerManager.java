package Ders43;

public class CostumerManager {
	
	private ICostumerDal costumerDal;
	
	public CostumerManager(ICostumerDal costumerDal) {
		
		this.costumerDal = costumerDal;
	}

	public void add() {
		
		costumerDal.add();
	}
	
}
