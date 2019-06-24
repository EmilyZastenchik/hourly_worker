
public class HourlyWorker extends Worker {
	
	private double payRate;
	private double hours;
	//private double salary;
	public HourlyWorker() {
		name = " ";
		payRate = 0.0;
		hours = 0.0;
	}
	public HourlyWorker(String n, double pr, double h)
	{
		name = n;
		payRate = pr;
		hours = h;
	}
	/**
		calculates the weekly pay = payRate * hours
		*/
	public double compute_pay()
	{
		return payRate * hours;	
	}
	public double get_payRate() 
	{
		return payRate;
	}
    public double get_hours() 
    {
    	return hours;
    }
	
}
