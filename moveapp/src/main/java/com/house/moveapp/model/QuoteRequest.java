package com.house.moveapp.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class QuoteRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String pickupAddress;
    private String dropAddress;
    private double distanceMiles;
    private String houseSize;       // 1BHK, 2BHK, 3BHK
    private LocalDate movingDate;
    private String instructions;
    private Double estimatedPrice;
    
    @ManyToOne
    private Customer customer;
}
