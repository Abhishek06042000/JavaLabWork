package com.vvp.lib.controller;

public class InsufficentBookBalanceException extends Exception
{
		public String getMessage()
		{
			return "Book is not available!!";
		}
		public String toString()
		{
			return "com.vvp.lib.controller.InsufficentBookBalanceException: Book is not available!!";
		}
}