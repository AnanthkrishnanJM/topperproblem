package topperprob;

import java.util.Scanner;

public class top {

		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			System.out.println("Enter");
			int n=a.nextInt();
			int odd=0;
			int even=0;
			while(n>0) {
				int digit=n%10;
				if(digit%2!=0) {
					odd=odd+digit;
					
				}
				else {
					even=digit;
					
				}
			
	            n=n/10;
		}
		if((odd-even)==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
			
		}


	}


