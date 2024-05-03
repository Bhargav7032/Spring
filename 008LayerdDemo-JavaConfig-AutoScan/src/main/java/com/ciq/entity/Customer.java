package com.ciq.entity;

public class Customer {
	private int Cid;
	private String Cname;
	private String CProduct;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String cProduct) {
		super();
		Cid = cid;
		Cname = cname;
		CProduct = cProduct;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCProduct() {
		return CProduct;
	}
	public void setCProduct(String cProduct) {
		CProduct = cProduct;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", CProduct=" + CProduct + "]";
	}
	
	

}
