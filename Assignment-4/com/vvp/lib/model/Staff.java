package com.vvp.lib.model;

public class Staff extends User{
	public String userType;
	public int balance;
	Staff(int id,String name,String userType,int balance)
	{
			super(id,name);
			this.userType=userType;
			this.balance=balance;
	}
}
