package may14_1030b_day13;

public class Demo2 
{
	static void m1()
	{
		System.out.println("this is m1 method and it is static");
	}
	
	public static void main(String[] args) 
	{
		//how to call static method ? using class name
		Demo2.m1();
		Demo2.m1();
	}
}
