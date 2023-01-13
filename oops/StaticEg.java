package oops;


class StaticDemo{
	static int a=10;
	static void display() {
		System.out.println(a);
	}
}

public class StaticEg {

	static int b=20;
	static void display2() {
		System.out.println(StaticDemo.a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.display();
		display2();
	}

}
