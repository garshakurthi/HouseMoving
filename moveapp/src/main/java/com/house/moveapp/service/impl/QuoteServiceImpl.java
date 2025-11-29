package com.house.moveapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.moveapp.model.QuoteRequest;
import com.house.moveapp.repository.QuoteRepository;
import com.house.moveapp.service.EstimateService;
import com.house.moveapp.service.QuoteService;
@Service
public class QuoteServiceImpl implements QuoteService{
    @Autowired
	 private QuoteRepository quoteRepo;
    @Autowired
    private EstimateService estimateService;
    
    public QuoteRequest createQuote(QuoteRequest req) {
    	  
    	 double estimatedPrice = estimateService.calculateEstimate(
                 req.getHouseSize(),
                 req.getDistanceMiles()
         );
    	 req.setEstimatedPrice(estimatedPrice);
         return quoteRepo.save(req);
    }
    @Override
    public List<QuoteRequest> getAllQuotes() {
        return quoteRepo.findAll();
    }
}
