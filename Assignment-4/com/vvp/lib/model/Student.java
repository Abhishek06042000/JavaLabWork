package com.vvp.lib.model;

public class Student extends User{

	public String enrollNo,semester;
	public int balance;
	Student(int id,String enrollNo){
		super(id,enrollNo);			
	}
	Student(int id,String name,String enrollNo,String semester,int balance)
	{
		super(id,name);
		this.enrollNo=enrollNo;
		this.semester=semester;
		this.balance=balance;
	}
}
