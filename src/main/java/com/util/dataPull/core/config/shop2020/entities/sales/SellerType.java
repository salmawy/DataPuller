package com.util.dataPull.core.config.shop2020.entities.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

import lombok.Getter;
import lombok.Setter;

@Table(name = "SELLER_TYPES")
@Entity(name = "SellerType")
@Setter
@Getter
public class SellerType  extends BaseBean{
	@Id
	@Column(name ="ID" )
	private int id ;
	
	@Column(name = "NAME")
	private String name;

}
