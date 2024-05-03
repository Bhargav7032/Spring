package com.ciq.bean;

public class EmployeeBean {

	private long eid;
	private String ename;
	private AddressBean addressBean;
	
	public void setEid(long eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	public void Display() {
		System.out.println("EMPLOYEEID:"+eid +" "+"ENAME:"+ename);
		addressBean.display();
	}
	
}
