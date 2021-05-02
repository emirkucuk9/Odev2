package odev2;
public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Emir");
		student1.setLastName("KÜÇÜK");
		student1.setEmail("emir.kucuk747@gmail.com");
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@gmail.com");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		
		
		
		userManager.registerUser(student1);
		userManager.loginUser(instructor1);
		studentManager.toBeİncluded(student1);
		instructorManager.Login(instructor1);
	}
}