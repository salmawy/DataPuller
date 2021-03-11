package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.customers.Customer2020;

@Repository
public interface CustomerRepo extends CrudRepository<Customer2020,Integer> {
}
