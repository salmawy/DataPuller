package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.ContractorAccountDetail;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;


@Table(name ="CONTRACTOR_ACCOUNT_DETAILS")
@Entity(name ="ContractorAccountDetail")
@Setter
@Getter
public class ContractorAccountDetail2020 extends BaseBean implements MappingImpl{



	@Column(name = "DETAIL_DATE")
	private Date detailDate;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "REPORT")
	private String report;

	@Column(name = "SPENDER_NAME")
	private String spenderName ;

	@Column(name = "PAID")
	private int paid;

 
	@Column(name = "SEASON_ID")
	private int seasonId;

 
	@Column(name = "CONTRACTOR_ACCOUNT_ID")
	private  Integer contractorAccountId;


	@Override
	public Object map(Object o) {
		ContractorAccountDetail e=(ContractorAccountDetail)o;
		this.setId(e.getId());
		
		this.setContractorAccountId(e.getContractorAccount().getId());
		this.setDetailDate(e.getDetailDate());
		this.setPaid(e.getPaid());
		this.setAmount(e.getAmount().doubleValue());
		this.setReport(e.getReport());
		this.setSeasonId(e.getSeason().getId());
		this.setSpenderName(e.getSpenderName());
		
		return this;
	}
	
	

   


}
