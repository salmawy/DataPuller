 package com.util.dataPull.core.config.shop2020.entities.masterData;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.Season;
import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

 @Table(name = "SEASONS")
 @Entity(name = "Season")
 @Setter
 @Getter
 public class Season2020 extends BaseBean implements MappingImpl{

	 
	 
	 
		@Id
		@Column(name ="ID" )
		private int id ;
		
		
     @Column(name = "START_DATE")
     private Date startDate;

     @Column(name = "END_DATE")
     private Date endDate;

     @Column(name = "CURRENT_SEASON")
     private int currentSeason;

	@Override
	public Object map(Object o) {

Season s=(Season)o;
		this.setId(s.getId());
		this.startDate=s.getStartDate();
		this.endDate=s.getEndDate();
		this.currentSeason=s.getCurrentSeason();
		return this;
	}


 }
