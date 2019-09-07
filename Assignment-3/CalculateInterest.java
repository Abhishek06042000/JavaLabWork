import java.util.Scanner;
interface InterfaceInterest{
	public double interest(double p,double n,double r);
}
class SimpleInterest implements InterfaceInterest{
	public double interest(double p,double n,double r)
	{
		double interest = (p*n*r)/100;
		return interest;
	}
}
class CompoundInterest implements InterfaceInterest{
	public double interest(double p,double n,double r)
	{
		int noOfParts=1;
		double ans =  p*Math.pow((1+r/(100*noOfParts)),n*(noOfParts));
		double interest = ans - p;
		return interest;
	}
}
class CalculateInterest{
	public static void main(String args[]){
		SimpleInterest si = new SimpleInterest();
		CompoundInterest ci = new CompoundInterest();
		Scanner s = new Scanner(System.in);
		double p,n,r;
		int choice;
		System.out.println("\t\t:Interest Calculator:");
		while(true){
			System.out.println("\n1.SimpleInterest");
			System.out.println("2.CompoInterest");
			System.out.println("3.Exit");
			System.out.println("Enter Your Choice:");
			choice = s.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter Amount:");
						p =s.nextDouble();
						System.out.println("Enter Year:");
						n =s.nextDouble();
						System.out.println("Enter Rate:");
						r =s.nextDouble();
						double sians = si.interest(p,n,r);
						System.out.println("Your Simple Interest is : "+sians);
						break;
				case 2: System.out.println("\nCompoundInterest For 1 Year");
						System.out.println("Enter Amount:");
						p =s.nextDouble();
						System.out.println("Enter Year:");
						n =s.nextDouble();
						System.out.println("Enter Rate:");
						r =s.nextDouble();
						double cians = ci.interest(p,n,r);
						System.out.println("Your Compound Interest is : "+cians);
						break;
				case 3: System.exit(0);
						break;
			}
		}
	}
}