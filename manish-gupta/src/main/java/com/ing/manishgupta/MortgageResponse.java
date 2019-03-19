package com.ing.manishgupta;

public class MortgageResponse {
	boolean isFeasible;
	double monthlyCost;

	public boolean isFeasible() {
		return isFeasible;
	}

	public void setFeasible(boolean isFeasible) {
		this.isFeasible = isFeasible;
	}

	public double getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
}
