class TypeWriter extends Thread{
	String message;
	TypeWriter()
	{	
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try{
				message="\nWelcome to Windows 10!![Testing Thread TypeWriter]\n";
				for(int i=0;i<message.length();i++)
				{
					System.out.print(message.charAt(i));
					Thread.sleep(150);
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		TypeWriter tw=new TypeWriter();
	}
	
}
			
		