public class Driver {
	public static void main(String[] args){
		Worker w = new Worker("Walter", 70113, "sales", 123456789);
		HourlyWorker h = new HourlyWorker("Helen", 11.50, 10);
		SalariedWorker s = new SalariedWorker("Sam", 100000);
		Manager	m = new Manager("Michelle", 500000, 200);
		System.out.print(w.getName() + " made $" + w.compute_pay() + '\n' + '\n');
			
		Worker[] team = new Worker[4];
		team[0] = w;
		team[1] = h;
		team[2] = s;
		team[3] = m;
			
		for(int i = 0; i < team.length; ++i)
		{
			w.toString(team[i]);
		}
	}
}
