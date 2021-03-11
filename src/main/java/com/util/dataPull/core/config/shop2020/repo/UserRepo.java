package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.userManagment.User;


@Repository
public interface UserRepo   extends CrudRepository<User,Integer> {
}
