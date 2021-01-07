package com.util.dataPull.core.config.shop.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.*;

@Table(name = "SELLER_WEIGHT")
@Entity(name = "SellerOrderWeight")
@Setter
@Getter
public class SellerOrderWeight  {

	@Id
	@Column(name = "WEIGHT_ID")
	private int id=-1;
 

    @Column(name = "GROSS_QUANTITY")
    private BigDecimal grossQuantity;

    @Column(name = "NET_QUANTITY")
    private BigDecimal netQuantity;

    @Column(name = "UNITE_PRICE")
    private BigDecimal unitePrice;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "PACKAGE_NUMBER")
    private int packageNumber;


    @Column(name = "CUSTOMER_ORDER_ID",insertable = false,updatable = false)
    private int customerOrderId;
    
    


    @ManyToOne
    @JoinColumn(name = "SELLER_ORDER_ID")
    private SellerOrder sellerOrder;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;


}
