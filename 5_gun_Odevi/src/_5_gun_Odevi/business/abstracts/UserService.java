package _5_gun_Odevi.business.abstracts;



import _5_gun_Odevi.entities.concretes.User;

public interface UserService {

	public void register(User user);
	public void log_in(String email, String password);
	public void sendmail(User user);
	public void checkIfValid();
	 
}
