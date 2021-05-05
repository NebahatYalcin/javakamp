package Entity;

public class Gamer {

	private int id;
	private String firstname;
	private String lastname;
	private int dateofBirth;
	private String nationalityId;
	private String email;
	
	
	public Gamer(int id, String firstname, String lastname, int dateofBirth, String nationalityId, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofBirth = dateofBirth;
		this.nationalityId = nationalityId;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(int dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
