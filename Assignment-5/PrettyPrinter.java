class Printer
{
	synchronized public void print(String message)
	{
		System.out.print("[");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.print(message);
		System.out.print("]");
	}
}

class User extends Thread
{
	Printer p;
	String printJob;
	
	User(String printJob,Printer p)
	{
		this.p=p;
		this.printJob=printJob;
		Thread t=new Thread(this);
		
	}
	
	public void run()
	{
		p.print(printJob);
	}
}

class PrettyPrinter
{
	public static void main(String args[])
	{
		try
		{
			Printer p =new Printer();
			User u1=new User("Hi !!!",p);
			u1.start();
			u1.join();
			User u2=new User("How",p);
			u2.start();
			u2.join();
			User u3=new User("are you??",p);
			u3.start();
			u3.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


