 package com.util.dataPull.core.config.shop2020.entities.userManagment;


 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

 @Table(name = "USERS")
 @Entity(name = "User")
 @Setter
 @Getter
public class User extends BaseBean  implements java.io.Serializable  {
	
	

	private static final long serialVersionUID = 1L;

     @Column(name = "NAME")
 	private String username;

     @Column(name = "PASSWORD")
	private String password;


	



}
