package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "OUTCOME_DETAIL")
@Entity(name = "OutcomeDetail")
@Setter
@Getter
public class OutcomeDetail   {

	
	
	 
	 @Id
		@Column(name = "OUTCOME_DETAIL_ID")
		private int id=-1;
	 
	 

    @Column(name = "OUTCOME_TYPE")
    private String typeName;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "SPENDER_NAME")
    private String spenderName;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "ORDER_ID")
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "FRIDAGE_ID")
    private Fridage fridage;

    @ManyToOne
    @JoinColumn(name = "OUTCOME_ID")
    private Outcome outcome;
    
    

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "TYPE_ID") private OutcomeType type;
	 */

}
