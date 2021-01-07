 package com.util.dataPull.core.config.shop2020.entities;

 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.Store;
import com.util.dataPull.core.mapping.MappingImpl;

 @Table(name = "STORES")
 @Entity(name = "Store")
 @Setter
 @Getter
public class Store2020 extends BaseBean implements MappingImpl{

	 @Column(name = "FRIDAGE_ID")
	private int fridageId;

	@Override
	public Object map(Object o) {
		Store s=(Store)o;
		this.setId(s.getId());;
		this.fridageId=s.getFridageId();
		return this;
	}



	
}
