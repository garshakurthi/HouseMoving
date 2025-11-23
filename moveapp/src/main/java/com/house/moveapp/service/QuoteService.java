package com.house.moveapp.service;
import com.house.moveapp.model.QuoteRequest;
import java.util.List;


public interface QuoteService {
	QuoteRequest createQuote(QuoteRequest quoteRequest);
	
    List<QuoteRequest> getAllQuotes();

}
