package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.masterData.Store2020;

@Repository
public interface StoreRepo  extends CrudRepository<Store2020,Integer> {
}
