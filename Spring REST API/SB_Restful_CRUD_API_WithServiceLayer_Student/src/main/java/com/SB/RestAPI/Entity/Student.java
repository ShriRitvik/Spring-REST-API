package com.SB.RestAPI.Entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="sbs")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private String descrption;

	private String imageUrl;

	private boolean active;
  
	@CreationTimestamp
	private Date dateCreated;
   
	@UpdateTimestamp
	private Date lastUpdated;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String descrption, String imageUrl, boolean active, Date dateCreated,
			Date lastUpdated) {
		super();
		this.name = name;
		this.descrption = descrption;
		this.imageUrl = imageUrl;
		this.active = active;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
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

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	

}
