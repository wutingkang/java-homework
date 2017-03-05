package homework5;

public abstract class Employee {
	private String firstName, lastName, socialSecurityNumber;
	
	public Employee(String firstname, String lastname, String socialSecurityNumber){
		this.firstName = firstname;
		this.lastName = lastname;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public abstract int earning();
	
	public String getfirstName(){
		return this.firstName;
	}
	public void setfirstName(String newfirstname){
		this.lastName = newfirstname;
	}
	
	public String getlastName(){
		return this.lastName;
	}
	public void setlastName(String newlastName){
		this.lastName = newlastName;
	}
	
	
	public String getsocialSecurityNumber(){
		return this.socialSecurityNumber;
	}
	public void setsocialSecurityNumber(String socialSecurityNumber){
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString(){
		return firstName + "*" + lastName + "is a Employee";
	}
}