package com.util.dataPull.core.config.shop2020.entities.expanses;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

@Table(name = "INCOME_TYPES")
@Entity(name = "IncomeType")
@Setter
@Getter
public class IncomeType2020  extends  BaseBean{
	@Column(name = "NAME")
 	private String name;
	
	
	

}
