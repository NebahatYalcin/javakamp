package Odev1;

public class Main {

	public static void main(String[] args) {
		MyCourses mycourses1 =new MyCourses(1, "Java Kamp", "Engin Demiroð");
		MyCourses mycourses2 = new MyCourses(2, "C# Kampý", "Engin Demiroð");
		MyCourses mycourses3 = new MyCourses(3, "Python", "Engin Demiroð");
		
		
		MyCourses[] myCourses= {mycourses1,mycourses2,mycourses3};
		
		for (MyCourses mycoursess : myCourses) {
			System.out.println("Eðitimin adý = "+mycoursess.course_name);
			System.out.println("Eðitmenin adý= "+mycoursess.instructor_name);
		}
		
		instructors inst1= new instructors(1, "Engin", "Demiroð");
		instructors inst2= new instructors(2, "Nebahat", "Yalçýn");
		 instructors[] instructors= {inst1,inst2};
		 for (instructors inst : instructors) {
			System.out.println("Eðitmenlerimiz= "+ inst.inst_name+" "+inst.inst_surname);
		}
		
		
		CourseManager courseManager =new CourseManager();
		courseManager.AddToCourse(mycourses1);
		courseManager.AddToCourse(mycourses2);
		courseManager.AddToCourse(mycourses3);
		
		
		instructorManager instructorManager =new instructorManager();
		instructorManager.AddToinstroctor(inst1);
		instructorManager.AddToinstroctor(inst2);
	}

}
