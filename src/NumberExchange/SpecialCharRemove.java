package NumberExchange;

public class SpecialCharRemove {
	public static void main(String[] args) {
		String a = "V&%i@n(a!y*~";
		String b = "";
		
		for(int i=0;i<a.length();i++)
		{
			if(Character.isAlphabetic(a.charAt(i)))
			{
				b=b+a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
