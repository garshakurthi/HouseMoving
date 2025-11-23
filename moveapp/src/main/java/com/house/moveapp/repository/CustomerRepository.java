package com.house.moveapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.house.moveapp.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
