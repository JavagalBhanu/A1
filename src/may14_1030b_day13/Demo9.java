package may14_1030b_day13;

public class Demo9 
{//calling static method(m2) from non static method (m1)
	void m1()
	{
		System.out.println("m1");
		//how to call m2?
		Demo9.m2();
		m2();//not recommended 
	}
	
	static void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		Demo9 d=new Demo9();
		d.m1();
	}
}
