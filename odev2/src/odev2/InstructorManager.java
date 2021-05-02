package odev2;

public class InstructorManager {
   public void add(Instructor instructor) {
	   System.out.println(instructor.getFirstName()+"Eklendi");
   }
   public void Register(Instructor instructor) {
	   System.out.println(instructor.getFirstName()+"Kayýt olundu");
   }
   public void Login(Instructor instructor) {
	 System.out.println(instructor.getFirstName()+" Giriþ yapýldý");  
   }
}
