package com.util.dataPull.core.config.shop2020.entities.shopLoan;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.Loaner;
import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "LOANERS")
@Entity(name = "Loaner")
@Setter
@Getter
public class Loaner2020 extends BaseBean implements MappingImpl{
	
	
	@Id
	@Column(name ="ID" )
	private int id ;
	
    @Column(name = "NAME")
    private String name;

    @Column(name = "LOAN_ACCOUNT_ID")
    private int loanAccountId;

	@Override
	public Object map(Object o) {
		
		Loaner e=(Loaner)o;
		this.setId(e.getId());
		
		this.setName(e.getName());
		this.setLoanAccountId(e.getLoanAccountId());
		return this;
	}



}
