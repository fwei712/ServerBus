package com.bus.domain;

import java.util.Date;

public class BusLocation {

	private Integer id;
	
	private Integer busid;
	private Integer end;
	private Integer start;
	private Integer state;
	private java.util.Date recdate;
	private Double longitude;
	private Double latitude;
	private Float speed;
	private Float rotationangle;

	

	public BusLocation() {

	}

	public BusLocation(Integer busid, Integer end, Integer start,
			Integer state, Date recdate, Double longitude, Double latitude,
			Float speed, Float rotationangle) {

		this.busid = busid;
		this.end = end;
		this.start = start;
		this.state = state;
		this.recdate = recdate;
		this.longitude = longitude;
		this.latitude = latitude;
		this.speed = speed;
		this.rotationangle = rotationangle;

	}

	public Integer getBusid() {
		return busid;
	}

	public void setBusid(Integer busid) {
		this.busid = busid;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public java.util.Date getRecdate() {
		return recdate;
	}

	public void setRecdate(java.util.Date recdate) {
		this.recdate = recdate;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public Float getRotationangle() {
		return rotationangle;
	}

	public void setRotationangle(Float rotationangle) {
		this.rotationangle = rotationangle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
