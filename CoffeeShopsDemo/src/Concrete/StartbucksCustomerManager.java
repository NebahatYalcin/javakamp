package Concrete;


import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;



public class StartbucksCustomerManager  extends BaseCustomerManager implements ICustomerService{

	private ICustomerCheckService customercheckservice;
	
	public StartbucksCustomerManager(ICustomerCheckService customercheckservice) {
		super();
		this.customercheckservice = customercheckservice;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customercheckservice.checkifrealperson(customer)) {
			super.save(customer);
			
		}
		else {
			System.out.println("Giriþ geçerli deðildir.");
		}
	}
	




	
	
}
