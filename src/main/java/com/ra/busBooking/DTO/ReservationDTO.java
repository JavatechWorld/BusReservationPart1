package com.ra.busBooking.DTO;

import java.sql.Date;

public class ReservationDTO {

	
	private Date filterDate;
	
	private String to;
	
	private String from;


	public Date getFilterDate() {
		return filterDate;
	}

	public void setFilterDate(Date filterDate) {
		this.filterDate = filterDate;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	
	
}
