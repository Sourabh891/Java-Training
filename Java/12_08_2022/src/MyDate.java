
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public void getDate()
	{
		System.out.println("Todays Date is: "+day+" / "+month+" / "+year);
	}
}
