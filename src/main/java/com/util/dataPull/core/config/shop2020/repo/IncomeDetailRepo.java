package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.expanses.IncomeDetail2020;

@Repository
public interface IncomeDetailRepo  extends CrudRepository<IncomeDetail2020,Integer> {
}
