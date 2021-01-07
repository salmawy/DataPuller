 package com.util.dataPull.core.config.shop2020.entities;

 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;

 @Table(name = "PRODUCTS")
 @Entity(name = "Product")
 @Setter
 @Getter
public class Product2020 extends  BaseBean  {

	 @Column(name = "NAME")
	private String name;

	 @Column(name = "UNIT")
	private String unit;

	 @Column(name = "COMMISION")
	private Double commision;

	 @Column(name = "UNITE_WEIGHTS")
	private Double uniteWeight;

	
	
}
