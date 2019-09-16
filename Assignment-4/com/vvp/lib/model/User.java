package com.vvp.lib.model;

public class User{
	public String username,userType;
	public int userid;
	User(){}
	User(int id,String name)
	{
		this.userid=id;
		this.username=name;
	}
	User(int id,String name,String type){
		this.userid=id;
		this.username=name;
		this.userType=type;
	}
}
