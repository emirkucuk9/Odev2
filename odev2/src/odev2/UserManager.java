package odev2;

public class UserManager {
    public void registerUser(User user) {
    	System.out.println(user.Email+ "kayıt başarılı");
    	
    }
    
    public void loginUser(User user) {
    	System.out.println(user.FirstName+user.LastName+" "+"Giriş yapıldı");
    }
}

