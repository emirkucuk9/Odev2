
public class Gamer extends User{
   public int gamerId;
   public String email;
   public String firstName;
   public String lastName;
   public String nickName;
   
   
public Gamer(int gamerId, String email, String firstName, String lastName, String nickName, String identificationNumber, String dateOfBirth) {
    super(identificationNumber, firstName, lastName, dateOfBirth);
	this.gamerId = gamerId;
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nickName = nickName;
}








public int getGamerId() {
	return gamerId;
}


public void setGamerId(int gamerId) {
	this.gamerId = gamerId;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
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


public String getNickName() {
	return nickName;
}


public void setNickName(String nickName) {
	this.nickName = nickName;
}
    
}
