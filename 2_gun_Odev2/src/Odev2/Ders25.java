package Odev2;

public class Ders25 {

	public static void main(String[] args) {
		String mesaj= sehirVer();
		System.out.println(mesaj);
		int sayi=topla(10, 12);
		System.out.println(sayi);
		ekle();
		sil();
		guncelle();
		

	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	
	public static String sehirVer() {
		
		return "Ankara";
	}
	
	public static int topla(int sayi1,int sayi2) {
		
		return sayi1+sayi2;
	}
	

}
