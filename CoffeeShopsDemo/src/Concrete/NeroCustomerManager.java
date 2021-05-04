package Concrete;


import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi : "+customer.getFirstName());
		
	}

}
