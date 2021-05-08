package _5_gun_Odevi.business.concretes;

import java.awt.List;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import _5_gun_Odevi.business.abstracts.UserService;

import _5_gun_Odevi.business.controls.EmailControls;
import _5_gun_Odevi.business.controls.NameControls;
import _5_gun_Odevi.business.controls.PasswordControls;
import _5_gun_Odevi.core.LoggerService;
import _5_gun_Odevi.dataAccess.abstracts.UserDao;
import _5_gun_Odevi.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private LoggerService loggerService;
	

	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	

	@Override
	public void register(User user) {
		System.out.println(user.getEmail()+" "+user.getFirstName()+" "+user.getLastName()+" "+user.getPassword());
		
		if((emailControls(user.getEmail()))&&(nameControls(user.getFirstName(), user.getLastName())&&(passwordControls(user.getPassword())))) {
			sendmail(user);
			checkIfValid();
			userDao.add(user);
		}
		
	}



	@Override
	public void log_in(String email,String password ){
		System.out.println(email+" kullanıcısı sisteme giriş yapmıştır.");
		
	}

	@Override
	public void sendmail(User user ) {			
			System.out.println(user.getEmail()+"  email adresine eposta gönderildi.");
			
		
	}

	@Override
	public void checkIfValid() {
			System.out.println("Doğrulama kodu onaylandı.");
		
	}

	
	public boolean emailControls(String email) {
		String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
        Matcher matcher =emailPath.matcher(email);
        if(matcher.find()==false){
            System.out.println("Girilen email geçerli değildir. Lütfen geçerli bir email giriniz.");
            System.exit(0);
        }
        return  true;
	}
	public boolean nameControls(String firstname,String lastname) {
		
		if((firstname.length()>=2)&&(lastname.length()>=2)) {
			return true;
		}
		System.out.println("Girilen ad ve soyad en az 2 karakterli olmalıdır.");
		return false;
	}
	public boolean passwordControls(String password) {
	
	if(password.length()>=6) {
		return true;
	}
	System.out.println("Girilen password en az 6 karakterli olmalıdır.");
	return false;
	}
	
	
      
	



	
	
	

}
