package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.ContractorAccountDetail2020;

@Repository
public interface ContractorAccountDetailRepo extends CrudRepository<ContractorAccountDetail2020,Integer> {
}
