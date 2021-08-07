package com.util.dataPull.core.config.shop2020.entities.shopLoan;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.util.dataPull.core.config.shop2020.entities.expanses.IncomeDetail2020;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("PAY_CREDIT")
@Setter
@Getter
public class PayCredit extends ShopLoanTransaction {
	
	//installments of loans shop has received  

	@OneToOne
	@JoinColumn(name = "INCOME_DETAIL_ID",insertable = false,updatable = false,nullable = true)
	private IncomeDetail2020 incomeDetail;
	
	
	@Column(name = "INCOME_DETAIL_ID")
	private Integer incomeDetailId;
	
	
	

}