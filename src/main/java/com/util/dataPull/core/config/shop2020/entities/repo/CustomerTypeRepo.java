package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.CustomerType;

@Repository
public interface CustomerTypeRepo extends CrudRepository<CustomerType,Integer> {
}
