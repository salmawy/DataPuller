 package com.util.dataPull.core.config.shop2020.entities.masterData;

 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

 @Table(name = "PRODUCTS")
 @Entity(name = "Product")
 @Setter
 @Getter
public class Product2020 extends  BaseBean  {

	 
		@Id
		@Column(name ="ID" )
		private int id ;
	 @Column(name = "NAME")
	private String name;

	 @Column(name = "UNIT")
	private String unit;

	 @Column(name = "COMMISION")
	private Double commision;

	 @Column(name = "UNITE_WEIGHTS")
	private Double uniteWeight;

	
	
}
