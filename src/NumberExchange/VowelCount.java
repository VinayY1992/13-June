package NumberExchange;

import java.util.Scanner;

public class VowelCount {
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter any statement");
	String a = obj.next();
	//String a = "Vinay Vijay Yewale";
	int Vowelcount = 0;
	int Consonant = 0;
	a=a.toLowerCase();
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)=='a' || a.charAt(i)=='e' || 
		   a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
		{
			System.out.println(a.charAt(i));
			Vowelcount++;
		}
		else if(a.charAt(i)>='a' && a.charAt(i)<='z')
		{
			Consonant++;
		}
	}
	System.out.println("Number of vowels = "+Vowelcount);
	System.out.println("Number of consonant = "+Consonant);
}
}
