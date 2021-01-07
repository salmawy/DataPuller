package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "INSTALMENT")
@Entity(name = "Installment")
@Setter
@Getter
public class Installment  {

	@Id
	@Column(name = "INSTALMENT_ID")
	private int id=-1;
	
	
    @Column(name = "INSTALMENT_DATE")
    private Date instalmentDate;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "SCIENCERE")
    private int sciencere;

    @Column(name = "SELLER_BAG_LOAN_ID")
    private int sellerLoanBagId;

    @Column(name = "REPORT")
    private String notes;

    @Column(name = "SELLER_ID")
    private Integer sellerId;


}
