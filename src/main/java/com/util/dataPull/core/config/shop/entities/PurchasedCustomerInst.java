package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


@Table(name = "PURCHASED_CUSTOMRER_INSTS")
@Entity(name = "PurchasedCustomerInst")
@Setter
@Getter
public class PurchasedCustomerInst  {

	 @Id
		@Column(name = "INST_ID")
		private int id=-1;
	 
	 
	 
    @Column(name = "INST_DATE")
    private Date instalmentDate;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "NOTES")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "SEASON_ID")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;


}
