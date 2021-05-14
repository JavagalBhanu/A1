package may14_1030b_day13;

public class Demo8 {
//how to call non static method (m2) from static method (m1)?
	
	static void m1()
	{
		System.out.println("m1");
		//how to call m2?
		Demo8 d=new Demo8();
		d.m2();
	}
	 void m2() 
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		Demo8.m1();
	}

}
