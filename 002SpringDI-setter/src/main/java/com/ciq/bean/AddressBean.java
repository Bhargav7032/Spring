package com.ciq.bean;

public class AddressBean {
	private long aid;
	private String aloc;
	
	public void setAid(long aid) {
		this.aid = aid;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	public void display() {
		System.out.println("AreaId:"+aid +" "+ "AreaLocation:"+aloc);
		
	}
	

}
