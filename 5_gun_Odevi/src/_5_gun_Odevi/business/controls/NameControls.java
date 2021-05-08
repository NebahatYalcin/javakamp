package _5_gun_Odevi.business.controls;

public class NameControls {

	public boolean nameControls(String firstname,String lastname) {
		
		if((firstname.length()>=2)&&(lastname.length()>=2)) {
			return true;
		}
		System.out.println("Girilen ad ve soyad en az 2 karakter olmalıdır.");
		return false;
	}
}
