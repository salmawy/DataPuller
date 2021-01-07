
package com.util.dataPull.core.service;


import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Order;

import com.util.dataPull.core.exception.DataBaseException;
import com.util.dataPull.core.exception.EmptyResultSetException;


public interface IBaseService
{

	List<Object> findAllBeans(Class<?> beanClass, Map params, Order order,EntityManager entityManager) throws DataBaseException,
			EmptyResultSetException;

	public List<Object> findAllBeansWithDepthMapping(Class<?> beanClass, Map<Object, Object> propertyMap,EntityManager entityManager);

	List findAllBeans(Class<?> beanClass,EntityManager entityManager) throws DataBaseException, EmptyResultSetException;

	void addEditBean(Object newBean, EntityManager entityManager);
}