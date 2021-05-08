package _5_gun_Odevi.business.controls;

public class PasswordControls {
public boolean passwordControls(String password) {
	
	if(password.length()>=6) {
		return true;
	}
	System.out.println("Girilen password en az 2 karakter olmalıdır.");
	return false;
}
}
