package interfaceAbstractDemo;

public class Main {
	public static void main(String[] args) {
		
	
 BaseCustomerManager customerManager = new BaseCustomerManager();
 Customer customer = new Customer(1,"Emir","KÜÇÜK", "2002", "12345678911");
 customerManager.Save(customer);
	}
	
}
