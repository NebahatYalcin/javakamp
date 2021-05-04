
public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Emploee employee=new Emploee();
		
		CostumerManager costumerManager=new CostumerManager();
		EmployeeManager employeeManager =new EmployeeManager();
		
		costumerManager.add();
		costumerManager.list();
		
		employeeManager.add();
		employeeManager.list();
		employeeManager.bestEmployee();
		

	}

}
