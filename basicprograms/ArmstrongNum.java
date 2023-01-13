package basicprograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 407,temp=0,count=0,rem=0,sum=0;
		temp = num; 
		while(temp!=0) {
			count++;
			temp /= 10; 
		}
		temp = num;
		while(temp!=0) {
			rem = temp % 10; 
			sum += Math.pow(rem, count) ; 
			temp /= 10; 
		}
		
		if(num == sum) 
			System.out.println("Armstrong");
		else	
			System.out.println("Not Armstrong");
		
	}

}
