package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "INCOME_DETAIL")
@Entity(name = "IncomeDetail")
@Setter
@Getter
public class IncomeDetail  {

	@Id
	@Column(name = "INCOME_DETAIL_ID")
	private int id=-1;
	
	
@Column(name = "INCOME_DETAIL_TYPE")
    private String typeName;

	@Column(name = "AMOUNT")
    private BigDecimal amount;

	@Column(name = "RECIPEINT_NAME")
    private String resipeintName;

	@Column(name = "NOTES")
    private String notes;

	@Column(name = "SELLER_ID")
    private Integer sellerId;

	
	
	 @ManyToOne
	    @JoinColumn(name = "FRIDAGE_ID")
	    private Fridage fridage;

	/*
	 * @Column(name = "SELLER_ORDER_ID") private Integer sellerOrderId;
	 */

	@ManyToOne
	@JoinColumn(name = "INCOME_ID")
    private Income income;

	/*
	 * @Column(name = "INSTALLMENT_ID") private Integer installmentId;
	
	@ManyToOne
	@JoinColumn(name = "TYPE_ID")
    private IncomeType type;

 */

}
