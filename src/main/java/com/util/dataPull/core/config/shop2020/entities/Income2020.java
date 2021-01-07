package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.Income;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

@Table(name = "INCOMES")
@Entity(name = "Income")
@Setter
@Getter
public class Income2020 extends BaseBean implements MappingImpl {

    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "INCOME_DATE")
    private Date incomeDate;

   
    @Column(name = "SEASON_ID")
    private int seasonId;


	@Override
	public Object map(Object o) {
		Income e=(Income)o;
		
		this.setId(e.getId());
		this.setTotalAmount(e.getTotalAmount().doubleValue());
		this.setIncomeDate(e.getIncomeDate());
		this.setSeasonId(e.getSeason().getId());
	 
		return this;
	}

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "SAFE_ID") private Safe safeId;
	 */


}
