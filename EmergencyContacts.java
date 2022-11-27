package com.entity;

public class EmergencyContacts {
	
	private int contactid;
	private String userid;
	private String contactname;
	private String mobileno;

	public EmergencyContacts()
	{
		
	}

	public EmergencyContacts(int contactid, String userid, String contactname, String mobileno) {
		super();
		this.contactid = contactid;
		this.userid = userid;
		this.contactname = contactname;
		this.mobileno = mobileno;
		
	}

	public EmergencyContacts(String userid, String contactname, String mobileno) {
		super();
		this.userid = userid;
		this.contactname = contactname;
		this.mobileno = mobileno;
		
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "EmergencyContacts [contactid=" + contactid + ", userid=" + userid + ", contactname=" + contactname
				+ ", mobileno=" + mobileno + "]";
	}
	
}
