package com.util.dataPull.core.config.shop2020.entities.expanses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

import lombok.Getter;
import lombok.Setter;

@Table(name = "SAFE_TRACING")
@Entity(name = "SafeTracing")
@Setter
@Getter
public class SafeTracing extends BaseBean {
	@TableGenerator(name = "TABLE_GENERATOR",table = "ID_TABLE",
			pkColumnName = "ID_TABLE_NAME",
			pkColumnValue = "SAFE_TRACING_ID",
			valueColumnName = "ID_TABLE_VALUE",allocationSize = 1)
	@GeneratedValue(strategy =  GenerationType.TABLE,generator = "TABLE_GENERATOR")

	@Id
	@Column(name ="ID" )
	private int id ;
	
	
	

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
