package main;
import java.util.ArrayList;

import lib.*;

public class EmployeeRegister {

	public static void main(String[] args) {
		ArrayList<Employee> employees  = new ArrayList<Employee>();

		employees.add(new Employee(new Name("Savvas", "Polydorou"), new Date(7,11,2000), Gender.Male,
				new Salary(1850.50, new Date(30,12,2019))));
		employees.add(new Employee(new Name("Stavros", "Michael"), new Date(14,9,2000), Gender.Male
				, new Salary(1550, new Date(30,12,2019))));
		employees.add(new Employee(new Name("Demetris", "Theodorou"), new Date(4,8,2000), Gender.Male
				,new Salary(2000.50, new Date(30,12,2019))));
		employees.add(new Employee(new Name("Kosmina", "Koumi"), new Date(11,5,2001), Gender.Female
				, new Salary(2550, new Date(30,12,2019))));
		employees.add(new Employee(new Name("Natasha", "Maximoff"), new Date(12,3,1996), Gender.Female
				, new Salary(1920, new Date(30,12,2019))));

		int counter = 1;
		System.out.println("Listing all employees");
		for(Employee e : employees)
		{
			System.out.println(counter + " " + e.toString());
			counter++;
		}
		System.out.println();
		System.out.println("Changing some salaries");
		employees.get(0).setSalary(2350.0);
		employees.get(1).setSalary(1950.5);
		System.out.println(employees.get(0));
		System.out.println(employees.get(1));
		
		System.out.println();
		System.out.println("Adding benefits to salary");
		employees.get(0).addBenefits(500);
		System.out.println(employees.get(0));
		
		System.out.println();
		System.out.println("Changing date of payment");
		employees.get(0).getSalary().changePaymentDate(new Date(1,1,2020));
		System.out.println(employees.get(0));
		
		
		
	}

}
