package com.ing.manishgupta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MortgageController {

    @Autowired 
    MortgageService mortgageService;
	
    @GetMapping(value = "/api/interest-rates")
    public List<MortgageRate> interestRates() {
        return mortgageService.getMortgageRates();
    }
    
    @PostMapping(value = "/api/mortgage-check")
    public MortgageResponse mortgageCheck(@RequestBody MortgageRequest request) {
    	double loanValue=request.getLoanValue();
    	double income=request.getIncome();
    	double homeValue=request.getHomeValue();
    	int maturityPeriod=request.getMaturityPeriod();
    	return mortgageService.mortgageRequestEligibilityCheck(loanValue, income, maturityPeriod, homeValue);
    }
}