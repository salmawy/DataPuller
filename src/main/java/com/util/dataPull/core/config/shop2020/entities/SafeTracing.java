package com.util.dataPull.core.config.shop2020.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "SAFE_TRACING")
@Entity(name = "SafeTracing")
@Setter
@Getter
public class SafeTracing extends BaseBean {

	@ManyToOne
	@JoinColumn(name = "SAFE_ID")
	private Safe safeId;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "BEFORE_AMOUNT")
	private double beforAmount;

	@Column(name = "AFTER_AMOUNT")
	private double afterAmount;

	@Column(name = "TRASACTION_TYPE")
	private int transactionType;

	@Column(name = "TRANSACTION_ID")
	private int transactionId;

	@Column(name = "TRNSACTION_NAME")
	private String  transactionName;


 
	
	
	
}
