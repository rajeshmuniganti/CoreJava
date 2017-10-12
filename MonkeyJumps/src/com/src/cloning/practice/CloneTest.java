package com.src.cloning.practice;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeAddress address = new EmployeeAddress("101", "SNager", "Hyd");
		Employee emp = new Employee("Rajesh", 535, address);

		Employee empCloned = new Employee("Prany", 536, address);
		empCloned = (Employee) emp.clone();
		address.setCity("Bang");
		System.out.println(empCloned);
		System.out.println(emp);
	}
}
