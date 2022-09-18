
public class Manager extends Member{
	
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Manager(String department,String name, int age, int mob, String addr, double salary) {
		super(name, age, mob, addr, salary);
		// TODO Auto-generated constructor stub
		System.out.println("\n=================\n\nManagers Department is: "+department+toString());
	}


}
