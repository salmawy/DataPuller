package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.shopLoan.PayCredit;

@Repository
public interface IPayCreditRepo  extends CrudRepository<PayCredit,Integer> {
}


