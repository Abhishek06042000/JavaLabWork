class ValidateEmail{
	public static void main(String args[]){
		String email=args[0];
		int firstCharUniCode=email.codePointAt(0);
		if(!((firstCharUniCode>=48 && firstCharUniCode<=57) || (firstCharUniCode>=97 && firstCharUniCode<=122)))
		{
			System.out.println("Not ValidateEmail,Your first Letter must be small");
			System.exit(0);
		}
		String emailPart[]=email.split("@");
		int emailNameLength=emailPart[0].length();

		if(emailNameLength<=8 ||emailNameLength>=20)
		{
			System.out.println("Not ValidateEmail,Username Length between 8 to 20");
			System.exit(0);
		}
		for(int i=1;i< emailNameLength;i++)
		{
			int charUniCode=emailPart[0].codePointAt(i);
			//Ascii Code= (48 to 57-> 0 to 9),(46->.),(95->_),(45->-)
			if(!((charUniCode>=48 && charUniCode<=57) || (charUniCode>=65 && charUniCode<=90) || (charUniCode>=97 && charUniCode<=122) || (charUniCode==46) || (charUniCode==95) || (charUniCode==45)))		
			{				
				System.out.println("Not ValidateEmail,Only a-z, A-z, 0 to 9 and underscore, - and dot are valid");
				System.exit(0);
			}
		}

		int atPosition = email.indexOf('@');
		if(atPosition == -1)
		{
				System.out.println("Not ValidateEmail,Atleast One '@' is required!!");
				System.exit(0);
		}	
		if(atPosition != -1)	
		{
			int dotPosition = email.indexOf('.');
				if(dotPosition == -1)
				{	
					System.out.println("Not ValidateEmail,Domain name is required");
					System.exit(0);
				}
				if(dotPosition != -1)
				{
					if(dotPosition  - atPosition <= 3)
					{
						System.out.println("Not ValidateEmail,Distance between @ and . must be more than 2");
						System.exit(0);
					}
				}
		}
		System.out.println("ValidateEmail!!");
				
	}
	
}
