package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.PurchasedCustomerInst;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;


@Table(name = "PURCHASED_CUSTMER_INSTS")
@Entity(name = "PurchasedCustomerInst")
@Setter
@Getter
public class PurchasedCustomerInst2020 extends BaseBean implements MappingImpl {


    @Column(name = "INSTALLMENT_DATE")
    private Date instalmentDate;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "NOTES")
    private String notes;

   
    @Column(name = "SEASON_ID")
    private int seasonId;

  
    @Column(name = "CUSTOMER_ID")
    private int customerId;


	@Override
	public Object map(Object o) {

		PurchasedCustomerInst e=(PurchasedCustomerInst)o;
		
		this.setId(e.getId());
		this.setAmount(e.getAmount().doubleValue());
		this.setCustomerId(e.getCustomer().getId());
		this.setInstalmentDate(e.getInstalmentDate());
		this.setNotes(e.getNotes());
		this.setSeasonId(e.getSeason().getId());
		

		return this;
	}


}
