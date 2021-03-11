package com.util.dataPull.core.config.shop2020.entities.shopLoan;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.util.dataPull.core.config.shop.entities.IncLoan;
import com.util.dataPull.core.config.shop.entities.LoanPaying;
import com.util.dataPull.core.mapping.MappingImpl;

import lombok.Getter;
import lombok.Setter;
@Table(name = "SHOP_LOANS_TRANSACTIONS")
@Entity(name = "ShopLoan")
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TRANSACTION_TYPE")
public class ShopLoanTransaction implements MappingImpl{

	@TableGenerator(name = "TABLE_GENERATOR", table = "ID_TABLE", pkColumnName = "ID_TABLE_NAME",
			pkColumnValue = "SHOP_LOANS_TRANSACTIONS_ID", valueColumnName = "ID_TABLE_VALUE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GENERATOR")

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "LOANER_ID")
	private int loanerId;
	
	
	@Column(name = "FINISHED")
	private  int finished ;
	
	@Column(name = "NOTES")
	private String notes;
	@Override
	public Object map(Object o) {
		
		
		return null;
	}

	
	public ShopLoanTransaction mapIncLoan(IncLoan o) {
		
		IncLoan incLoan=(IncLoan)o;


		this.setNotes(incLoan.getNotes());
		this.setAmount(incLoan.getAmount().doubleValue());
		this.setFinished(incLoan.getLoanAccount().getFinished());
		this.setTransactionDate(incLoan.getLoanDate());
		this.setLoanerId(incLoan.getLoanAccount().getLoaner().getId());
		

		
		return this;
	}

	public ShopLoanTransaction mapLoanPaying(LoanPaying o) {
		
		LoanPaying loanPaying=(LoanPaying)o;


		this.setNotes(loanPaying.getNotes());
		this.setAmount(loanPaying.getPaidAmunt().doubleValue());
		this.setFinished(loanPaying.getLoanAccount().getFinished());
		this.setTransactionDate(loanPaying.getPayingDate());
		this.setLoanerId(loanPaying.getLoanAccount().getLoaner().getId());
		

		
		return this;
	}
}
