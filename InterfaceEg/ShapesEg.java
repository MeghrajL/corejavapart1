package InterfaceEg;

interface Polygon{
	void getArea(int breadth,int length);
}

class Rectangle implements Polygon{
	public void getArea(int breadth,int length) {
		System.out.println("Area " + length*breadth);		
	}
}

public class ShapesEg {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.getArea(10,20);
	}

}