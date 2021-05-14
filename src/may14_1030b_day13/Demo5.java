package may14_1030b_day13;

public class Demo5 
{
	
	
	void m1()
	{
		System.out.println("this m1 is non static method");
	}
	

	public static void main(String[] args)
	{
		//how to call non static method from main method?
		Demo5 d=new Demo5();
		d.m1();
	}
}
