class Html{
	public static void main(String args[]){
		String htmlTag=args[0];
		int flag=0;
		char ch;
		for(int i = 0; i < htmlTag.length(); i++)
        {
			ch=htmlTag.charAt(i);
            if( ch == '<')
            {
                flag = 0;
            }
            else if(ch == '>')
            {
                flag = 1;
            }
			else if(flag == 1)
            {
                System.out.print(ch);
            }
        }
	}
}