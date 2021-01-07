package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.LoanAccount;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "LOAN_ACCOUNTS")
@Entity(name = "LoanAccount")
@Setter
@Getter
public class LoanAccount2020 extends BaseBean implements MappingImpl{


	@Column(name = "TYPE")
    private String type;

	@Column(name = "DUE_AMOUNT")
    private Double dueAmount;

	@Column(name = "FINISHED")
    private int finished;

	@Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

 
	@Column(name = "LOANER_ID")
    private int loanerId;

    public LoanAccount2020() {
        dueAmount = 0.0;
        finished = 0;
        totalAmount = 0.0;

    }

	@Override
	public Object map(Object o) {
		LoanAccount e=(LoanAccount)o;
		
	this.setId(e.getId());
	this.setDueAmount(e.getDueAmount().doubleValue());
		this.setFinished(e.getFinished());
		this.setLoanerId(e.getLoaner().getId());
		this.setTotalAmount(e.getTotalAmount().doubleValue());
		this.setType(e.getType());
		return this;
	}


}
