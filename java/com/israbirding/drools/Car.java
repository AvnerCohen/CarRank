package com.israbirding.drools;

public class Car {

	private String carId;
	private double carValue;

	public Car(String carId, double carValue) {
		super();
		this.carId = carId;
		this.carValue = carValue;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public double getCarValue() {
		return carValue;
	}

	public void setCarValue(double carValue) {
		this.carValue = carValue;
	}
}