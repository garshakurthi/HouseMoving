package com.house.moveapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.house.moveapp.service.EstimateService;


@RestController
@RequestMapping("/api/estimate")
public class EstimateController {
	@Autowired
	EstimateService estimateService;
	
	@GetMapping
	public double getEstimate(
            @RequestParam String houseSize,
            @RequestParam double distanceMiles ){
				return estimateService.calculateEstimate(houseSize, distanceMiles);
	}
	
}
