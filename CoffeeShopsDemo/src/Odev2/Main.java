package Odev2;


import Adapters.Mernis;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StartbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
	 	BaseCustomerManager customerManager=new StartbucksCustomerManager(new Mernis());
	 	Customer customer=new Customer();
	 	customer.setId(1);
	 	customer.setDateofBirth(1986);
	 	customer.setFirstName("Nebahat");
	 	customer.setLastName(" Yalçýn");
	 	customer.setNationalityId("13604836180");
	 	customerManager.save(customer);
	 	
	 	
	 	

	}

}
