package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.IncLoan;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

@Table(name ="INC_LOANS")
@Entity(name ="IncLoan")
@Setter
@Getter
public class IncLoan2020 extends BaseBean implements MappingImpl {

@Column(name ="LOAN_DATE")
	private Date loanDate;

	@Column(name ="AMOUNT")
	private Double amount;

 	 
 	@Column(name ="LOAN_ACCOUNT_ID")
	private int loanAccountId;

	@Column(name ="NOTES")
	private String notes;

	@Override
	public Object map(Object o) {
		
		IncLoan e=(IncLoan)o;
		this.setId(e.getId());
		this.setAmount(e.getAmount().doubleValue());		
		this.setLoanAccountId(e.getLoanAccount().getId());
		this.setLoanDate(e.getLoanDate());
		this.setNotes(e.getNotes());
		return this;
	}







}
