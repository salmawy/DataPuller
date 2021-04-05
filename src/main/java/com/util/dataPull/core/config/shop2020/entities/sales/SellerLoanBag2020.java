package com.util.dataPull.core.config.shop2020.entities.sales;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.SellerLoanBag;
import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "SELLER_LOAN_BAGS")
@Entity(name = "SellerLoanBag")
@Setter
@Getter
public class SellerLoanBag2020 extends BaseBean implements MappingImpl {
	@Id
	@Column(name ="ID" )
	private int id ;

    @Column(name = "PRIOR_LOAN")
    private double priorLoan;

    @Column(name = "CURRENT_LOAN")
    private double currentLoan;

    @Column(name = "DUE_LOAN")
    private double dueLoan;

    @Column(name = "PAID_AMOUNT")
    private double paidAmount;

    @Column(name = "NOTES")
    private String notes;


   
    @Column(name = "SELLER_ID")
    private int sellerId;

    
    @Column(name = "SEASON_ID")
    private int seasonId;


	@Override
	public Object map(Object o) {
		SellerLoanBag e=(SellerLoanBag)o;
		this.setId(e.getId());
		this.setDueLoan(e.getDueLoan().doubleValue());
		this.setCurrentLoan(e.getCurrentLoan().doubleValue());
		this.setPaidAmount(e.getPaidAmount().doubleValue());
		this.setPriorLoan(e.getPriorLoan().doubleValue());
		this.setNotes(e.getNotes());
		this.setSeasonId(e.getSeason().getId());
		this.setSellerId(e.getSeller().getId());
		
		return this;
	}


  

}



