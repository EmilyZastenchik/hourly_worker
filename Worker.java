public class Worker {
	protected String name;
	protected int compid;
	protected String dept;
	protected int ssnum;
	public Worker()
	{
		name = " ";
		compid = 0;
		dept = " ";
		ssnum = 0;
	}
	public Worker(String name, int compid, String dept, int ssnum)
	{
		this.name = name;
		this.compid = compid;
		this.dept = dept;
		this.ssnum =ssnum;
	}
	public double compute_pay() {
		 return 0.0;
	}
	public String getName() 
	{
	  return name;
	}
	public int getCompID() 
	{
	  return compid;    
	}    
	public String getDepartment() 
	{
	  return dept;
	}       
	
	public int getSocialSecurityNumber() 
	{
	  return ssnum;
	} 
	 
	public void toString (Worker w)
	{
		System.out.println( "Name: " + w.getName() + '\t' + "Weekly Pay: $ "
		+ w.compute_pay() + '\n'); 	
	}
	
}





