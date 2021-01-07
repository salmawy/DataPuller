package com.util.dataPull.core.service.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.util.dataPull.core.exception.DataBaseException;
import com.util.dataPull.core.exception.EmptyResultSetException;
import com.util.dataPull.core.service.IBaseService;
import com.util.dataPull.core.service.dao.IBaseDao;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@SuppressWarnings("unchecked")
@Slf4j
@Service
@Getter
public class BaseService implements IBaseService
{

    public IBaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Autowired
    IBaseDao  baseDao;
    @Override
    public List<Object> findAllBeans(Class<?> beanClass, Map params, Order order,EntityManager entityManager) throws DataBaseException,
            EmptyResultSetException {
        List<Object> nOrder = new ArrayList<Object>();
        if (order != null)
            nOrder.add(order);

        List<Object> nExpression = new ArrayList<Object>();
        String key;


        return this.getBaseDao().findAllBeans(beanClass, params, nOrder, 0, 0,entityManager);
    }

    @Override
    public List<Object> findAllBeansWithDepthMapping(Class<?> beanClass, Map<Object, Object> propertyMap,EntityManager entityManager) {
        return null;
    }

    @Override
    public List findAllBeans(Class<?> beanClass,EntityManager entityManager) throws DataBaseException, EmptyResultSetException {
        return this.getBaseDao().findAllBeans(beanClass, null, null, 0, 0,entityManager);
    }
    
    
    
    
    
    
    @Override
    @Transactional
	public void addEditBean(Object newBean,EntityManager entityManager)  {
	

		/*
		 * DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		 * def.setPropagationBehavior(TransactionDefinition.PROPAGATION_NESTED);
		 * def.setTimeout(Integer.parseInt(this.getSettingsBundle().getString(
		 * "transactionTimeOut.base.lowTimeOut"))); status =
		 * this.getMyTransactionManager().getTransaction(def);
		 */
		//	setChangeInformation(newBean);
			
			try {
				this.getBaseDao().insertOrUpdateBean(newBean,entityManager);
			} catch (DataBaseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			 


  	}

    
    
    
    
    
}
