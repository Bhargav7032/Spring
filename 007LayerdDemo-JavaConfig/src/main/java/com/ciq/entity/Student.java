package com.ciq.entity;

public class Student {

	
	private long Sid;
	private String Sname;
	private double Sfee;
	private String Sloc;
	
	public Student() {
	}
	public Student (long sid,String sname,double sfee,String sloc) {
		this.Sfee=sid;
		this.Sname=sname;
		this.Sfee=sfee;
		this.Sloc=sloc;
	}
	public long getSid() {
		return Sid;
	}
	public void setSid(long sid) {
		Sid = sid;
	}
	
	public void setSname(String sname) {
		Sname=sname;
		
	}
	
	public String getSname() {
		return Sname;
	}
	
	public void setSfee(double sfee) {
		Sfee=sfee;
	}
	
	public double getSfee() {
		return Sfee;
		
	}
	public void setSloc(String sloc) {
		Sloc=sloc;
		
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sfee=" + Sfee + ", Sloc=" + Sloc + "]";
	}
	
	
}
