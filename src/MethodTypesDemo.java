

//Inherited method(), Overridden method(), Specialized Method() 

//Inherited methods methods inherited from parent b child as it is.

class Parents
{
	public void cry()
	{
		System.out.println("Parents crying");
	}
}

class Child11 extends Parents
{
	public void cry()   // Overridden method()
	{
		System.out.println("Child1 crying");
	}
	public void eat()  //Specialized Method() 
	{
		System.out.println("Child 1 eats less");
	}
	
}
class Child12 extends Parents
{
	public void cry()  // Overridden method()
	{
		System.out.println("Child2 crying");
	}
	public void eat()  //Specialized Method() 
	{
		System.out.println("Child 2 eats more");
	}
}
public class MethodTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p=new Child11();  //loose Coupling
		p.cry();
		//p.eat(); // directly using parent type ref yopu cannot call child class specilzed methods
		((Child11) p).eat();//downcasting to use specialized method
		
		Parents p2=new Child12(); //loose Coupling
		p2.cry();
		((Child12) p2).eat();

	}

}

