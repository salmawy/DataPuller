package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "LOAN_ACCOUNT")
@Entity(name = "LoanAccount")
@Setter
@Getter
public class LoanAccount  {

	@Id
	@Column(name = "LOAN_ACCOUNT_ID")
	private int id=-1;
	
	

	@Column(name = "LOAN_TYPE")
    private String type;

	@Column(name = "DUE_AMOUNT")
    private BigDecimal dueAmount;

	@Column(name = "FINISHED")
    private int finished;

	@Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

	@ManyToOne
	@JoinColumn(name = "LOANER_ID")
    private Loaner loaner;

	/*
	 * public LoanAccount() { dueAmount = 0.0; finished = 0; totalAmount = 0.0;
	 * 
	 * }
	 */

}
