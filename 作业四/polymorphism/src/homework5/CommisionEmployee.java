package homework5;

public class CommisionEmployee extends Employee{
	//grossSales(销售额),commissionRate(提成比率)
	private int grossSales;
	private double commissionRate;
	
	public CommisionEmployee(String firstname, String lastname, String empSecNum, int grossSales, double commissionRate){
		super(firstname, lastname, empSecNum);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public int earning(){
	   return (int)(grossSales*commissionRate);
	}
	public double getcommissionRate(){
		return this.commissionRate;
	}
	public double getgrossSales(){
		return this.grossSales;
	}
	public void setcommissionRate(double commissionRate){
		this.commissionRate = commissionRate;
	}
	public void setgrossSales(int grossSales){
		this.grossSales = grossSales;
	}
		
	public String toString(){
		return getfirstName() + "*" + getlastName() + " is a CommisionEmployee" + "\n"
				+ "empSecNum = " + getsocialSecurityNumber() + "\n"
				+ "grossSales = " + getgrossSales() + "\n"
			    + "commissionRate = " + getcommissionRate() + "\n";
	} 
}
