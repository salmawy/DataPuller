 package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

 @Table(name = "OUTCOME")
 @Entity(name = "Outcome")
 @Setter
 @Getter
 public class Outcome  {
	 
	 @Id
		@Column(name = "OUTCOME_ID")
		private int id=-1;
		

	 
	 
     @Column(name = "Outcome_DATE")
     private Date outcomeDate;

     @Column(name = "TOTAL_OUTCOME")
     private BigDecimal totalOutcome;

     @ManyToOne
     @JoinColumn(name = "SEASON_ID")
     private Season seasonId;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "SAEF_ID") private Safe safeId;
	 */







 }
