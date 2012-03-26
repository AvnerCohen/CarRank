package com.israbirding.drools;

public class Rank {

	private String rankId;
	private double baseSalary;
	private String carId;
	private String nextRankId;

	public Rank(String rankId, double baseSalary, String carId, String nextRankId) {
		super();
		this.rankId = rankId;
		this.baseSalary = baseSalary;
		this.carId = carId;
		this.nextRankId = nextRankId;
	}

	public String getRankId() {
		return rankId;
	}

	public void setRankId(String rankId) {
		this.rankId = rankId;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getNextRankId() {
		return nextRankId;
	}

	public void setNextRankId(String nextRankId) {
		this.nextRankId = nextRankId;
	}
}
