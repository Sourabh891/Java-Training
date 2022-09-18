
public class Customer {
	private int customerId;
	private String name;
	public static final int X=100;
	public Customer() {
		
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getX() {
		return X;
	}
	public Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	public void getDetails()
	{
		System.out.println("Customer[customer Id: "+customerId+"customer Name: "+name+"]");
		
	}
	
}
