package Ders38;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager =new CustomerManager(new DatabaseLogger());
		customerManager.add();
		

	}

}
