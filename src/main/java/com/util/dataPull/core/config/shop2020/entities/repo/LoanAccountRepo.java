package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.LoanAccount2020;

@Repository
public interface LoanAccountRepo  extends CrudRepository<LoanAccount2020,Integer> {
}
