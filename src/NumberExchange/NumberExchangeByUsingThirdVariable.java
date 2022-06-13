package NumberExchange;

import java.util.Scanner;

public class NumberExchangeByUsingThirdVariable {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner d = new Scanner(System.in);
		System.out.println("Enter Any Two Numbers");
		a= d.nextInt();
	    b= d.nextInt();
		System.out.println("Before swapping \n a = "+a+"\n b = "+b);

		c = a;         //100
		a = b;        //a=200
		b = c;        //b=100
		
		System.out.println("After swapping \n a = "+a+"\n b = "+b);
		
	}

}
