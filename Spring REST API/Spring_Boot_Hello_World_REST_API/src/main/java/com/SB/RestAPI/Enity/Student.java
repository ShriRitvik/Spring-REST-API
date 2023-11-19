package com.SB.RestAPI.Enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SB_student")
public class Student {
	
	
	@Id
	private int id;
	
	private String fname;
	
	private String lname;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", "
				+ "fname=" + fname + ", "
						+ "lname=" + lname + "]";
	}
	
	
	

}
