package com.vvp.lib.view;
import java.util.*;
import com.vvp.lib.model.DAO;
import com.vvp.lib.controller.*;



class LibView extends Thread{
		
		void initview()
		{	
		
			DAO data = new DAO();
			data.initData();
			Transaction t= new Transaction();
			Scanner input=new Scanner(System.in);
			int  choice;
			Scanner s1=new Scanner(System.in);
			
			while(true)
			{
				
				
				System.out.println("\n1.Issue Book");
				System.out.println("2.Return Book");
				System.out.println("3.Check your Balance");
				System.out.println("4.Search Book by id");
				System.out.println("5.Search Book by title");
				System.out.println("6.Exit");
				System.out.println("\nEnter Your Choice:");
				choice=input.nextInt();
				int userId,bookId;
				String userType;
				switch(choice)
				{	
					case 1:	System.out.println("Issue Book:\n");
							System.out.println("Enter User Type");
							userType=input.next();
							String userTypeIssue=userType.toLowerCase();
							System.out.println("Enter User Id:");
							userId=input.nextInt();
							System.out.println("Enter Book Id");
							bookId=input.nextInt();					
							String issueBook = t.issueBook(bookId,userId,userTypeIssue);
							System.out.println(issueBook);
							break;
					case 2:	System.out.println("Return Book:\n");
							System.out.println("Enter User Type");
							userType=input.next();
							String userTypeReturn=userType.toLowerCase();
							System.out.println("Enter User Id:");
							userId=input.nextInt();
							System.out.println("Enter Book Id");
							bookId=input.nextInt();
							String returnBook = t.returnBook(bookId,userId,userTypeReturn);
							System.out.println(returnBook);
							break;
							
					case 3:	System.out.println("Chcek Balance:\n");
							System.out.println("Enter User Type");
							userType=input.next();
							String userTypeBalance=userType.toLowerCase();
							System.out.println(userType);
							System.out.println("Enter User Id:");
							userId = input.nextInt();
							int balance = t.checkBalance(userId,userTypeBalance);
							if (balance == -1)
								System.out.println("Invalid UserId!!!");
							else
								System.out.println("Balance of UserId " + userId + " is " + balance);
							break;
							
					case 4:	System.out.println("Search Book By id:\n");
							System.out.println("Enter Book Id:");
							bookId = input.nextInt();
							int available = t.searchBook(bookId);
							if(available == -1)
								System.out.println("Invalid BookId!!!");
							else
								System.out.println(available + " books available with bookId " + bookId);
							break;
							
					case 5:	System.out.println("Search Book by Title:\n");
							System.out.println("Enter book title:");
							String bookTitle = input.next();
							available = t.searchBook(bookTitle);
							if(available == -1)
								System.out.println("Invalid BookId!!!");
							else
								System.out.println(available + " books available with title " + bookTitle);
							break;
							
					case 6:	System.exit(0);
							break;
							
				}
			}
		}
		public static void main(String args[])
		{
				
				LibView lb= new LibView();
				lb.initview();
			
		}
}
			