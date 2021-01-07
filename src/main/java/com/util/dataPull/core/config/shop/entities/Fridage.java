package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="FRIDAGE")
@Entity(name ="Fridage")
@Setter
@Getter
public class Fridage  {

	@Id
	@Column(name = "FRIDAGE_ID")
	private int id=-1;
	
	 
	
	@Column(name ="FRIDAGE_NAME")
	private String name;


}
