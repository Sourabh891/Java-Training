package org.example.collection.model;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee employee)
	{
		if(this.salary>employee.salary)
		{
			return -1;
		}
		else
		if(this.salary<employee.salary)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	

}
