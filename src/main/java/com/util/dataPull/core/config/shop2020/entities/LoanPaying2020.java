package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.LoanPaying;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

@Table(name = "LOAN_PAYING")
@Entity(name = "LoanPaying")
@Setter
@Getter
public class LoanPaying2020 extends BaseBean implements MappingImpl {




    @Column(name = "PAID_AMOUNT")
    private Double paidAmunt;

    @Column(name = "PAYING_DATE")
    private Date payingDate;

    @Column(name = "NOTES")
    private String notes;
  
    
    
    @Column(name = "LOAN_ACCOUNT_ID")
    private int loanAccountId;



	@Override
	public Object map(Object o) {
		
		LoanPaying e=(LoanPaying)o;
		this.setId(e.getId());
		
		this.setNotes(e.getNotes());
		this.setPaidAmunt(e.getPaidAmunt().doubleValue());
		this.setPayingDate(e.getPayingDate());
		this.setLoanAccountId(e.getLoanAccount().getId());
		
		
		return this;
	}



}
