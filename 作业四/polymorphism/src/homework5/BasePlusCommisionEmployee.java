package homework5;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	private int baseSalary;//（月基本工资）
	
	public BasePlusCommisionEmployee(String firstname, String lastname, String empSecNum, int grossSales, double commissionRate, int baseSalary){
		super(firstname, lastname, empSecNum, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	public int earning(){
		return (int)(getgrossSales()*getcommissionRate() + baseSalary);
	}
	public double getbaseSalary(){
		return this.baseSalary;
	}
	public void setbaseSalary(int baseSalary){
		this.baseSalary = baseSalary;
	}
		
			
	public String toString(){
		return getfirstName() + "*" + getlastName() + " is a BasePlusCommisionEmployee" + "\n"
			   + "empSecNum = " + getsocialSecurityNumber() + "\n"
			   + "grossSales = " + getgrossSales() + "\n"
			   + "commissionRate = " + getcommissionRate() + "\n"
			   + "baseSalary = " + getbaseSalary() + "\n";
	} 
}
