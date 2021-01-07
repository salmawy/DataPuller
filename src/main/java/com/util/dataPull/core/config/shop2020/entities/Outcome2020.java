 package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.Outcome;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

 @Table(name = "OUTCOMES")
 @Entity(name = "Outcome")
 @Setter
 @Getter
 @Slf4j
 public class Outcome2020 extends BaseBean  implements MappingImpl {
    
	 
	 @Column(name = "Outcome_DATE")
     private Date outcomeDate;

     @Column(name = "TOTAL_OUTCOME")
     private Double totalOutcome;

    
     @Column(name = "SEASON_ID")
     private int seasonId;

     
     @Column(name = "SAEF_ID")
     private Integer safeId;


	@Override
	public Object map(Object o) {
		Outcome e=(Outcome)o;
		this.setId(e.getId());
		this.setOutcomeDate(e.getOutcomeDate());
		this.setSeasonId(e.getSeasonId().getId());
		this.setTotalOutcome(e.getTotalOutcome().doubleValue());
		
		
		 
		return this;
	}








 }
