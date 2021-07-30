package com.util.dataPull.core.config.shop2020.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
@MappedSuperclass

@Setter
@Getter
public class BaseBean {
 


	@Column(name = "CHANGER_ID")
	private Integer changerId;

	@Column(name = "TIMESTAMP_")
	private Timestamp timestamp;

	@Column(name = "CHANGE_DATE")
	private Date changeDate;

	@Column(name = "CHANGED")
	private Integer changed=1;

	
	public BaseBean() {
		this.changed=1;
		this.timestamp=new Timestamp(new Date().getTime());
		this.changeDate=new Date();
	//	this.changerId=ApplicationContext.currentUser.getId();
	
	
	}


}
