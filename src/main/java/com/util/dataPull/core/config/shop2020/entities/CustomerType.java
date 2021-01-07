package com.util.dataPull.core.config.shop2020.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name ="CUSTOMER_TYPES")
@Entity(name ="CustomerType")
@Setter
@Getter
public class CustomerType  extends BaseBean{
	
 @Column(name ="NAME")
	private String name;
	
	
	

	

}
