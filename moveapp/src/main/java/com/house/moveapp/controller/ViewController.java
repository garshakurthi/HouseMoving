package com.house.moveapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ViewController {
	
	
	 @GetMapping("/")
	    public String home() {
	        return "index";
	    }

	    @GetMapping("/estimate")
	    public String estimatePage() {
	        return "estimate";
	    }

	    @GetMapping("/quote")
	    public String quotePage() {
	        return "quote";
	    }

}
