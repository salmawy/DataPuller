package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.sales.SellerOrderWeight2020;

@Repository
public interface SellerOrderWeightRepo  extends CrudRepository<SellerOrderWeight2020,Integer> {
}
