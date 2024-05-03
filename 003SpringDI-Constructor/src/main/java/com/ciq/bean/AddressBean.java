package com.ciq.bean;

public class AddressBean {
	private long aid;
	private String aloc;
	
	
	
	public AddressBean(long aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}


	public void display() {
		System.out.println("AreaId:"+aid +" "+ "AreaLocation:"+aloc);
		
	}
	

}
