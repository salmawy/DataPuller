package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.shopLoan.Loaner2020;

@Repository
public interface LoanerRepo extends CrudRepository<Loaner2020,Integer> {
}
