package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


@Table(name ="CONTRACTOR_ACCOUNT_DETAIL")
@Entity(name ="ContractorAccountDetail")
@Setter
@Getter
public class ContractorAccountDetail  
{


	@Id
	@Column(name = "ACCOUNT_DETAIL_ID")
	private int id=-1;
	
	
	@Column(name = "ACCOUNT_DETAIL_DATE")
	private Date detailDate;

	@Column(name = "AMOUNT")
	private BigDecimal amount;

	@Column(name = "REPORT")
	private String report;

	@Column(name = "SPENDER_NAME")
	private String spenderName ;

	@Column(name = "PAID")
	private int paid;

	@ManyToOne
	@JoinColumn(name = "SEASON_ID")
	private Season season;

	@ManyToOne
	@JoinColumn(name = "CONTRACTOR_ACCOUNT_ID")
	private  ContractorAccount contractorAccount;
	
	

   


}
