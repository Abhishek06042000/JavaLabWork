interface P{
	int pVar=5;
	public void displayP();
}
interface P1 extends P{
	int p1Var=10;
	public void displayP1();
}
interface P2 extends P{
	int p2Var=15;
	public void displayP2();
}
interface P12 extends P1,P2{
	int p12Var=20;
	public void displayP12();
}

class Q implements P12{
	public void displayP()
	{
		System.out.println("Diplay P variable "+pVar);
	}
	public void displayP1()
	{
		System.out.println("Diplay P1 variable "+p1Var);
	}
	public void displayP2()
	{
		System.out.println("Diplay P2 variable "+p2Var);
	}
	public void displayP12()
	{
		System.out.println("Diplay P12 variable "+p12Var);
	}		
}
class InterfaceExample{
	public static void main(String args[])
	{
		Q q1=new Q();
		q1.displayP();
		q1.displayP1();
		q1.displayP2();
		q1.displayP12();
	}
}