package oops;

public class ConstructorEg {
	
	//no args
	ConstructorEg() {
		System.out.println("Creating a default constructor");
	};
	
	//parameterized
	int age;
	ConstructorEg(int age) {
		this.age = age;
		System.out.println(age);
	}
	ConstructorEg(ConstructorEg C){
		this.age = C.age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEg obj = new ConstructorEg();
		ConstructorEg obj1 = new ConstructorEg(20);
	}

}
