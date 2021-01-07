package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.Income2020;

@Repository
public interface IncomeRepo  extends CrudRepository<Income2020,Integer> {
}
