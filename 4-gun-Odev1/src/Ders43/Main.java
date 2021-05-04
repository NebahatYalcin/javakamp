package Ders43;

public class Main {

	public static void main(String[] args) {
		CostumerManager costumerManager=new CostumerManager(new OracleCustomerDal());
		
		costumerManager.add();
		
	}

}
