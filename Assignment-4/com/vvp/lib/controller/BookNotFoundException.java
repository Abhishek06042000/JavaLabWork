package com.vvp.lib.controller;

public class BookNotFoundException extends Exception
{
		public String getMessage()
		{
			return "Invalid BookId!!";
		}
		public String toString()
		{
			return "com.vvp.lib.controller.BookNotFoundException: Invalid BookId!!";
		}
}