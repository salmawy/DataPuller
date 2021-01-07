 package com.util.dataPull.core.config.shop.entities;

 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Table(name = "STORE")
 @Entity(name = "Store")
 @Setter
 @Getter
public class Store  {
	
	 
	 @Id
		@Column(name = "STORE_ID")
		private int id=-1;
	 
	 @Column(name = "FIRDAGE_ID")
	private int fridageId;



	
}
