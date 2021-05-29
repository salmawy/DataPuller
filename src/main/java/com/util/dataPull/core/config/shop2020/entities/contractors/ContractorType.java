package com.util.dataPull.core.config.shop2020.entities.contractors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name = "CONTRACTORS_TYPES")
@Entity(name="ContractorType")

@Setter
@Getter
@AllArgsConstructor
public class ContractorType {
	
	
	@Id
	public int id;
	
	@Column(name = "name")
	public String name;
	
	
	

}
