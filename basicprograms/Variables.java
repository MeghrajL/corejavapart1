package basicprograms;

class SubMarks {
	int javaMarks =80; 
	int pythonMarks =90; 
	static String subName = "maths";
	void displayMarks() {
		System.out.println("java "+javaMarks);
		System.out.println("python "+pythonMarks);
	}
}

public class Variables {
	
	public void localVariable() {
		int age =30; 
		age += 10; 
		System.out.println("Age "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v = new Variables();
		v.localVariable();
		SubMarks sm = new SubMarks();
		sm.displayMarks();	
		//System.out.println("subName "+SubMarks.subName);
	}

}
