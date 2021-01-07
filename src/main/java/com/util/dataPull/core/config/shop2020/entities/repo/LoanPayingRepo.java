package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.LoanPaying2020;

@Repository
public interface LoanPayingRepo  extends CrudRepository<LoanPaying2020,Integer> {
}
