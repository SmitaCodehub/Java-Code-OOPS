import java.util.Scanner;

// program demonstrates application of Inheritance, polymorphism and Abstaction

abstract class Shape
{
	
	
	double area;
	abstract public void input();
	abstract public void compute();
	//abstract void display();
	public void display()
	{
		System.out.println("Area Is : " + area);
	}
	
}

class Rectangle extends Shape
{
	double length;
	double breadth;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Length of Rectangle");
		length=scan.nextDouble();
		System.out.println("Please Enter the Breadth of Rectangle");
		breadth=scan.nextDouble();
	}
	
	public void compute()
	{
		area= length*breadth;
	}
		
}
class Square extends Shape
{
	double length;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Length of Square");
		length=scan.nextDouble();
	}
	
	public void compute()
	{
		area= length*length;
	}
	
	
}
class Circle extends Shape
{
	double radius;
	final double PI=3.14;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the radius of the Circle");
		radius=scan.nextDouble();
	}
	
	public void compute()
	{
		area= PI*radius*radius;
	}
		
}

class Geometry
{
	public void permit(Shape shape)
	{
		shape.input();
		shape.compute();
		shape.display();
	}
}

public class LaunchProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape rect=new Rectangle();
//		Shape sq=new Square();
//		Shape cir=new Circle();
		Rectangle rect=new Rectangle();
		Square sq=new Square();
		Circle cir=new Circle();

		
		Geometry gm=new Geometry();
		gm.permit(rect);
		gm.permit(sq);
		gm.permit(cir);

	}

}
