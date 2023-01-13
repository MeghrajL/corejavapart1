package oops;

class car{
	int wheels = 4;	
}

class Tata extends car{
	boolean has4Airbags = true;
}

class Safari extends Tata{
	boolean hasSunroof = true;
}

public class MultilevelCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s = new Safari();
		System.out.println("wheels " + s.wheels + " has 4 airbags " + s.has4Airbags + " has sunroof " + s.hasSunroof);
	}

}
