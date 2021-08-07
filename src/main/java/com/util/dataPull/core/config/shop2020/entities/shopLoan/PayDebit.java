package com.util.dataPull.core.config.shop2020.entities.shopLoan;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.util.dataPull.core.config.shop2020.entities.expanses.OutcomeDetail2020;

import lombok.Getter;
import lombok.Setter;

 
@Entity
 @Setter
@Getter
@DiscriminatorValue("PAY_DEBIT")
public class PayDebit extends ShopLoanTransaction {
	
	
	@OneToOne
	@JoinColumn(name = "OUTCOME_DETAIL_ID",insertable = false,updatable = false,nullable = true)
	private OutcomeDetail2020 outcomeDetail;
	
	
	@Column(name = "OUTCOME_DETAIL_ID")
	private Integer outcomeDetailId;
	
	
	

}
