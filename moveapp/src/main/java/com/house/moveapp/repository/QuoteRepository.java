package com.house.moveapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.house.moveapp.model.QuoteRequest;

@Repository
public interface QuoteRepository extends JpaRepository<QuoteRequest,Long> {

}
