package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String address;
	private long mobno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public Student(int id, String name, String address, long mobno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobno = mobno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
