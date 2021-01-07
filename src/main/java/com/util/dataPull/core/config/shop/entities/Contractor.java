package com.util.dataPull.core.config.shop.entities;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Table(name ="CONTRACTOR")
@Entity(name ="Contractor")

@Setter
@Getter
public class Contractor   {
  
 
	@Id
	@Column(name ="CONTRACTOR_ID" )
	private int  id;

	@Column(name ="CONTRACTOR_NAME" )
	private String name;

	@Column(name ="CONTRACTOR_ADDRESS" )
	private String address;

	@Column(name ="CONTRACTOR_PHONE" )
	private String phone;

	@Column(name ="CONTRACTOR_TYPE" )
	private String typeName;

 
	

}
