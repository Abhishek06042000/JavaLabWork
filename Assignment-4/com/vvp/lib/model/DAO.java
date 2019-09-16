package com.vvp.lib.model;

public class DAO{
	public static Student student[]=new Student[5];
	public static User user[]=new User[4];
	public static Staff staff[]=new Staff[2];
	public static Media media[]=new Media[2];
	public static SoftMedia softMedia[]=new SoftMedia[4];
	public static HardMedia hardMedia[]=new HardMedia[4];
	
		public static void initData()
		{
			student[0]=new Student(1,"AB","170470107003","5",4);
			student[1]=new Student(2,"RN","170470107037","3",4);
			student[2]=new Student(3,"KL","170470107027","1",4);
			student[3]=new Student(4,"DR","170470107027","4",4);
			student[4]=new Student(5,"PN","170470107027","2",4);
			
			
			staff[0]=new Staff(1,"Darshit","Clerk",6);
			staff[0]=new Staff(1,"ABC","Mgmt",6);
			
			
			hardMedia[0] = new HardMedia(1,"Algorithm",1,"a1");
			hardMedia[1] = new HardMedia(2,"Java",1,"a2");
			hardMedia[2] = new HardMedia(3,"SP",1,"a1");
			hardMedia[3] = new HardMedia(4,"MPI",1,"a2");
			
			softMedia[0] = new SoftMedia(1,"Algorithm",1.2,1);
			softMedia[1] = new SoftMedia(2,"Java",2.3,1);
			softMedia[2] = new SoftMedia(3,"SP",1.2,1);
			softMedia[3] = new SoftMedia(4,"MPI",4.3,1);

			
		}
}
			
			
			
			
			