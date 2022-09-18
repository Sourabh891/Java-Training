
public class Member {
	private String name;
	private int age;
	private int mob;
	private String addr;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Member(String name, int age, int mob, String addr, double salary) {
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.addr = addr;
		this.salary = salary;
	}

	public void printSalary()
	{
		System.out.println("Salary of the member is: "+salary);
	}
	
	public String toString()
	{
		return " Emp Name: "+name+" Age: "+age+" Mobile: "+mob+" Address: "+addr+" and Salary: "+salary;
		
	}
}
