package com.entity;

public class PoliceStations {

	private int stnid;
	private String stn_name;
	private String city;
	private String latlng;
	private String contact_no;
	
	public PoliceStations()
	{
		
	}

	public PoliceStations(int stnid, String stn_name, String city, String latlng, String contact_no) {
		super();
		this.stnid = stnid;
		this.stn_name = stn_name;
		this.city = city;
		this.latlng = latlng;
		this.contact_no = contact_no;
	}

	public PoliceStations(String stn_name, String city, String latlng, String contact_no) {
		super();
		this.stn_name = stn_name;
		this.city = city;
		this.latlng = latlng;
		this.contact_no = contact_no;
	}

	public int getStnid() {
		return stnid;
	}

	public void setStnid(int stnid) {
		this.stnid = stnid;
	}

	public String getStn_name() {
		return stn_name;
	}

	public void setStn_name(String stn_name) {
		this.stn_name = stn_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLatlng() {
		return latlng;
	}

	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "PoliceStations [stnid=" + stnid + ", stn_name=" + stn_name + ", city=" + city + ", latlng=" + latlng
				+ ", contact_no=" + contact_no + "]";
	}

	
		
		
	


	
}
