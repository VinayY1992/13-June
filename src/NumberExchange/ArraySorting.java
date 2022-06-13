package NumberExchange;

public class ArraySorting {
	public static void main(String[] args) {
		int a[]= {2,5,7,6,1}; 
		int temp;
		
		for(int i =0;i<a.length;i++)  
		{
			for(int j=i;j<a.length;j++) 
			{
				if(a[i]<=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int b : a)
		{
			System.out.println(b);
		}
		
	}

}
