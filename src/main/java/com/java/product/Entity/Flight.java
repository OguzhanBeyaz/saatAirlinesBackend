package com.java.product.Entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import sabitler.statusValues;
@Data
@Entity
@Table(name = "flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flight_id", unique = true, nullable = false, length = 32)
	private int id;
	
	@Column(name="flightNumber")
	private String flightNumber;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "route_id")
	 @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Route route;
	
	@Column(name="price")
	private int price;
	
	@Temporal(TemporalType.DATE)
	@Column(name="departureTime")
	private Date departureTime;
	
	@Temporal(TemporalType.DATE)
	@Column(name="arrivalTime")
	private Date arrivalTime;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="status")
	private statusValues status;
	
	@Column(name="deleteStatus")
	private boolean deleteStatus;
	
	
   public Flight() {
	   System.out.println("Dates Checked");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Route getRoute () {
		return route;
	}

	public void setRoute (Route route) {
		this.route  = route;
	}
	
	public int getPrice () {
		return price;
	}

	public void setCity (int price) {
		this.price  = price;
	}
	
	public Date getDepartureTime () {
		return departureTime;
	}
        
	public void setDepartureTime (Date departureTime) {
		this.departureTime  = departureTime;
	}
	
	public Date getArrivalTime () {
		return arrivalTime;
	}

	public void setArrivalTime (Date arrivalTime) {
		this.arrivalTime  = arrivalTime;
	}
	
	public int getCapacity () {
		return capacity;
	}

	public void setCapacity (int capacity) {
		this.capacity  = capacity;
	}
	
	public statusValues getStatus() {
		return status;
	}

	public void setStatus (statusValues scheduled) {
		this.status  = scheduled;
	}
	
	
	public boolean getdeleteStatus () {
		return deleteStatus;
	}

	public void setdeleteStatus (boolean deleteStatus) {
		this.deleteStatus  = deleteStatus;
	}
	
	public Flight(int id, String flightNumber, Route route, int price, Date departureTime,
			Date arrivalTime, int capacity, statusValues status, boolean deleteStatus) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.route = route;
		this.price = price;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.capacity = capacity;
		this.status = status;
		this.deleteStatus = deleteStatus;
	
	}
	


	
	


}
