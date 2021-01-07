package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.IncomeDetail;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "INCOME_DETAILS")
@Entity(name = "IncomeDetail")
@Setter
@Getter
public class IncomeDetail2020 extends BaseBean implements MappingImpl{


@Column(name = "TYPE_NAME")
    private String typeName;

	@Column(name = "AMOUNT")
    private Double amount;

	@Column(name = "RESIPEINT_NAME")
    private String resipeintName;

	@Column(name = "NOTES")
    private String notes;

	@Column(name = "SELLER_ID")
    private Integer sellerId;


	@Column(name = "SELLER_ORDER_ID")
    private Integer sellerOrderId;

 
	@Column(name = "INCOME_ID")
    private int incomeId;

	@Column(name = "INSTALLMENT_ID")
    private Integer installmentId;

 
	@Column(name = "TYPE_ID")
    private int typeId;


	@Override
	public Object map(Object o) {
		 IncomeDetail e=( IncomeDetail)o;
		 this.setId(e.getId());
		 this.setAmount(e.getAmount().doubleValue());
		 this.setIncomeId(e.getIncome().getId());
		 this.setNotes(e.getNotes());
		 this.setResipeintName(e.getResipeintName());
		 this.setSellerId(e.getSellerId());
		 this.setTypeId(getTypeId(e.getTypeName()));
	
		 return this;
	}
	
	
	/*
	 * UPDATE  INCOME_DETAIL SET TYPE_ID =1  WHERE TYPE='CASH';
UPDATE  INCOME_DETAIL SET TYPE_ID = 2 WHERE TYPE='INTST_PAY';
UPDATE  INCOME_DETAIL SET TYPE_ID = 3 WHERE TYPE='IN_LOAN';
UPDATE  INCOME_DETAIL SET TYPE_ID = 4 WHERE TYPE='IN_PAY_LOAN';
*/
	
	
	private int getTypeId(String typeName) {
		int typeId=0;
		
		if (typeName.equalsIgnoreCase("CASH"))
		return 1;
		
		if (typeName.equalsIgnoreCase("INTST_PAY"))
			return 2;
		if (typeName.equalsIgnoreCase("IN_LOAN"))
			return 3;
		if (typeName.equalsIgnoreCase("IN_PAY_LOAN"))
			return 4;
	 
		return typeId;
	}


}
