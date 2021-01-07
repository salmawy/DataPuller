package com.util.dataPull.core.config.shop2020.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "OUTCOME_TYPES")
@Entity(name = "OutcomeType")
@Setter
@Getter
public class OutcomeType2020 extends BaseBean {
	@Column(name = "NAME")
	private String name;

	@Column(name = "NAME_AR")
	private String nameAr;

}
