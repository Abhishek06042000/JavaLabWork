package com.vvp.lib.controller;

public class InsufficentUserBalanceException extends Exception
{
		public String getMessage()
		{
			return "Insufficent Balance!!";
		}
		public String toString()
		{
			return "com.vvp.lib.controller.InsufficentUserBalanceException: Insufficent Balance!!";
		}
}