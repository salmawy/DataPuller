package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.masterData.Fridage2020;

@Repository
public interface FridageRepo extends CrudRepository<Fridage2020,Integer> {
}
