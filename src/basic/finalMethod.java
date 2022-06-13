package basic;

public class finalMethod extends finalMethod2{
	public final static void test() {
	
	int a=10;
	int b= 20;
	int c= a+b;
	System.out.println(c);
	
}
public final static void test(int x) {
	int f=10;
	int e= 15;
	int g= f+e;
System.out.println(g);
}
public static void main(String[] args) {
	finalMethod obj = new finalMethod();
	obj.test2();
	finalMethod.test();
	finalMethod.test(10);
}
}