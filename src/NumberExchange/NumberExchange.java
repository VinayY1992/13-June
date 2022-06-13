package NumberExchange;

import java.util.Scanner;

public class NumberExchange {
	
	public static void main(String[] args) {
	
		int a,b;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=c.nextInt();
		b=c.nextInt();
		System.out.println("Before swapping\n a = "+a+"\n b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping\n a = "+a+"\n b = "+b);
		//System.out.println(a);
		//System.out.println(b);
		
	}

}
