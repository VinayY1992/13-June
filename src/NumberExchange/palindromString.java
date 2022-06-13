package NumberExchange;

import java.util.Scanner;

public class palindromString {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any String");
		String a = obj.next();
		String b = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))
		{
			System.out.println("Its Pallendrom");
		}
		else
		{
			System.out.println("Its not Pallendrom");
		}
	}

}
