
public class Manager extends SalariedWorker {

	private double bonus;
	public Manager() 
	{
		bonus = 0.0;
	}
	Manager(String n, double s, double b)
	{
		name = n;
		salary_per_yr = s;
		bonus = b;
	}
	public double compute_pay()
	{
		return (salary_per_yr + bonus) / 52;
	}
	public double get_bonus() 
	{
		return bonus;
	}

}
