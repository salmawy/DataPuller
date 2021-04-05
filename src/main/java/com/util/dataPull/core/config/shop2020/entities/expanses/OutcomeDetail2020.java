package com.util.dataPull.core.config.shop2020.entities.expanses;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.util.dataPull.core.Enum.OutcomeTypeEnum;
import com.util.dataPull.core.config.shop.entities.OutcomeDetail;
import com.util.dataPull.core.mapping.MappingImpl;

@Table(name = "OUTCOME_DETAILS")
@Entity(name = "OutcomeDetail")
@DiscriminatorValue("OUTCOME")
public class OutcomeDetail2020 extends SafeTransaction  implements MappingImpl  {


  public Integer getCustomerId() {
	  return this.getPersonId();
  }
   
  public Integer getCustomerOrderId() {
	  return this.getOrderId();
  }

  
  public void setCustomerId(Integer id ) {
	   this.setPersonId(id);
  }
   
  public void setCustomerOrderId(Integer id ) {
	   this.setOrderId(id);
  }


	@Override
	public Object map(Object o) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		OutcomeDetail e=(OutcomeDetail)o;
		this.setId(e.getId());
		this.setSeasonId(e.getOutcome().getSeason().getId());
		this.setAmount(e.getAmount().doubleValue());
		this.setCustomerId(e.getCustomerId());
		this.setFridageId(e.getFridage().getId());
		this.setNotes(e.getNotes());
		this.setTypeId(getIntValueOFType(e.getTypeName()));
 		this.setCustomerOrderId(e.getOrderId());
		this.setCreatorName(e.getSpenderName());
		this.setTransactionDate(e.getOutcome().getOutcomeDate());
		try {
			this.setTransactionDay(sdf.parse(sdf.format(e.getOutcome().getOutcomeDate())));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
