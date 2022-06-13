package NumberExchange;

import java.util.Locale;

public class StringReverse {
	public static void main(String[] args) {
		String a = "VINAY"; //01234
		String d = "Yewale";
		int b = a.length(); //5
		
		for(int c=b-1;c>=0;c--) //4 3 2 1 0
		{
			System.out.print(a.charAt(c)); //yaniv
		}
		System.out.println();
		System.out.println(a.substring(0,3));
//String display from beginning index & ends before end index(Vin)
		
		System.out.println(a.substring(2));
//String display from beginning index up-to end(nay)
		
		System.out.println(a.concat(d));
//Connect two strings together(VinayYewale)
		
		System.out.println(a.toLowerCase());
//Convert Capital string to lower case
		
		System.out.println(d.toUpperCase());
//Convert Lower string to Upper case
		System.out.println(a.replace('N','n'));
//replace specific character from string
		System.out.println(a.replace("VI", "JE"));
		System.out.println(d.replace(d,a));
//replace one string with another
		System.out.println(a.equalsIgnoreCase(d));
//Compare String and give result in true or false
		System.out.println(a.contains("VI"));
//tO Check sequence of characters 
		
		String i = "Java is java aagain java again";
		char j = 'a';
		int k=i.length() - i.replace("a", "").length();
		System.out.println("Number of occurances of a = "+k);
		System.out.println();
		
		String str = "Ashok Kambale";
		char x[] = str.toCharArray();
		for(int t=x.length-1;t>=0;t--)
		{
			System.out.print(x[t]);
		}		
	}
}
