
public class Employee extends Member{
	private String specialization;
	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Employee(String specialization,String name, int age, int mob, String addr, double salary) {
		super(name, age, mob, addr, salary);
		// TODO Auto-generated constructor stub
		System.out.println("\n=================\n\nEmployee Specialization is: "+specialization+toString());
	}

	

//	private String name;
//	private double salary;
//	
//	public int getEmpId() {
//		return EmpId;
//	}
//	public void setEmpId(int empId) {
//		EmpId = empId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	public Employee(int empId, String name, double salary) {
//		EmpId = empId;
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public void getDetails()
//	{
//		System.out.println("\nEmployee Id is: "+EmpId+" Employee Name is: "+name+" And Salary is: "+salary);
//	}
}
