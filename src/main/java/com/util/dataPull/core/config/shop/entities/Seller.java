 package com.util.dataPull.core.config.shop.entities;


 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Table(name = "SELLER")
 @Entity(name = "Seller")
 @Setter
 @Getter
public class Seller   {


			@Id
			@Column(name = "SELLER_ID")
			private int id=-1;
		 
	 @Column(name = "SELLER_NAME")
	private String name;

	 @Column(name = "SELLER_ADDRESS")
	private String address;

	 @Column(name = "SELLER_PHONE")
	private String phone;

	 @Column(name = "SELLER_TYPE")
	private String  type ;

	/*
	 * @Column(name = "TYPE_ID") private int typeId ;
	 */
	
	
	
	

	/*
	 * public void setTypeId(int typeId) { this.typeId = typeId;
	 * this.type=String.valueOf(typeId); }
	 */
	


}
