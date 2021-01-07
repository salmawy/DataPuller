package com.util.dataPull.core.service.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import com.util.dataPull.core.exception.DataBaseException;
import com.util.dataPull.core.exception.EmptyResultSetException;

public interface IBaseDao {
    List<Object> findAllBeansWithDepthMapping(Class<?> beanClass, Map<Object, Object> propertyMap,EntityManager entityManager)
                throws DataBaseException, EmptyResultSetException;

    public List<Object> findAllBeans(Class<?> beanClass, Map<String, Object> params , List<Object> nOrder, int fromRecord, int maxResult,EntityManager entityManager) throws DataBaseException, EmptyResultSetException ;

	void insertOrUpdateBean(Object newBean, EntityManager entityManager) throws DataBaseException;
    }
