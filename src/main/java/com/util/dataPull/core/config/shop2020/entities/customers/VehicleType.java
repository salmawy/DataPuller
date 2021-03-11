package com.util.dataPull.core.config.shop2020.entities.customers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

@Table(name = "VEHICLE_TYPES")
@Entity(name = "VehicleType")
@Setter
@Getter
public class VehicleType extends BaseBean  {


	@Column(name = "NAME")
	private String name;
	
	

}
