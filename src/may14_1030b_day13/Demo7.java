package may14_1030b_day13;

public class Demo7
{
//how to call a static method from another static method
//call m1 from m2?
	
	static void m1() {
		System.out.println("m1");
	}
	static void m2() {
		System.out.println("m2");
		Demo7.m1();//use class name to call static method
		m1();//directly u can call since both r in same class n
		//both r static
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		Demo7.m2();
	}
}
