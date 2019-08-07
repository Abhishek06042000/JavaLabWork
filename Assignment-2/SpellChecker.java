class SpellChecker{

	public static void main(String args[]){
		String array[]={"Abhishek","Kuldip","Rushi","Parth","Darshit"};
		String string1=args[0];
	
			int a[]=new int[26];
			int b[]=new int[26];
			for(int i=0;i<string1.length();i++)
			{
				int charUniCode=string1.codePointAt(i);
				if(charUniCode>=65 && charUniCode<=91)
					a[charUniCode - 65]++;
				if(charUniCode>=97 && charUniCode<=122)
					a[charUniCode - 97]++;
			}
			for(int j=0;j<array.length;j++)
			{
				String string2 = array[j];
				for(int i=0;i<string2.length();i++)
				{
					int charUniCode=string2.codePointAt(i);
					if(charUniCode>=65 && charUniCode<=91)
						b[charUniCode - 65]++;
					if(charUniCode>=97 && charUniCode<=122)
						b[charUniCode - 97]++;
				}
				boolean flag=true;
				for(int i=0;i<26;i++)
				{
					if(a[i]!=b[i])
					{
						flag = false;
						break;			
					}
					
				}
				if(flag)
				{
					System.out.println("String is Anangram");
					System.out.println("Correct Spelling is: "+string2);
					System.exit(0);
				}
				for(int k=0;k<26;k++)
					b[k]=0;
				
				
			}
			System.out.println("Word Not in Array");
	}
}