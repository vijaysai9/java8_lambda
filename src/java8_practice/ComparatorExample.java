package java8_practice;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class ComparatorExample {
		
		public static void main(String[] args){
			ArrayList<Employee> Employees = new ArrayList<Employee>();
			Employees.add(new Employee("vijay", "sai", "24", "50000") );
			Employees.add(new Employee("abc", "lambda", "18", "70007") );
			Employees.add(new Employee("xyz", "lam", "30", "60000") );
			
			ArrayList<Employee> Employees2 = (ArrayList<Employee>) Employees.clone();
			
			
			Comparator<Employee> c1 = new Comparator<Employee>() {
				public int compare(Employee p1, Employee p2) {
					return p1.lastName.compareTo(p2.lastName);
				}
			};
			Collections.sort(Employees, c1);
			System.out.println("current employees");
			System.out.println(Employees);
			
			
			System.out.println("sorting based on last name");
			Comparator<Employee> c2 = (Employee p1, Employee p2) -> p1.lastName.compareTo(p2.lastName);
			Collections.sort(Employees2, c2);
			System.out.println(Employees2);
			System.out.println("sorting based on first name");
			Comparator<Employee> c3 = (Employee p1, Employee p2) -> p1.firstName.compareTo(p2.firstName);
			Collections.sort(Employees2, c3);
			System.out.println(Employees2);
			System.out.println("based on age");
			Comparator<Employee> c4 = (Employee p1, Employee p2) -> p1.age.compareTo(p2.age);
			Collections.sort(Employees2, c4);
			System.out.println(Employees2);
			System.out.println("based on salary");
			Comparator<Employee> c5 = (Employee p1, Employee p2) -> p1.salary.compareTo(p2.salary);
			Collections.sort(Employees2, c5);
			System.out.println(Employees2);
	        
		}
	}




