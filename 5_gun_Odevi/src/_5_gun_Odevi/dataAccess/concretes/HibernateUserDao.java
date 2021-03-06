package _5_gun_Odevi.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import _5_gun_Odevi.dataAccess.abstracts.UserDao;
import _5_gun_Odevi.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" kullanıcı sisteme kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" kullanıcı güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullanıcı silindi.");
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	

}
