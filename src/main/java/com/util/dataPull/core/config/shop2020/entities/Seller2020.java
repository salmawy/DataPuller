 package com.util.dataPull.core.config.shop2020.entities;


 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;

import com.util.dataPull.core.Enum.SellerTypeEnum;
import com.util.dataPull.core.config.shop.entities.Seller;
import com.util.dataPull.core.mapping.MappingImpl;

 @Table(name = "SELLERS")
 @Entity(name = "Seller")
 @Setter
 @Getter
public class Seller2020 extends BaseBean implements MappingImpl{

	 @Column(name = "NAME")
	private String name;

	 @Column(name = "ADDRESS")
	private String address;

	 @Column(name = "PHONE")
	private String phone;

	 @Column(name = "TYPE")
	private String  type ;

	 @Column(name = "TYPE_ID")
	private int  typeId ;

	
	
	
	

	public void setTypeId(int typeId) {
		this.typeId = typeId;
		this.type=String.valueOf(typeId);
	}






	@Override
	public Object map(Object o) {
		Seller e=(Seller)o;
		
		this.setName(e.getName());
		this.setPhone(e.getPhone());
		this.setAddress(e.getAddress());
		this.setId(e.getId());
	
		if(e.getType().equalsIgnoreCase("PERMENANT")) {
			this.setTypeId(SellerTypeEnum.permenant);
		}
		else if(e.getType().equalsIgnoreCase("CASH")) {
			this.setTypeId(SellerTypeEnum.cash);
		}
		return this;
	}
	
	


}
