package com.util.dataPull.core.config.shop2020.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "SELLER_TYPES")
@Entity(name = "SellerType")
@Setter
@Getter
public class SellerType  extends BaseBean{

	@Column(name = "NAME")
	private String name;

}
