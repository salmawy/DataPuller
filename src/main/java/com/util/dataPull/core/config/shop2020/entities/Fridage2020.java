package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.Fridage;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name ="FRIDAGES")
@Entity(name ="Fridage")
@Setter
@Getter
public class Fridage2020 extends BaseBean implements MappingImpl{

	@Column(name ="NAME")
	private String name;

	@Override
	public Object map(Object o) {
		Fridage f=(Fridage)o;
	this.setId(f.getId());
	this.name=f.getName();
		
		return this;
	}


}
