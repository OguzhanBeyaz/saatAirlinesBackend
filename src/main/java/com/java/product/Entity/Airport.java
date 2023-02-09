package com.java.product.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "airport")

public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="airport_id", unique = true, nullable = false, length = 32)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;	
	
	@Column(name="deleteStatus")
	private boolean deleteStatus;
	
	
	
	
	public Airport() {}

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

	public String getCode () {
		return code;
	}

	public void setCode (String code) {
		this.code  = code;
	}
	
	public String getCity () {
		return city;
	}

	public void setCity (String city) {
		this.city  = city;
	}
	
	public String getCountry () {
		return country;
	}

	public void setCountry (String country) {
		this.country  = country;
	}
	
	public boolean getdeleteStatus () {
		return deleteStatus;
	}

	public void setdeleteStatus (boolean deleteStatus) {
		this.deleteStatus  = deleteStatus;
	}

	
	public Airport(int id, String name, String code, String city, String country, boolean deleteStatus) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.city = city;
		this.country = country;
	    this.deleteStatus = deleteStatus;
	}

}
