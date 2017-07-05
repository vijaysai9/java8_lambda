package java8_practice;

public class Employee {
	public String firstName;
	public String lastName;
	public String age;
	public String salary;
	
	public Employee(String fn, String ln, String n, String sal){
		firstName = fn;
		lastName = ln;
		age = n;
		salary = sal;
		
	}
	
	public String toString() {
		return lastName + ", " + firstName;
	}
	
}

