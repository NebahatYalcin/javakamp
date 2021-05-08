package _5_gun_Odevi.dataAccess.abstracts;



import java.util.List;

import _5_gun_Odevi.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
}
