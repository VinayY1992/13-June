package basic;

public class palendromNum {
	public static void main(String[] args) {
		/*int a = 121,d,sum=0;
		int temp =a;
		
		while(a>0)//121 12 1 0
		{
			d=a%10;  // 1 2 1
			sum = (sum*10) + d; // 1 12 121
			a=a/10; //12 1 0
		}
		if(temp==sum)
		{
		System.out.println("palendrom");
		}
		else
		{
		System.out.println("Not palendrom");
		}*/
		
		String a = "MOM";
		String b = "";
		for(int i = a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))
		{
			System.out.println("palendrom");
		}
		else
		{
			System.out.println(" Not palendrom");
		}
		
	}

}
