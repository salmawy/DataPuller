package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.sales.Seller2020;

@Repository
public interface SellerRepo  extends CrudRepository<Seller2020,Integer> {
}
