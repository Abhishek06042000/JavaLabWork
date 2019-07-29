	class NumberConverter{
		
		/*	
				Invalid number of parameter
				i.e. java Binary <option> <value>
				<option> <br> 1.Binary2Decimal <br> 2.Decimal2Binary
				<value> <br> Any type of number
				i.e. java Binary 1 1010    
		*/
		
		public static void main(String args[]){
			if(args.length!=2)
			{
				System.out.println("Invalid number of parameter");
				System.out.println("i.e. java Binary <option> <value>");
				System.out.println("<option> \n 1.Binary2Decimal \n 2.Decimal2Binary");
				System.out.println("<value> \n Any type of number");
				System.out.println("i.e. java Binary 1 1010");
				System.exit(0);
			}
				int option=Integer.parseInt(args[0]);  
				int value=Integer.parseInt(args[1]);
				int decimal =0,p=0;
			   
				
			if(option == 1)
			{
				 while(value!=0)
				{
					decimal+=((value%10)*Math.pow(2,p));
					value=value	/10;
					p++;
				}
				p=0;
				System.out.println(decimal);
			}
			else
			{
				String binary =new String();
				int b=0;
				while(value!=0)
				{
					
					b=value%2;
					binary =b+binary;
					value = value/2;
				}
				System.out.println(binary);
			}		
		}
	}