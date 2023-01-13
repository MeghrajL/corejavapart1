package PackageEg;

class DefaultClass {
	private int a =10;
	
	void display() {
		System.out.println("private method"+a);
	}
}

class DefaultSubClass extends DefaultClass{
	void displaySub() {
		System.out.println("default sub calss");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultClass d = new DefaultClass();
		//d.display();
		DefaultSubClass ds = new DefaultSubClass();
		ds.display();
		ds.displaySub();
	}

}
