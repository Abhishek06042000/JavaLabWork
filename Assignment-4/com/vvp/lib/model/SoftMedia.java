package com.vvp.lib.model;

public class SoftMedia extends Media{
			public double size;
			public int availibity;
			SoftMedia(int id,String bookTitle)
			{
				super(id,bookTitle);
			}		
			SoftMedia(int id,String bookTitle,double size,int availibity)
			{
				super(id,bookTitle);
				this.size=size;
				this.availibity=availibity;
			}
}