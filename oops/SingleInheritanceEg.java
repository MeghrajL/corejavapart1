package oops;

class std {
	int rno=10;
	void displayRno() {
		System.out.println(rno);
	}
}

class EnggStud extends std{
	String branch = "IT";
	void displayBranch() {
		System.out.println(branch);
	}
}

public class SingleInheritanceEg{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnggStud es = new EnggStud();
		es.displayRno();
		es.displayBranch();
	}

}

