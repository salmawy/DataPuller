package com.util.dataPull.core.config.shop2020.entities.expanses;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop.entities.IncomeDetail;
import com.util.dataPull.core.mapping.MappingImpl;

import lombok.Getter;
import lombok.Setter;

@Table(name = "INCOME_DETAILS")
@Entity(name = "IncomeDetail")
@DiscriminatorValue("INCOME")
@Setter
@Getter
public class IncomeDetail2020 extends SafeTransaction implements MappingImpl {


	@Column(name = "INCOME_TYPE_ID")
	private Integer incomeTypeId;
	
	@Column(name = "INSTALLMENT_ID")
	private Integer installmentId;

	public Integer getSellerId() {
		return this.getPersonId();
	}

	public Integer getSellerOrderId() {
		return this.getOrderId();
	}

	public void setSellerId(Integer id) {
		this.setPersonId(id);
	}

	public void setSellerOrderId(Integer id) {
		this.setOrderId(id);
	}

	@Override
	public Object map(Object o) {
		IncomeDetail e = (IncomeDetail) o;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		this.setId(e.getId());
		this.setSeasonId(e.getIncome().getSeason().getId());
		this.setFridageId(e.getFridage().getId());

		this.setAmount(e.getAmount().doubleValue());
		this.setNotes(e.getNotes());
		this.setCreatorName(e.getResipeintName());
		this.setSellerId(e.getSellerId());
		this.setIncomeTypeId(getTypeId(e.getTypeName()));
		this.setTransactionDate(e.getIncome().getIncomeDate());
		try {
			this.setTransactionDay(sdf.parse(sdf.format(e.getIncome().getIncomeDate())));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return this;
	}

	/*
	 * UPDATE INCOME_DETAIL SET TYPE_ID =1 WHERE TYPE='CASH'; UPDATE INCOME_DETAIL
	 * SET TYPE_ID = 2 WHERE TYPE='INTST_PAY'; UPDATE INCOME_DETAIL SET TYPE_ID = 3
	 * WHERE TYPE='IN_LOAN'; UPDATE INCOME_DETAIL SET TYPE_ID = 4 WHERE
	 * TYPE='IN_PAY_LOAN';
	 */

	private Integer getTypeId(String typeName) {
		Integer typeId = null;

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
