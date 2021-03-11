package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.customers.CustomerOrder2020;

@Repository
public interface CustomerOrderRepo extends CrudRepository<CustomerOrder2020,Integer> {
}
