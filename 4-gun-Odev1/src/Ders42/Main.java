package Ders42;

public class Main {

	public static void main(String[] args) {
		ICostumerDal costumerDal=new MysqlCustomerDal();
		costumerDal.add();

	}

}
