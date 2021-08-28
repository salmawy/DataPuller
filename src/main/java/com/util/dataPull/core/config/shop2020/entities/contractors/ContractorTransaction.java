package com.util.dataPull.core.config.shop2020.entities.contractors;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.ContractorAccountDetail;
import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;


@Table(name ="CONTRACTOR_Transactions")
@Entity(name ="ContractorTransaction")
@Setter
@Getter
public class ContractorTransaction extends BaseBean implements MappingImpl{

	@Id
	@Column(name ="ID" )
	private int id ;

	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "REPORT")
	private String report;

	@Column(name = "SPENDER_NAME")
	private String spenderName ;

	@Column(name = "PAID")
	private int paid;
	
	
 
	
	
	@Column(name = "SETTLEDMENT_DATE")
	private Date settllmentDate;
 
	@Column(name = "SEASON_ID")
	private int seasonId;
	
	
	
 
	@Column(name = "CONTRACTOR_ID")
	private  Integer contractorId;


	@Override
	public Object map(Object o) {
		ContractorAccountDetail e=(ContractorAccountDetail)o;
		this.setId(e.getId());
	
		this.setContractorId(e.getContractorAccount().getContractorId());
		this.setTransactionDate(e.getDetailDate());
		this.setPaid(e.getPaid());
		this.setAmount(e.getAmount().doubleValue());
		this.setReport(e.getReport());
		this.setSeasonId(e.getSeason().getId());
		this.setSpenderName(e.getSpenderName());
		
		return this;
	}
	
	

   


}
