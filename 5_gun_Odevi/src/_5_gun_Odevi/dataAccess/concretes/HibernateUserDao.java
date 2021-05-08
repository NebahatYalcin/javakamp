package _5_gun_Odevi.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import _5_gun_Odevi.dataAccess.abstracts.UserDao;
import _5_gun_Odevi.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" kullanýcý sisteme kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" kullanýcý güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullanýcý silindi.");
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	

}
