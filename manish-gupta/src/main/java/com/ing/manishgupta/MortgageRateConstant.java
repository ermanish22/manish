package com.ing.manishgupta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 
public class MortgageRateConstant {

	public static List<MortgageRate> getMortgageRates(){
		List<MortgageRate> mortgageRates =new ArrayList<MortgageRate>();
		mortgageRates.add(new MortgageRate(5,12,new Date()));
		mortgageRates.add(new MortgageRate(10,11,new Date()));
		mortgageRates.add(new MortgageRate(15,10,new Date()));
		mortgageRates.add(new MortgageRate(20,9,new Date()));
		mortgageRates.add(new MortgageRate(25,8,new Date()));
		return mortgageRates;
	}
	
}
