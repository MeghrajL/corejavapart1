package basicprograms;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println("prime number");
		else
			System.out.println("not a prime number.");

		// prime num upto 50
		int num1 = 50, count;

		for (int i = 1; i <= num1; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.print(i + " ");
			}

		}
	}

}
