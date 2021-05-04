package Entities;



import Abstract.IEntitiy;

public class Customer implements IEntitiy{

		
	private int id;
	private String firstName;
	private String lastName;
	private int dateofBirth;
	private String nationalityId;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}
