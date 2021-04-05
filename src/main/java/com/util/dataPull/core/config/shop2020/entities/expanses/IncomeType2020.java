package com.util.dataPull.core.config.shop2020.entities.expanses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

import lombok.Getter;
import lombok.Setter;

@Table(name = "INCOME_TYPES")
@Entity(name = "IncomeType")
@Setter
@Getter
public class IncomeType2020  extends  BaseBean{
	
	
	@Id
	@Column(name ="ID" )
	private int id ;

	@Column(name = "NAME")
 	private String name;

	
	
	

}
