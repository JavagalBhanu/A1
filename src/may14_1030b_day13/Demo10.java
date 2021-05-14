package may14_1030b_day13;
//why main method is static
//->so that JVM can call main method directly by using
//the given class name (with out creating object)

public class Demo10 {
//how to call non-static method (m2) from another non-static method(m1)?
	void m1()
	{
		//in java we cant write a method inside another method
		//so there is no 'local method'
		
		System.out.println("m1");
		//how to call m2 here?
		this.m2();//call directly
		m2();//no need to use this
	}
	
	void  m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Demo10 d=new Demo10();
		d.m1();
	}
}
