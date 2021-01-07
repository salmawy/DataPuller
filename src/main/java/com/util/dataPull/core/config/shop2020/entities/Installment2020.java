package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.Installment;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

@Table(name = "INSTALLMENTS")
@Entity(name = "Installment")
@Setter
@Getter
public class Installment2020 extends BaseBean implements MappingImpl {


    @Column(name = "INSTALLMENT_DATE")
    private Date instalmentDate;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "SCIENCERE")
    private int sciencere;

    @Column(name = "SELLER_LOAN_BAG_ID")
    private int sellerLoanBagId;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "SELLER_ORDER_ID")
    private Integer sellerOrderId;

	@Override
	public Object map(Object o) {
	 
		Installment e=(Installment)o;
		
		this.setId(e.getId());
		this.setInstalmentDate(e.getInstalmentDate());
		this.setNotes(e.getNotes());
		
		this.setSellerLoanBagId(e.getSellerLoanBagId());
		this.setSciencere(e.getSciencere());
		
		
 		return this;
	}


}
