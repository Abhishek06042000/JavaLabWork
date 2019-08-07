class Anagram{

	public static void main(String args[]){
		String string1=args[0];
		String string2=args[1];
		if(string1.length()!=string2.length())
		{
			System.out.println("String is not Anagram");
			System.exit(0);
		}
		else
		{
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
				System.out.println("String is Anagram");
			else
				System.out.println("String is Not Anagram");
		}
	}
}