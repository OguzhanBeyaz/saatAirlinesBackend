package com.java.product.Entity;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "route")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="route_id", unique = true, nullable = false, length = 32)
	private int id;
	
	@OneToOne(cascade = CascadeType.MERGE)	
	 @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Airport source;
	 @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	@OneToOne(cascade = CascadeType.MERGE)
	private Airport destination;
	
	@Column(name="distanceInMiles")
	private String distanceInMiles;	
	
	@Column(name="deleteStatus")
	private boolean deleteStatus;
	

	
	
	public Route() {};
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Airport getSource() {
		return source;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination (Airport destination) {
		this.destination  = destination;
	}
	
	public String getDistanceInMiles () {
		return distanceInMiles;
	}

	public void setDistanceInMiles (String distanceInMiles) {
		this.distanceInMiles  = distanceInMiles;
	}
	
	public boolean getdeleteStatus () {
		return deleteStatus;
	}

	public void setdeleteStatus (boolean deleteStatus) {
		this.deleteStatus  = deleteStatus;
	}

	
	public Route(int id, Airport source, Airport destination, String distanceInMiles, boolean deleteStatus) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.distanceInMiles = distanceInMiles;
		this.deleteStatus = deleteStatus;
		
	
	}
	


}
