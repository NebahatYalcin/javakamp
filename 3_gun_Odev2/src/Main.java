
public class Main {

	public static void main(String[] args) {

		Instructor instructor=new Instructor();
		Instructor instructor2=new Instructor();
		Student student=new Student();
		Student student2=new Student();
		instructor.setId(1);
		instructor.setFirstname("Engin");
		instructor.setLastname("Demiroğ");
		instructor.setEmail("engindemiog@gmail.com");
		instructor.setPassword("123456");
		
		instructor.setId(2);
		instructor2.setFirstname("Ali");
		instructor2.setLastname("Atak");
		instructor2.setEmail("aliatak@gmail.com");
		instructor2.setPassword("123456");
		
		student.setId(1);
		student.setFirstname("Nebahat");
		student.setLastname("Yalçın");
		student.setEmail("nebahatbalci34@gmail.com");
		student.setPassword("678901");
		
		student.setId(2);
		student2.setFirstname("İsmail");
		student2.setLastname("Yalçın");
		student2.setEmail("ismailyalcin@gmail.com");
		student2.setPassword("678901");
		
		
		
		
		
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		System.out.println("----------------------------------");
		studentManager.add(student);
		studentManager.add(student2);
		
		

	}

}
