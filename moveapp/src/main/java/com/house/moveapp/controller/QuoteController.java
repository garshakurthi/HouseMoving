package com.house.moveapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.house.moveapp.model.QuoteRequest;
import com.house.moveapp.service.QuoteService;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {
	   @Autowired
	private QuoteService quoteService;
	   
	   @PostMapping
	    public ResponseEntity<QuoteRequest>createQuote(@RequestBody QuoteRequest quoteRequest) {
	        return ResponseEntity.ok(quoteService.createQuote(quoteRequest));
	    }

	   @GetMapping
	    public List<QuoteRequest> getAllQuotes() {
	        return quoteService.getAllQuotes();
	    }
}
