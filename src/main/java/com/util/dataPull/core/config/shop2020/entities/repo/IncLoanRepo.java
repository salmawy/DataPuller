package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.IncLoan2020;

@Repository
public interface IncLoanRepo  extends CrudRepository<IncLoan2020,Integer> {
}
