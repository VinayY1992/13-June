package NumberExchange;

public class StringPractical1 {
	public static void main(String[] args) {
		String a = "My Name Is Vinay";
		int b = a.length();
		
		for(int i=b-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));    // reverse a string(4),(7)
		}
		System.out.println();
		
		System.out.println(a.split(" ").length);  // to count words from string(5)
		
		String c = a.replace(" ","");        // remove white space from string(6)
		System.out.println(c);
		System.out.println(a.replace(a,c));
		
		String []k = a.split(" ");
		for(int j =a.split(" ").length-1;j>=0;j--)
		{
			System.out.print(k[j] + " ");
		}
		
		}
	}

