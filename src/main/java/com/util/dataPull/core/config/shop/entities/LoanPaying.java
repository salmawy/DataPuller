package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "LOAN_PAYING")
@Entity(name = "LoanPaying")
@Setter
@Getter
public class LoanPaying  {

	@Id
	@Column(name = "LOAN_PAYING_ID")
	private int id=-1;
	


    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmunt;

    @Column(name = "PAYING_DATE")
    private Date payingDate;

    @Column(name = "NOTES")
    private String notes;
    @ManyToOne
    @JoinColumn(name = "LOAN_ACCOUNT_ID")
    private LoanAccount loanAccount;



}
