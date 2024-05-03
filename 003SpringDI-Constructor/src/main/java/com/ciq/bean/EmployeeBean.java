package com.ciq.bean;

public class EmployeeBean {

	private long eid;
	private String ename;
	private AddressBean addressBean;
	
	
	public EmployeeBean(long eid, String ename, AddressBean addressBean) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addressBean = addressBean;
	}


	public void Display() {
		System.out.println("EMPLOYEEID:"+eid +" "+"ENAME:"+ename);
		addressBean.display();
	}
	
}
