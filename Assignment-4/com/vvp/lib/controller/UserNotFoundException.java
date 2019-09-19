package com.vvp.lib.controller;

public class UserNotFoundException extends Exception
{
		public String getMessage()
		{
			return "Invalid Student!!";
		}
		public String toString()
		{
			return "com.vvp.lib.controller.UserNotFoundException: Invalid Student!!";
		}
}