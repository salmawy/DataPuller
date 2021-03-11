package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name ="CUSTOMER_ORDER")
@Entity(name ="CustomerOrder")
@Setter
@Getter
public class CustomerOrder {

	@Id
	@Column(name = "ORDER_ID")
	private int id=-1;
	
	
	
	
	@Column(name = "NOLUN")
	private BigDecimal nolun;

	@Column(name = "GROSS_WEIGHT")
	private BigDecimal grossweight;

	@Column(name ="NET_WEIGHT")
	private BigDecimal netWeight;

	@Column(name ="ORDER_DATE")
	private Date orderDate;

	@Column(name ="TOTAL_PRICE")
	private BigDecimal totalPrice;

	@Column(name ="NET_PRICE")
	private BigDecimal netPrice;

	@Column(name ="EDIT_DATE")
	private Date editeDate;

	@Column(name ="DUE_DATE")
	private Date dueDate;

	@Column(name ="TIPS")
	private BigDecimal tips;

	@Column(name ="COMMISION")
	private BigDecimal commision;

	@Column(name ="NOTES")
	private String notes;

	@Column(name ="FINISHED")
	private int finished;

	@Column(name ="DUED")
	private int dued;

	@Column(name ="UNITES")
	private int units;

	@Column(name ="UNITE_PRICE")
	private BigDecimal unitePrice;

	@Column(name ="RATIO")
	private BigDecimal ratio;

	@Column(name ="BUY_PRICE")
	private BigDecimal buyPrice;

	@Column(name ="PERIOD_ID")
	private int periodId = -1;




	@ManyToOne
	@JoinColumn(name ="CUSTOMER_ID")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name ="PRODUCT_ID")
	private Product product;

	@ManyToOne
	@JoinColumn(name ="FRIDAGE_ID")
	private Fridage fridage;


	@Column(name ="ORDER_TAG")
	private String orderTag;

	@Column(name ="VECHILE_TYPE")
	private String vechileType;
	
	@Column(name ="SEASON_ID")
	private Integer seasonId;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name ="VECHILE_TYPE_ID") private VehicleType vehicleType;
	 * 
	
	@Column(name ="INVOICE_STATUS")
	private int invoiceStatus;
 */

}
