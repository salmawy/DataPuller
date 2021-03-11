package com.util.dataPull.core.config.shop2020.entities.expanses;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

@Table(name = "SAFE")
@Entity(name = "Safe")
@Setter
@Getter
public class Safe extends BaseBean {

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "BASE_AMOUNT")
    private Double baseAmount;

    
    @Column(name = "SEASON_ID")
    private int seasonId;


}
