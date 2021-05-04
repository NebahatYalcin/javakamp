package Odev2;

public class Ders31 {

	public static void main(String[] args) {
		Ders31_Product product =new Ders31_Product();
		product.setId(1);
		product.setName("Lenova V14");
		product.setPrice(15000);
		product.setStockAmount(3);
		product.setDescription("Encapsulation");
		
		Ders31_ProductManager productManager=new Ders31_ProductManager();
		productManager.Add(product);

	}

}
