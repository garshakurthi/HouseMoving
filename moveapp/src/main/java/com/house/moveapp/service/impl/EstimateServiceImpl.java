package com.house.moveapp.service.impl;

import org.springframework.stereotype.Service;

import com.house.moveapp.service.EstimateService;

@Service
public class EstimateServiceImpl implements EstimateService
{

	
	public double calculateEstimate(String houseSize, double distanceMiles) 
    {
		
		double baseRate = switch (houseSize) 
		 {
        case "1BHK" -> 100;
        case "2BHK" -> 150;
        case "3BHK" -> 200;
        default -> 100;
         };
    double distanceRate = distanceMiles * 10; 
    
  
	
	return baseRate + distanceRate;
    }
	
}
