

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

class Airport
{
	public void permit(Plane plane)
	{
		
		plane.takeOff();
		plane.fly();
		plane.landing();
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		Airport ar =new Airport();
		ar.permit(cp);
		ar.permit(pp);

	}

}
