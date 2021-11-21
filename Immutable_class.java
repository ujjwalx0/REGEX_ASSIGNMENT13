final class Customer {
	private final String Name;
	private final String customer_Id;
	
	public Customer(String Name, String customer_Id) {
		this.Name= Name;
		this.customer_Id = customer_Id;
	}
		public String toString() {
			return Name;}
		
		

}		
public class Immutable_class {

	public static void main(String[] args) {
	Customer c= new Customer("john","123ABC");
	System.out.println(c);
//	Customer c1=c.Modify("james","12445df");
//	System.out.println(c1);
//	System.out.println(c.equals(c1));
	}

	

}			
		


