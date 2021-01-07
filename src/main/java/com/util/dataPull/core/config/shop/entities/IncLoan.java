package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name ="INC_LOAN")
@Entity(name ="IncLoan")
@Setter
@Getter
public class IncLoan {
	
	@Id
	@Column(name = "INC_LOAN_ID")
	private int id=-1;
	
@Column(name ="INC_LOAN_DATE")
	private Date loanDate;

	@Column(name ="AMOUNT")
	private BigDecimal amount;

 	@ManyToOne
	@JoinColumn(name ="LOAN_ACCOUNT_ID")
	private LoanAccount loanAccount;

	@Column(name ="NOTES")
	private String notes;







}
