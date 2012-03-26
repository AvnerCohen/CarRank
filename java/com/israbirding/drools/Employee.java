package com.israbirding.drools;

import java.util.Date;

public class Employee {

	private String id;
	private String name;
	private String rank;
	private double baseSalery;
	private String carId;
	private Date lastPromotionDate;
	private String newRank;
	private String newSalary;
	private String newCar;

	public Employee(String id, String name, String rank, double baseSalery,
			String carId, Date lastPromotionDate, String newRank,
			String newSalary, String newCar) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.baseSalery = baseSalery;
		this.carId = carId;
		this.lastPromotionDate = lastPromotionDate;
		this.newRank = newRank;
		this.newSalary = newSalary;
		this.newCar = newCar;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalery() {
		return baseSalery;
	}

	public void setBaseSalery(double baseSalery) {
		this.baseSalery = baseSalery;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public Date getLastPromotionDate() {
		return lastPromotionDate;
	}

	public void setLastPromotionDate(Date lastPromotionDate) {
		this.lastPromotionDate = lastPromotionDate;
	}

	public String getNewRank() {
		return newRank;
	}

	public void setNewRank(String newRank) {
		this.newRank = newRank;
	}

	public String getNewSalary() {
		return newSalary;
	}

	public void setNewSalary(String newSalary) {
		this.newSalary = newSalary;
	}

	public String getNewCar() {
		return newCar;
	}

	public void setNewCar(String newCar) {
		this.newCar = newCar;
	}
}
