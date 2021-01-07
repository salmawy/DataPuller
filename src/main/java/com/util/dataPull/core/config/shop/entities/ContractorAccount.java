package com.util.dataPull.core.config.shop.entities;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name ="CONTRACTOR_ACCOUNT")
@Entity(name ="ContractorAccount")
@Setter
@Getter
public class ContractorAccount  {

	@Id
	@Column(name = "ACCOUNT_ID")
	private int id=-1;


	@Column(name ="TOTAL_AMOUNT" )
	private BigDecimal totalAmount;


	@Column(name="CONTRACTOR_ID")
	private Integer contractorId;
	





}



