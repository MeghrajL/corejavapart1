package oops;

class StaticMethodDemo{
	static int add(int a,int b) {
		return a+b;
	}
	
	float div(float a,float b) {
		return a/b;
	}
	
	String greet() {
		return "Hello";
	}
}

public class StaticMethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo smd =  new StaticMethodDemo();
		System.out.println(smd.div(43.45f,12.2f)); 
		System.out.println(smd.greet());
		System.out.println(StaticMethodDemo.add(10, 20));
	}

}
