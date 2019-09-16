package com.vvp.lib.model;

public class HardMedia extends Media{
			HardMedia(int id,String bookTitle)
			{
				super(id,bookTitle);
			}
			public int availibity;
			public String issueNo;
			HardMedia(int id,String bookTitleName,int availibity,String issueNo)
			{
				super(id,bookTitleName);
				this.availibity=availibity;
				this.issueNo=issueNo;
			}
}