 package com.util.dataPull.core.config.shop.entities;

 import lombok.Getter;
 import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Table(name = "PRODUCT")
 @Entity(name = "Product")
 @Setter
 @Getter
public class Product   {

	 
	 @Id
		@Column(name = "PRODUCT_ID")
		private int id=-1;
	 
	 
	 
	 @Column(name = "PRODUCT_NAME")
	private String name;

	 @Column(name = "UNIT")
	private String unit;

	 @Column(name = "COMMISION")
	private BigDecimal commision;

	 @Column(name = "UNITE_WEIGHT")
	private BigDecimal uniteWeight;

	
	
}
