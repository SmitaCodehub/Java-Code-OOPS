

class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void landing()
	{
		System.out.println("Plane is landing");
	}
	
}
class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("CargoPlane is flying at low height");
	}
}

class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("PassengerPlane is flying at medium");
	}
}


public class PolyDemo1 {

	public static void main(String[] args) {
		
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
				
		 Plane plane;
		 
		 plane=cp;
		 plane.takeOff();//1:M
		 plane.fly();
		 plane.landing();
	 
		plane=pp;
	 
	     plane.takeOff();//1:M
		 plane.fly();
		 plane.landing();
		

	}

}
