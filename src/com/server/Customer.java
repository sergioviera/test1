package com.server;

import java.util.Date;

public class Customer {
	
	private long id;
	private String name;
	private String address;
	private Date lastVisit;
	private Date birthday;
	
	
	public Customer(){
		name = RandomData.name();
		address = RandomData.address();
	}

	public String toString(){
		return "Cliente: " + name + " que vive en " + address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}