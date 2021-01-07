package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name ="CUSTOMER")
@Entity(name ="Customer")
@Setter
@Getter
public class Customer  {

	@Id
	@Column(name = "CUSTOMER_ID")
	private int id=-1;
	
	

	@Column(name = "CUSTOMER_NAME")
	private String name;

	@Column(name = "CUSTOMER_ADDRESS")
	private String address;

	@Column(name = "CUSTOMER_PHONE")
	private String phone;
	
	
	
	
	
	
	
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "TYPE_ID") private CustomerType type;
	 */
	
	

	

}
