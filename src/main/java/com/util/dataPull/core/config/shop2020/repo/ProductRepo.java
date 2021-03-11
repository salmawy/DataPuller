package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.masterData.Product2020;

@Repository
public interface ProductRepo  extends CrudRepository<Product2020,Integer> {
}
