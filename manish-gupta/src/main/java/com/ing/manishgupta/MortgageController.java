package com.ing.manishgupta;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MortgageController {

   
    @GetMapping(value = "/api/interest-rates")
    public List<MortgageRate> interestRates() {
        return MortgageRateConstant.getMortgageRates();
    }
    
    @PostMapping(value = "/api/mortgage-check")
    public MortgageResponse mortgageCheck(@RequestBody MortgageRequest request) {
    	MortgageResponse mortageResponse=new MortgageResponse();
    	double loanValue=request.getLoanValue();
    	double income=request.income;
    	double homeValue=request.homeValue;
    	int maturityPeriod=request.maturityPeriod;
    	
    	if(loanValue<=4*income && loanValue<=homeValue) {
    		mortageResponse.setFeasible(true);
    		mortageResponse.setMonthlyCost(loanValue/maturityPeriod);
    	}
    	else {
    		mortageResponse.setFeasible(false);
			mortageResponse.setMonthlyCost(0);
    	}
    	return mortageResponse;
    }
}