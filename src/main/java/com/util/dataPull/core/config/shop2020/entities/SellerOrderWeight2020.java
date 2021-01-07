package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.SellerOrderWeight;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "SELLER_ORDER_WEIGHTS")
@Entity(name = "SellerOrderWeight")
@Setter
@Getter
@Slf4j
public class SellerOrderWeight2020 extends BaseBean  implements MappingImpl{


    @Column(name = "GROSS_QUANTITY")
    private Double grossQuantity;

    @Column(name = "NET_QUANTITY")
    private Double netQuantity;

    @Column(name = "UNITE_PRICE")
    private Double unitePrice;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "PACKAGE_NUMBER")
    private int packageNumber;

   
    @Column(name = "CUSTOMER_ORDER_ID")
    private Integer customerOrderId;

   
    @Column(name = "SELLER_ORDER_ID")
    private int sellerOrderId;

    
    @Column(name = "PRODUCT_ID")
    private int productId;


	@Override
	public Object map(Object o) {
		SellerOrderWeight e=(SellerOrderWeight)o;
		
		this.setAmount(e.getAmount().doubleValue());
		this.setPackageNumber(e.getPackageNumber());
		
		if(e.getCustomerOrderId() > 0)
		this.setCustomerOrderId(e.getCustomerOrderId());
		
		this.setGrossQuantity(e.getGrossQuantity().doubleValue());
		this.setNetQuantity(e.getNetQuantity().doubleValue());
		this.setId(e.getId());
		this.setProductId(e.getProduct().getId());
		this.setSellerOrderId(e.getSellerOrder().getId());
		this.setUnitePrice(e.getUnitePrice().doubleValue());
		
	//	log.info("seller order weight customerId =>>>"+this.getCustomerOrderId());
		
		
		return this;
	}


}
