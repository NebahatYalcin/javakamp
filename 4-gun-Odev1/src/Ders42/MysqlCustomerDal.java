package Ders42;

public class MysqlCustomerDal implements ICostumerDal , IRepository{

	@Override
	public void add() {
		System.out.println("MySql eklendi.");
		
	}

}
