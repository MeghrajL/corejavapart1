package oops;

public class MethodOverloaddingEg {

	float add(float a,int b) {
		return a+b;
	}
	float add(float a) {
		return a+10;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	void sub (int a,int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloaddingEg f = new MethodOverloaddingEg();
		System.out.println(f.add(10.4f,20)); 
		System.out.println(f.add(10)); 
		System.out.println(f.add(10,20,30)); 
		f.sub(20,10);
	}

}
