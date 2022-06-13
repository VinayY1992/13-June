package NumberExchange;

public class OddEvenFromArrayNumber {
	public static void main(String[] args) {
		int a[]= {1,2,5,9,6,8};
		int even=0;
		int odd=0;
		
		for(int i=0;i<=a.length-1;i++)
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		System.out.println(even);
		System.out.println(odd);
				
	}

}
