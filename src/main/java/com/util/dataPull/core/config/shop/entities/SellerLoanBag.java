package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "SELLER_LOAN_BAG")
@Entity(name = "SellerLoanBag")
@Setter
@Getter
public class SellerLoanBag   {

	@Id
	@Column(name = "LOAN_BAG_ID")
	private int id=-1;
 
	
    @Column(name = "PRIOR_LOAN")
    private BigDecimal priorLoan;

    @Column(name = "CURRENT_LOAN")
    private BigDecimal currentLoan;

    @Column(name = "DUE_LOAN")
    private BigDecimal dueLoan;

    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmount;

    @Column(name = "NOTES")
    private String notes;


    @ManyToOne
    @JoinColumn(name = "SELLER_ID")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "SEASON_ID")
    private Season season;

    @Column(name = "PRIOR_LOAN_SETTELED")
    private int priorLoanSettled;

    
	/*
	 * public SellerLoanBag() { this.currentLoan = 0.0; this.priorLoan = 0.0;
	 * this.dueLoan = 0.0; this.paidAmount = 0.0;
	 * 
	 * 
	 * }
	 */

}



