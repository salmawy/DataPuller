package com.util.dataPull.core.config.shop2020.entities.customers;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

@Table(name ="CUSTOMER_TYPES")
@Entity(name ="CustomerType")
@Setter
@Getter
public class CustomerType  extends BaseBean{
	@Id
	@Column(name ="ID" )
	private int id ;
	
	
 @Column(name ="NAME")
	private String name;
	
	
	

	

}
