package com.util.dataPull.core.config.shop2020.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.ContractorAccount;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name ="CONTRACTOR_ACCOUNTS")
@Entity(name ="ContractorAccount")
@Setter
@Getter
public class ContractorAccount2020 extends BaseBean implements MappingImpl {


	private int id=-1;


	@Column(name ="TOTAL_AMOUNT" )
	private Double totalAmount;

 
	@Column(name="CONTRACTOR_ID")
	private int contractorId;


	@Override
	public Object map(Object o) {
		ContractorAccount acc=(ContractorAccount)o;
		this.id=acc.getId();
	
		this.totalAmount=acc.getTotalAmount().doubleValue();
		
	 
		this.contractorId=acc.getContractorId();
		
		return this;
	}
	





}



