package oops;

abstract class Vehicle{
	abstract void speed();
	void display() {
		System.out.println("Vehicle");
	}
}

class Bike extends Vehicle{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("150 km/hr");
	}
	
}

public class AbstarctEg extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.speed();
		b.display();
		
		AbstarctEg a = new AbstarctEg();
		a.speed();
		a.display();
		
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("200 km/hr");
	}

}
