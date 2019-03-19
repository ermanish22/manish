package com.ing.manishgupta;

import java.util.Date;

public class MortgageRate {

	int maturityPeriod;
	double interestRate;
	Date lastUpdate;
	
	public MortgageRate(int maturityPeriod,double interestRate,Date lastUpdate) {
		this.maturityPeriod=maturityPeriod;
		this.interestRate=interestRate;
		this.lastUpdate=lastUpdate;
	}
	public int getMaturityPeriod() {
		return maturityPeriod;
	}
	public void setMaturityPeriod(int maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
