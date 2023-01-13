package oops;

class std12 {
	int rno=10;
	void displayRno() {
		System.out.println(rno);
	}
}

class EnggStud2 extends std12{
	String branch = "IT";
	void displayBranch() {
		System.out.println(branch);
	}
}

class ITstud extends EnggStud2{
	String sub = "Ai";
	void displaySub() {
		System.out.println(sub);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITstud its = new ITstud();
		its.displayRno();
		its.displayBranch();
		its.displaySub();
	}

}
