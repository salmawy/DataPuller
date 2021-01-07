package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.SellerLoanBag2020;

@Repository
public interface SellerLoanBagRepo  extends CrudRepository<SellerLoanBag2020,Integer> {
}
