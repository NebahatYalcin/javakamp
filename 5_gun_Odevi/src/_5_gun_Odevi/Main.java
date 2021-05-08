package _5_gun_Odevi;

import _5_gun_Odevi.business.abstracts.UserService;
import _5_gun_Odevi.business.concretes.UserManager;
import _5_gun_Odevi.core.JLoggerManagerAdapter;
import _5_gun_Odevi.dataAccess.concretes.HibernateUserDao;
import _5_gun_Odevi.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1, "Nebahat", "Yalçýn","nebahatbalci34@gmail.com", "123456");
		UserService userService= new UserManager(new HibernateUserDao(), new JLoggerManagerAdapter() );
			
			userService.register(user1);
			userService.log_in(user1.getEmail(),user1.getPassword());
			
		}

	

}
