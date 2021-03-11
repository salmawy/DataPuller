package com.util.dataPull.core.config.shop2020.entities.contractors;


import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;
import com.util.dataPull.core.config.shop2020.repo.Contractor2020Repo;
import com.util.dataPull.core.mapping.MappingImpl;

import lombok.Getter;
import lombok.Setter;

@Table(name ="CONTRACTORS")
@Entity(name ="Contractor")
@Setter
@Getter
public class Contractor2020  extends BaseBean implements MappingImpl{
	
 
	@Column(name ="NAME" )
	private String name;

	@Column(name ="ADDRESS" )
	private String address;

	@Column(name ="PHONE" )
	private String phone;

	@Column(name ="TYPE_NAME" )
	private String typeName;

	@Column(name ="OWNER_ID" )
	private int ownerId=1;

	@Column(name ="TYPE_ID" )
	private int typeId;
	
	
 
	public void setTypeId(String type) {
		
		
		switch (type) {
		case "K_L":
			this.typeId=1;
			break;

		
		case "K_S":
			this.typeId=2;
			break;
			
			

	case "K_V":
		this.typeId=3;
		break;

		default:
			break;
		}
	}
	
	
	
	
	/*UPDATE CONTRACTOR SET TYPE_ID=1 WHERE TYPE='K_L';
COMMIT;
UPDATE CONTRACTOR SET TYPE_ID=2 WHERE TYPE='K_S';
COMMIT;
UPDATE CONTRACTOR SET TYPE_ID=3 WHERE TYPE='K_V';
COMMIT;*/
	
	
	
	
	
	
	
	
	
	
	
	
 
 



	@Override
	public Object map(Object o) {
		
 		com.util.dataPull.core.config.shop.entities.Contractor oldContractor=(com.util.dataPull.core.config.shop.entities.Contractor)o;
		this.setAddress(oldContractor.getAddress());
		this.setName(oldContractor.getName());
		this.setPhone(oldContractor.getPhone());
		this.setTypeId(oldContractor.getTypeName());
		this.setId(oldContractor.getId());
		
		return this;
	 
	}


 



 
	
	

}
