
public class Person implements ICompute {

	 private String name;
	   private double basicSal;
	   private double otRate;
	   private double otHrs;
	   private double netSal;
	   
	   
	   
	public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		this.netSal = netSal;
	}



	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}



}
