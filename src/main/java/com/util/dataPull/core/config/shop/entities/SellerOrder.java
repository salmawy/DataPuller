package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Table(name = "SELLER_ORDER")
@Entity(name = "SellerOrder")
@Setter
@Getter
public class SellerOrder   {

	@Id
	@Column(name = "ORDER_ID")
	private int id=-1;
	
	
    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @Column(name = "NOTES")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "SEASON_ID")
    private Season season;

    @Column(name = "SCIENCERE")
    private int sciencere;

    @Column(name = "SELLER_LOAN_BAG_ID")
    private Integer sellerLoanBagId;

    @ManyToOne
    @JoinColumn(name = "SELLER_ID")
    private Seller seller;

    @OneToMany(mappedBy = "sellerOrder")
    private Set<SellerOrderWeight> orderWeights;

    @ManyToOne
    @JoinColumn(name = "FRIDAGE_ID")
    private Fridage fridage;


}
