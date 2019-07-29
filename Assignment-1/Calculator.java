class Calculator{	
	/**	
			Invalid number of parameter<br>
			i.e. java Calculator <operand1> <operator> <operand2><br>
			<operand1> <br> Any type of number<br>
			<operator> <br> ArithmeticException<br>
			<operand2> <br> Any type of number<br>
			i.e. java Calculator 10 + 20<br>
	**/

	public static void main(String args[]){
		if(args.length!=3)
			{
				System.out.println("Invalid number of parameter");
				System.out.println("i.e. java java Calculator <operand1> <operator> <operand2>");
				System.out.println("<operand1> \n Any type of number");
				System.out.println("<operator> \n ArithmeticException");
				System.out.println("<operand2> \n Any type of number");
				System.out.println("i.e. java Calculator 10 + 20");
				System.exit(0);
			}
		float n1=Float.parseFloat(args[0]);
		char op=args[1].charAt(0);
		float n2=Float.parseFloat(args[2]);
		if(op=='+'){
			System.out.println("Your Ans is:"+ (n1+n2));
		}
		if(op=='-'){
			System.out.println("Your Ans is:"+ (n1-n2));
		}
		if(op=='*'){
			System.out.println("Your Ans is:"+ n1*n2);
		}
		if(op=='/'){
			System.out.println("Your Ans is:"+ n1/n2);
		}
	}
}