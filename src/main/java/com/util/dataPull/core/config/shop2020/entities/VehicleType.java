package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "VEHICLE_TYPES")
@Entity(name = "VehicleType")
@Setter
@Getter
public class VehicleType extends BaseBean  {


	@Column(name = "NAME")
	private String name;
	
	

}
