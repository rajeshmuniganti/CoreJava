package com.system.variables;

public class Student {
	private int sId;
	private String sName;
	private String sAddr;
	
	public Student(int sId, String sName, String sAddr) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddr = sAddr;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

}
