package Ders45;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.id=1;
		product.price=10;
		product.name="mouse";
		manager.add(product);
		
		 //InnerClass
		DatabaseHelper.Crud.update();  
		DatabaseHelper.Crud.update();
		DatabaseHelper.Connection.createcaonnection();
		

	}

}
