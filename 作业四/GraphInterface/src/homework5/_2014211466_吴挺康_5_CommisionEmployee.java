package homework5;

public class _2014211466_��ͦ��_5_CommisionEmployee extends _2014211466_��ͦ��_5_Employee{
	//grossSales(���۶�),commissionRate(��ɱ���)
	private int grossSales;
	private double commissionRate;
	
	public _2014211466_��ͦ��_5_CommisionEmployee(String firstname, String lastname, String empSecNum, int grossSales, double commissionRate){
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
