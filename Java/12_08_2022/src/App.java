
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee em = new Employee(1256,"John Doe",20000);
		em.getDetails();
		int x=10;
		
		Integer y=new Integer(x);
		
		int result =y.intValue();
		
		System.out.println("Result is: "+result);
		*/
//		Customer c = new Customer(1201,"Sourabh Shinde");
//		c.getDetails();
////		RegularCustomer r = new RegularCustomer();
//		r.displayDetais();
//		MyDate mydate=new MyDate(15,8,2022);
//		mydate.getDate();
		Member member=new Member("Sourabh",23,96075,"Kolhapur",20000);
		member.printSalary();
		
		new Employee("Artificial Intelligence,", "Rahul,", 23, 93716, "Sangli", 15000);
		
		new Manager("Human Resource,", "Arjun,", 26, 89564, "Pune", 30000);
	}
}
