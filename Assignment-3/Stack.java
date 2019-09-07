import java.util.Scanner;

public class Stack{
	public static void main(String args[])
	{
		int n=args.length;
		int top=0,j=0;
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			//System.out.println(array[i]);
		
		}
		Temp t=new Temp();
		Scanner switchValue = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1.Push\n2.Pop\n3.Exit\n");
			System.out.println("Enter Value:");
			int ch = switchValue.nextInt();
		
			switch(ch)
			{
				case 1:	if(j<n){
							int check = t.push(array[j]);
							if(check==1)
							j++;
						}
						else{
							System.out.println("No element for Push");
							System.exit(0);
						}
					break;
			
				case 2: t.pop();
						break;
				case 3:System.exit(0);
						break;
		
			}

		}
							
	}
	
}
class Temp{
		
		int stack[]=new int[10];
		int top;
		Temp(){
			top=-1;
		}
		public int push(int x)
		{
			if(top>=5){
			System.out.println("Full");
			return 0;
			}
			else
			{
				top++;
				stack[top]=x;
				System.out.println("Insted");
				System.out.println("After Push Opeartion Stack:");
				for(int i=0;i<stack.length;i++)
				{
					System.out.println(stack[i]);
				}
				return 1;
			
			}
		}
		
		public void pop()
		{
			if(top<0)
				System.out.println("Stack Empty");
			else{
				int n=stack[top];
				top--;
				System.out.println("Element " +n +" Pop"); 
				System.out.println("After Pop Opeartion Stack:");
				for(int i=0;i<stack.length;i++)
				{
					System.out.println(stack[i]);
				}
			}
		}


}