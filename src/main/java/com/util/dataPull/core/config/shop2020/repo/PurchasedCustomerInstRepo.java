package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.customers.PurchasedCustomerInst2020;

@Repository
public interface PurchasedCustomerInstRepo  extends CrudRepository<PurchasedCustomerInst2020,Integer> {
}
