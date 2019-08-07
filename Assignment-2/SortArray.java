class SortArray{
	public static void main(String args[])
	{
		int n = args.length;
		int number[] = new int[n];
		for(int i=0;i<number.length;i++)
		{
			number[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<(number.length-1);i++)
		{
			for(int j=0;j<(number.length-i-1);j++)
			{
				if(number[j]>number[j+1])
				{
					int temp;
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Order of Array is:");
		for(int i=0;i<number.length;i++)
				System.out.println(number[i]);
	}
}