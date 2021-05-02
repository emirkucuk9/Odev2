package odev2;

public class Instructor extends User {
    String InstructorDescription;
    
    public Instructor() {
    	
    }
    public Instructor(int id, String FirtName, String LastName, String UserName, String Email, String password, String instructorDescription) {
    	
    }
	public String getInstructorDescription() {
		return InstructorDescription;
	}
	public void setInstructorDescription(String instructorDescription) {
		InstructorDescription = instructorDescription;
	}
}
