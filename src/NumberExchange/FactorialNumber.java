package NumberExchange;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		
	
	int a;
	int fact = 1; //5 20 60 120 120
	
	Scanner c = new Scanner(System.in);
	System.out.println("Enter Any Number");
	a= c.nextInt();
	
	/*for(int b=1;b<=a;b++)
	{
		fact=fact * b ;
	}*/
	
	for(int b = a; b>=1;b--) //5 4 3 2 1 0
	{
		fact = fact * b ; //5 20 60 120 120 0
	}
	
	System.out.println("Factorial Value 5"
			+ "is \n fact= "+fact);	
	
 

}
	

}
