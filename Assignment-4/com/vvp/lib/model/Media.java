package com.vvp.lib.model;

public class Media{
	public int bookId;
	public String bookTitleName,author;
	Media(){}
	Media(int bookId,String bookTitleName)
	{
		this.bookId=bookId;
		this.bookTitleName=bookTitleName;
		
	}
	Media(int bookId,String bookTitleName,String bookAuthor)
	{
		this.bookId=bookId;
		this.bookTitleName=bookTitleName;
		this.author=bookAuthor;
	}
	

}