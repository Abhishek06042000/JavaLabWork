public class PrimeNumber{
	/**	
			Invalid number of parameter<br>
			i.e. java PrimeNumber <number><br>
			<number> <br> Any type of number<br>
			i.e. java PrimeNumber 10<br>
	**/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Invalid number of parameter");
			System.out.println("i.e. java PrimeNumber <number>");
			System.out.println("<number> \n Any type of number");
			System.out.println("i.e. java PrimeNumber 10");
			System.exit(0);
		}
		int n=Integer.parseInt(args[0]);
		int flag=0;
		System.out.println("Prime Number Upto "+ n + ":\n");
		int c=1;
		for(int i=2;c<=n;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
					if(i%j==0)
					{
						flag=1;
						break;
					}
			}
			if(flag==0)
			{
				System.out.println(i);
				
				c++;
			}
		}
	}
}