package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.expanses.OutcomeType2020;

@Repository
public interface OutcomeTypeRepo  extends CrudRepository<OutcomeType2020,Integer> {
}
