package com.util.dataPull.core.Enum;

import com.gomalmarket.shop.core.Enum.EnumClass;

public enum ShopLoanTransactionEnum implements EnumClass<String> {
	PAY_CREDIT("PAY_CREDIT")
	,PAY_DEBIT("PAY_DEBIT")
	,LOAN_CREDIT("LOAN_CREDIT")
	,LOAN_DEBIT("LOAN_DEBIT");

	
	private String id ;
	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	private ShopLoanTransactionEnum(String id ) {
		this.id=id;
		
		// TODO Auto-generated constructor stub
	}
	
	 public static ShopLoanTransactionEnum fromId(String id) {
	        for (ShopLoanTransactionEnum at : ShopLoanTransactionEnum.values()) {
	            if (at.getId().equals(id)) {
	                return at;
	            }
	        }
	        return null;
	    }
}
