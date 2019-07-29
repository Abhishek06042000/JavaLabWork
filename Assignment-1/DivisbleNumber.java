public class DivisbleNumber{
	/**	
			Invalid number of parameter<br>
			i.e. java DivisbleNumber <number1> <number2> <number><br>
			<number1> <br> Any type of number(Starting Number of Range)<br>
			<number2> <br> Any type of number(Ending Number of Range)<br>
			<number> <br> Any type of number(Divisble Number)<br>
			i.e. java DivisbleNumber 10 20 5<br>
	**/
	public static void main(String args[]){
		if(args.length!=3)
		{
			System.out.println("Invalid number of parameter");
			System.out.println("i.e. java DivisbleNumber <number1> <number2> <number>");
			System.out.println("<number1> \n Any type of number (Starting Number of Range)");
			System.out.println("<number2> \n Any type of number (Ending Number of Range)");
			System.out.println("<number> \n Any type of number (Divisble Number)");
			System.out.println("i.e. java DivisbleNumber 10 20 5");
			System.exit(0);
		}
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n=Integer.parseInt(args[2]);

		System.out.println("\nNumber Which Divisble By "+ n +" are Following:");
		for(int i=n1;i<=n2;i++)
		{
			if(i%n==0){
				System.out.println(i);
				//System.out.print(",");
			}			
		}		
	}

}