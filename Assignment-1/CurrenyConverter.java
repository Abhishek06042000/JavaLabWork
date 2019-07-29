public class CurrenyConverter{
	/**	
			 Invalid number of parameter<br>
			 i.e. java CurrenyConverter <currencyType> <currencyValue><br>
			 <currencyType> <br> 1.USD2INR <br> 2.INR2USD<br>
			 <currency Value> <br> Any type of number<br>
			 i.e. java CurrenyConverter 1 700
	**/
	public static void main(String args[]){
		if(args.length!=2)
		{
			System.out.println("Invalid number of parameter");
			System.out.println("i.e. java CurrenyConverter <currencyType> <currencyValue>");
			System.out.println("<currencyType> \n 1.USD2INR \n 2.INR2USD");
			System.out.println("<currency Value> \n Any type of number");
			System.out.println("i.e. java CurrenyConverter 1 700");
			System.exit(0);
		}
		int currencyType = Integer.parseInt(args[0]);
		double currencyValue = Double.parseDouble(args[1]);
		int rate = 70;
		if(currencyType == 1)
		{
			System.out.println("$" +currencyValue + "=" + (currencyValue*70) + "INR");
		}
		else
		{
			System.out.println(currencyValue + "INR =" + "$" + (currencyValue/70));
		}
	}
}