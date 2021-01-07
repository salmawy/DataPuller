
package com.util.dataPull.core.shopservice;


import java.util.List;
import java.util.Map;

import javax.persistence.criteria.Order;

import com.util.dataPull.core.exception.DataBaseException;
import com.util.dataPull.core.exception.EmptyResultSetException;


public interface IBaseService
{

	List<Object> findAllBeans(Class<?> beanClass, Map params, Order order) throws DataBaseException,
			EmptyResultSetException;

	public List<Object> findAllBeansWithDepthMapping(Class<?> beanClass, Map<Object, Object> propertyMap);

	List findAllBeans(Class<?> beanClass) throws DataBaseException, EmptyResultSetException;
}