package com.util.dataPull.core.config.shop2020.entities.sales;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop.entities.SellerOrder;
import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;
import java.util.Set;

@Table(name = "SELLER_ORDERS")
@Entity(name = "SellerOrder")
@Setter
@Getter
public class SellerOrder2020 extends BaseBean implements MappingImpl  {


    @Column(name = "TOTAL_COST")
    private Double totalCost;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @Column(name = "NOTES")
    private String notes;

   
    @Column(name = "SEASON_ID")
    private int seasonId;

    @Column(name = "SCIENCERE")
    private int sciencere;

    @Column(name = "SELLER_LOAN_BAG_ID")
    private Integer sellerLoanBagId;

   
    @Column(name = "SELLER_ID")
    private int sellerId;

 
 
    @Column(name = "FRIDAGE_ID")
    private int fridageId;



	@Override
	public Object map(Object o) {
		SellerOrder e=(SellerOrder)o;
		
		this.setId(e.getId());
		
		this.setNotes(e.getNotes());
		this.setFridageId(e.getFridage().getId());
		this.setOrderDate(e.getOrderDate());
		this.setSciencere(e.getSciencere());
		this.setSeasonId(e.getSeason().getId());
		this.setTotalCost(e.getTotalCost().doubleValue());
		this.setSellerId(e.getSeller().getId());
		this.setSellerLoanBagId(e.getSellerLoanBagId());
		
		return this;
	}


}
