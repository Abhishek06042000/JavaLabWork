import java.util.Scanner;

abstract class Shape{
	abstract void calculateArea(float x,float y);	
}
class Triangle extends Shape{
		void calculateArea(float base,float height)
		{
			float ans=(base*height);
			double area=((0.5)*ans);
			System.out.println("Area of Triangle: " +area);				
		}			
}
class Square extends Shape{
		void calculateArea(float base,float a)
		{
			float ans=(base*base);
			System.out.println("Area of Square: " +ans);				
		}			
}
class Rectangle extends Shape{
		void calculateArea(float length,float width)
		{
			float ans=(length*width);
			System.out.println("Area of Rectangle: " +ans);	
		}			
}
class Circle extends Shape{
		void calculateArea(float radius,float a)
		{
			double ans=(radius*radius*3.14);
			System.out.println("Area of Circle: " +ans);				
		}			
}
class ShapeCal{
	
	public static void main(String args[]){
			Triangle t=new Triangle();
			Square sq=new Square();
			Rectangle r=new Rectangle();
			Circle c=new Circle();
			Scanner getchoice = new Scanner(System.in);
			Scanner getValue = new Scanner(System.in);
			while(true)
			{
				System.out.println("\n\t\t:Shape Area Calculate:\n");
				System.out.println("1.Area of Triangle");
				System.out.println("2.Area of Squre");
				System.out.println("3.Area of Rectangle");
				System.out.println("4.Area of Circle");
				System.out.println("5.Exit");
				System.out.println("Enter Your choice:");
				int choice = getchoice.nextInt();
					switch(choice)
					{
							case 1:	System.out.println("Enter Base: ");
									float x1 = getValue.nextFloat();
									System.out.println("Enter height: ");
									float y1 = getValue.nextFloat();
									t.calculateArea(x1,y1);
									break;
							case 2:	System.out.println("Enter base: ");
									float x2 = getValue.nextFloat();
									sq.calculateArea(x2,0);
									break;
							case 3:	System.out.println("Enter length: ");
									float x3 = getValue.nextFloat();
									System.out.println("Enter width: ");
									float y3 = getValue.nextFloat();
									r.calculateArea(x3,y3);
									break;
							case 4:	System.out.println("Enter radius: ");
									float x4 = getValue.nextFloat();
									c.calculateArea(x4,0);
									break;
							case 5:
									System.exit(0);
									break;
							default:
									System.out.println("Invalid Number of Choice");
									System.exit(0);
									break;
					}
			}
	
	}
}