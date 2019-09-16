package com.vvp.lib.controller;
import static com.vvp.lib.model.DAO.*;

public class Transaction{
	
	public String issueBook(int bookId,int userId,String userType)
	{
		String userTypeName="student";
		if(userType.equals(userTypeName))
		{
			int i,j;
				for(i=0;i<student.length;i++)
				{
					if(student[i].userid==userId)
						break;				
				}
				for(j=0;j<hardMedia.length;j++)
				{
					if(hardMedia[j].bookId==bookId)
						break;
				}
				if(i==student.length)
					return "Invalid Student";
				if(j==hardMedia.length)
					return "Invalid BookId";
			
				if(student[i].balance < 1)
					return "Insufficent Balance";

				if(hardMedia[j].availibity < 1)
					return "Book is not available";

				student[i].balance--;
				hardMedia[j].availibity--;			
	
			return "Issuebook is successfully done by Student.";		
		}
		
		userTypeName="staff";
		
		if(userType.equals(userTypeName))
		{
		
			int i,j;
				for(i=0; i <= staff.length; i++)
				{
					if(staff[i].userid == userId)
						break;
				}
		
				for(j = 0; j <= hardMedia.length; j++)
				{	
					if(hardMedia[j].bookId == bookId)
						break;        
				}
				if(i == staff.length)
					return "Invalid StaffId";
				if(j == hardMedia.length)
					return "Invalid BookId";
		
				if(staff[i].balance < 1)
					return "Insufficient balance to issue book"; 
		
				if(hardMedia[j].availibity < 1)
					return "Book is not available";
				
				staff[i].balance--;
				hardMedia[j].availibity--;
			
			return "Issuebook is successfully done by Staff.";
		}
		return "Error in Code!!";
	}
	
	
	public String returnBook(int bookId,int userId,String userType)
	{
		String userTypeName="student";
		
		if(userType.equals(userTypeName))
		{
			int i,j;
				for(i=0;i<student.length;i++)
				{
					if(student[i].userid==userId)
						break;				
				}
				for(j=0;j<hardMedia.length;j++)
				{
					if(hardMedia[j].bookId==bookId)
						break;
				}
				if(i==student.length)
					return "Invalid Student";
				if(j==hardMedia.length)
					return "Invalid BookId";
			
				if(student[i].balance == 4)
					return "Invalid operation";
	
				if(hardMedia[j].availibity == 1)
					return "Invalid Book Operation";

				student[i].balance++;
				hardMedia[j].availibity++;
			
			return "Returnbook is successfully done by Student.";
		}
		
		userTypeName="staff";
		
		if(userType.equals(userTypeName))
		{
			int i,j;
				for(i=0; i <= staff.length; i++){
					if(staff[i].userid == userId)
						break;	
				}
				for(j = 0; j <= hardMedia.length; j++){	
					if(hardMedia[j].bookId == bookId)
						break;        
				}	
				
				if(i == staff.length)
					return "Invalid StaffId";				
				if(j == hardMedia.length)
					return "Invalid BookId";
				
				
				if(staff[i].balance < 1)
					return "Insufficient balance to issue book"; 	
				
				if(hardMedia[j].availibity < 1)
					return "Book is not available";
			
				staff[i].balance++;
				hardMedia[j].availibity++;
				
			return "Returnbook is successfully done by Staff.";
		}
		return "Error in Code!!";
	}
	
	
	public int checkBalance(int userId,String userType) {
		
		String userTypeName="student";
		
		if(userType.equals(userTypeName))
		{
			for(int i = 0; i < student.length; i++)
			{
				if(student[i].userid == userId)	
					return student[i].balance;
			}
			return -1;
		}
		
		userTypeName="staff";
		
		if(userType.equals(userTypeName))
		{
			for(int j = 0; j < staff.length; j++)
			{
				if(staff[j].userid == userId)	
					return staff[j].balance;
			}
			return -1;
		
		}
		return -1;
	}
	
	public int searchBook(int bookId){

		for(int i = 0; i <hardMedia.length; i++)
			{
				if(hardMedia[i].bookId == bookId)
				{
					return hardMedia[i].availibity;
				}	
			}
			return -1;
	}
		
	public int searchBook(String bookTitle){

		for(int i = 0; i < hardMedia.length; i++)
			{ 
				if(hardMedia[i].bookTitleName.equals(bookTitle))
				{
					return hardMedia[i].availibity;
				}	
			}
			return -1;
	}	
	
}
		