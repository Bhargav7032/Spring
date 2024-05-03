package com.ciq.entity;

public class Employee {
	
	private int Eid;
	private String Ename;
	private double Esal;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double esal) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public double getEsal() {
		return Esal;
	}

	public void setEsal(double esal) {
		Esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esal=" + Esal + "]";
	}
	
	

}
