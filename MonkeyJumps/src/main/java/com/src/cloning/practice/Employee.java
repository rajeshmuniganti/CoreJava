package com.src.cloning.practice;

public class Employee implements Cloneable {
	private String empName;
	private final int empID;
	private EmployeeAddress address;

	public Employee(String empName, int empID, EmployeeAddress address) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", address=" + address + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	public int getEmpID() {
		return empID;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
