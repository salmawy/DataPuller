package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import com.util.dataPull.core.Enum.CustomerTypeEnum;
import com.util.dataPull.core.Enum.VechileTypeEnum;
import com.util.dataPull.core.config.shop.entities.Customer;
import com.util.dataPull.core.config.shop.entities.CustomerOrder;
import com.util.dataPull.core.mapping.MappingImpl;

import java.util.Date;

@Table(name ="CUSTOMER_ORDERS")
@Entity(name ="CustomerOrder")
@Setter
@Getter
@Slf4j
public class CustomerOrder2020 extends BaseBean implements MappingImpl {


	@Column(name = "NOLUN")
	private Double nolun;

	@Column(name = "GROSS_WEIGHT")
	private Double grossweight;

	@Column(name ="NET_WEIGHT")
	private Double netWeight;

	@Column(name ="ORDER_DATE")
	private Date orderDate;

	@Column(name ="TOTAL_RPICE")
	private Double totalPrice;

	@Column(name ="NET_PRICE")
	private Double netPrice;

	@Column(name ="EDITE_DATE")
	private Date editeDate;

	@Column(name ="DUE_DATE")
	private Date dueDate;

	@Column(name ="TIPS")
	private Double tips;

	@Column(name ="COMMISSION")
	private Double commision;

	@Column(name ="NOTES")
	private String notes;

	@Column(name ="FINISHED")
	private int finished;

	@Column(name ="DUED")
	private int dued;

	@Column(name ="UNITS")
	private int units;

	@Column(name ="UNITE_PRICE")
	private Double unitePrice;

	@Column(name ="RATIO")
	private Double ratio;

	@Column(name ="BUY_PRICE")
	private Double buyPrice;

	@Column(name ="PERIOD_ID")
	private int periodId = -1;

 
	@Column(name ="CUSTOMER_ID")
	private int customerId;

 
	@Column(name ="PRODUCT_ID")
	private int productId;

	 
	@Column(name ="FRIDAGE_ID")
	private int fridageId;


	@Column(name ="ORDER_TAG")
	private String orderTag;

 
	@Column(name ="VECHILE_TYPE_ID")
	private int vehicleType;

	@Override
	public Object map(Object o) {
		CustomerOrder e=(CustomerOrder)o;
		this.setId(e.getId());
	
		this.setBuyPrice(e.getBuyPrice().doubleValue());
		this.setCommision(e.getCommision().doubleValue());
		this.setCustomerId(e.getCustomer().getId());
		this.setDued(e.getDued());
		this.setEditeDate(e.getEditeDate());
		this.setDueDate(e.getDueDate());
		this.setFinished(e.getFinished());
	
		this.setFridageId(e.getFridage().getId());
		this.setGrossweight(e.getGrossweight().doubleValue());
		this.setNetPrice(e.getNetPrice().doubleValue());
		
		this.setNetWeight(e.getNetWeight().doubleValue());
		this.setNolun(e.getNolun().doubleValue());
		this.setNotes(e.getNotes());
		this.setOrderDate(e.getOrderDate());
		this.setOrderTag(e.getOrderTag());
		this.setPeriodId(e.getPeriodId());
		this.setProductId(e.getProduct().getId());
		this.setRatio(e.getRatio().doubleValue());
		this.setTips(e.getTips().doubleValue());
		this.setTotalPrice(e.getTotalPrice().doubleValue());
		
		this.setUnitePrice(e.getUnitePrice().doubleValue());
		this.setUnits(e.getUnits());
		

		if(e.getVechileType().equals("جامبو")) {
			this.setVehicleType(VechileTypeEnum.van);
		//	log.info("customer order fridage id =>>>>>> جامبو");
		}
		
		else if(e.getVechileType().equals("دبابه")) {
	this.setVehicleType(VechileTypeEnum.car);
//	log.info("customer order fridage id =>>>>>> دبابة");
		}

		else if(e.getVechileType().equals("جامبو 1/2")) {
	this.setVehicleType(VechileTypeEnum.HVAN);
//	log.info("customer order VechileType   =>>>>>> جامبو 1/2");
}
		else {
			
			log.info("customer order VechileType   =>>>>>> not found"+e.getVechileType());

			
		}
		return this;
		
	}
	
 


}
