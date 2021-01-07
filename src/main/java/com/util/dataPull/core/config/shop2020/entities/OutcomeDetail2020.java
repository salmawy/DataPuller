package com.util.dataPull.core.config.shop2020.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.Enum.OutcomeTypeEnum;
import com.util.dataPull.core.config.shop.entities.OutcomeDetail;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "OUTCOME_DETAILS")
@Entity(name = "OutcomeDetail")
@Setter
@Getter
public class OutcomeDetail2020 extends BaseBean  implements MappingImpl  {


    @Column(name = "TYPE_NAME")
    private String typeName;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "SPENDER_NAME")
    private String spenderName;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "ORDER_ID")
    private Integer orderId;

 
    @Column(name = "FRIDAGE_ID")
    private int fridageId;

 
    @Column(name = "OUTCOME_ID")
    private int outcomeId;

     
    @Column(name = "TYPE_ID")
    private int typeId;


	@Override
	public Object map(Object o) {
		OutcomeDetail e=(OutcomeDetail)o;
		this.setId(e.getId());
		this.setAmount(e.getAmount().doubleValue());
		this.setCustomerId(e.getCustomerId());
		this.setFridageId(e.getFridage().getId());
		this.setNotes(e.getNotes());
		this.setTypeId(getIntValueOFType(e.getTypeName()));
		this.setOutcomeId(e.getOutcome().getId());
		this.setOrderId(e.getOrderId());
		this.setSpenderName(e.getSpenderName());
	
		
		
		
		return this;
	}

	
	
	private int getIntValueOFType(String typeName) {
		int type=0;
		/**
		 * 
		 * 
		 * 
		 * 
    update outcome_detail set type_id=1 where type= 'varaity'; commit;
    update outcome_detail set type_id=2 where type= 'K_L'; commit;
    update outcome_detail set type_id=3 where type= 'OUT_LOAN'; commit;
    update outcome_detail set type_id=4 where type= 'labours'; commit;
    update outcome_detail set type_id=5 where type= 'ORDER_PAY'; commit;
    update outcome_detail set type_id=6 where type= 'allah'; commit;
    update outcome_detail set type_id=7 where type= 'PURCHASES_WITHDRAWALS'; commit;
    update outcome_detail set type_id=8 where type= 'maintaince'; commit;
    update outcome_detail set type_id=9 where type= 'OUT_PAY_LOAN'; commit;
    update outcome_detail set type_id=10 where type= 'K_V'; commit;
    update outcome_detail set type_id=11 where type= 'ORDER_TIPS'; commit;
    update outcome_detail set type_id=12 where type= 'TIPS'; commit;
    update outcome_detail set type_id=13 where type= 'K_S'; commit;
    update outcome_detail set type_id=14 where type= 'NOLOUN'; commit;
    update outcome_detail set type_id=15 where type= 'forgivness'; commit;*/
		if(typeName.equalsIgnoreCase("PURCHASES_WITHDRAWALS")) {
			return OutcomeTypeEnum.PURCHASES_WITHDRAWALS;
		}
		
		else if(typeName.equalsIgnoreCase("varaity")) {
			return OutcomeTypeEnum.varaity;
		}
		
	else if(typeName.equalsIgnoreCase("K_L")) {
		return OutcomeTypeEnum.K_L;
		}
	else if(typeName.equalsIgnoreCase("OUT_LOAN")) {
		return OutcomeTypeEnum.OUT_LOAN;
	}
	else if(typeName.equalsIgnoreCase("labours")) {
		return OutcomeTypeEnum.labours;
	}
	else if(typeName.equalsIgnoreCase("ORDER_PAY")) {
		return OutcomeTypeEnum.ORDER_PAY;
	}
	else if(typeName.equalsIgnoreCase("maintaince")) {
		return OutcomeTypeEnum.maintaince;
	}
	else if(typeName.equalsIgnoreCase("OUT_PAY_LOAN")) {
		return OutcomeTypeEnum.OUT_PAY_LOAN;
	}
	else if(typeName.equalsIgnoreCase("K_V")) {
		return OutcomeTypeEnum.K_V;
	}
	else if(typeName.equalsIgnoreCase("ORDER_TIPS")) {
		return OutcomeTypeEnum.INVOICE_TIPS;
	}
	else if(typeName.equalsIgnoreCase("TIPS")) {
		return OutcomeTypeEnum.TIPS;
	}
	else if(typeName.equalsIgnoreCase("K_S")) {
		return OutcomeTypeEnum.K_S;
	}
	else if(typeName.equalsIgnoreCase("NOLOUN")) {
		return OutcomeTypeEnum.NOLOUN;
	}
	else if(typeName.equalsIgnoreCase("forgivness")) {
		return OutcomeTypeEnum.forgivness;
	}
	else if(typeName.equalsIgnoreCase("allah")) {
		return OutcomeTypeEnum.allah;
	}
	
		
		
		
		
		
		
		
		
		
		
		return type;
		
	}
	
	
	

}
