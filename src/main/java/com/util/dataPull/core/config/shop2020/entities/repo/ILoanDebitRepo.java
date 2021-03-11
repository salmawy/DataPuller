package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.shopLoan.LoanDebit;

@Repository
public interface ILoanDebitRepo  extends CrudRepository<LoanDebit,Integer> {
}