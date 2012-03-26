package com.israbirding.drools;

import java.util.Date;

public class PromotionTrigger {

	private Date date;
	private String employeeId;

	public PromotionTrigger(Date date, String employeeId) {
		super();
		this.date = date;
		this.employeeId = employeeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
