 package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

 @Table(name = "SEASON")
 @Entity(name = "Season")
 @Setter
 @Getter
 public class Season  {

	 
		@Id
		@Column(name = "SEASON_ID")
		private int id=-1;
	 
		
		
		
     @Column(name = "START_DATE")
     private Date startDate;

     @Column(name = "END_DATE")
     private Date endDate;

     @Column(name = "CURRENT_SEASON")
     private int currentSeason;


 }
