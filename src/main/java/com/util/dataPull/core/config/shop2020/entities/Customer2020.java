package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.Enum.CustomerTypeEnum;
import com.util.dataPull.core.config.shop.entities.ContractorAccount;
import com.util.dataPull.core.config.shop.entities.Customer;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name ="CUSTOMERS")
@Entity(name ="Customer")
@Setter
@Getter
public class Customer2020  extends BaseBean     implements MappingImpl{



	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE")
	private String phone;

	
	@Column(name = "TYPE_ID")
	private int typeId;

	
	@Override
	public Object map(Object o) {
		Customer customer=(Customer)o;
		
		this.setId(customer.getId());
	
		this.name=customer.getName();
		this.setAddress(customer.getAddress());
		this.setPhone(customer.getPhone());
		
		
		
if(customer.getName().split("_")[0].equalsIgnoreCase("مشتروات")) {
	this.setTypeId(CustomerTypeEnum.purchases);
}
if(customer.getName().split("_")[0].equalsIgnoreCase("كريم")) {
	this.setTypeId(CustomerTypeEnum.kareem);
}
else 
	this.setTypeId(CustomerTypeEnum.normal);

		return this;
		
	}
	
	
	

	

}
