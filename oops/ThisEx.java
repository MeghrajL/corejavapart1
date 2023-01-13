package oops;

public class ThisEx {
		
	String name; 
	String num;
	
	public ThisEx(String name,String num){
		this.name = name;
		this.num =num;
	}
	
	public ThisEx(String name){
		this(name,name);
		this.name = name;
		System.out.println("Nmae "+this.name);
	}
	
		/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx t = new ThisEx("Meghraj");
		//t.setName("ABC");
		System.out.println("Object t "+t.name);
	}

}
