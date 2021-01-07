package com.util.dataPull.core.config.shop.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LOANERS")
@Entity(name = "Loaner")
@Setter
@Getter
public class Loaner  {
	
	@Id
	@Column(name = "LOANER_ID")
	private int id=-1;
	
	
	
    @Column(name = "LOANER_NAME")
    private String name;

    @Column(name = "LOAN_ACCOUNT_ID")
    private int loanAccountId;



}
