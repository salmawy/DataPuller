package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "MY_SAFE")
@Entity(name = "Safe")
@Setter
@Getter
public class Safe  {

	
	 @Id
		@Column(name = "SAFE_ID")
		private int id=-1;
	 
	
	
    @Column(name = "BALANCE")
    private BigDecimal balance;
    
    
    
	/*
	 * @Column(name = "BASE_AMOUNT") private BigDecimal baseAmount;
	
    @ManyToOne
    @JoinColumn(name = "SEASON_ID")
    private Season seasonId;
 */

}
