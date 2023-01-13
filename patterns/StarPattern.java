package patterns;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
*
**
***		
		*/		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
A
BC
DEF
		 */
		System.out.println();
		int ch=65;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch++);
			}
			System.out.println();
		}

		/*
*****
****
***
**
*		 
		 */
		
		System.out.println();
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/		
		System.out.println();
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}

/*
1
12
123
1234
12345
*/
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
/*
1
22
333
4444
55555
*/		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
/*
    *
   **
  ***
 ****
***** 
*/
		System.out.println();
		int row=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				}
				System.out.println("");
		}
	}

}
