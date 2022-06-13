package NumberExchange;

public class ArraySortingForZero {
	
		public static void main (String[] args)
		{
			int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
			int n = arr.length;
			int count = 0;
			int b;
				for ( int j =0;j<n;j++)
				{
				if(arr[j]!=0)
				{
					count = arr[j];
					System.out.println(count);
				}	
				}
				for ( int i =0;i<n;i++)
				{
				if(arr[i]==0)
				{
					b=arr[i];
					System.out.println(b);
				}
				}
		}
}


