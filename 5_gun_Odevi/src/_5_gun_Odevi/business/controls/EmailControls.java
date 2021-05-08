package _5_gun_Odevi.business.controls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailControls {

	public boolean emailControls(String email) {
		String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
        Matcher matcher =emailPath.matcher(email);
        if(matcher.find()==false){
            System.out.println("Girilen email geçerli deðildir. Lütfen geçerli bir email giriniz.");
            
        }
        return  true;
	}
}
