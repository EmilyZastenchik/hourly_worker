
public class SalariedWorker extends Worker {

	protected double salary_per_yr;
	public SalariedWorker() 
	{
		name = " ";
		salary_per_yr = 0.0;
	}	
	public SalariedWorker(String n, double s)
	{
		name = n;
		salary_per_yr = s;
	}
	public double compute_pay() 
	{
		return salary_per_yr / 52;	
	}
	public double get_salary_per_yr() 
	{
		return salary_per_yr;
	}

}
