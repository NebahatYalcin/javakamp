package Ders39;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers= new BaseKrediManager[] {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		
		for (BaseKrediManager kredimanagers : krediManagers) {
			
			System.out.println(kredimanagers.hesapla(1000));
		}
	}

}
