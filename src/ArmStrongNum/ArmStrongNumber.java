package ArmStrongNum;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
	int a=515;
	int c;
	int d=0;
	int b=a;
	
	while(b>0)
	{
		c=b%10;
		b=b/10;
		d=d+c*c*c;
		
	}
	if(d==a)
	{
		System.out.println("Armstrong num");
	}
	else 
	{
		System.out.println("Not Armstrong num");
	}
	System.out.println("Git Hub Practice");

}
}
