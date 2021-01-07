package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "INCOME")
@Entity(name = "Income")
@Setter
@Getter
public class Income {
	
	

	@Id
	@Column(name = "INCOME_ID")
	private int id=-1;
	
	

    @Column(name = "TOTAL_INCOME")
    private BigDecimal totalAmount;

    @Column(name = "INCOME_DATE")
    private Date incomeDate;

    @ManyToOne
    @JoinColumn(name = "SEASON_ID")
    private Season season;

 

}
