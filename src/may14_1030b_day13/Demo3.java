package may14_1030b_day13;

public class Demo3 
{
	static int i1=10;
	static String s1="abc";
	final static int i2=10;
	final static String s2="abc";
	int i3=10;
	String s3="abc";
	final  int i4=10;
	final  String s4="abc";
	/*How to access class variables from static method?
	 * from static method we can directly access all static variables
	 * of the class 
	 * to access non static variable we should create object 
	 */
	static void m1()
	{
		//accessing static variable from static method
		int i2=10;
		System.out.println(i1);
		System.out.println(s1);
		/* if local and global variable are same name and global variable
		 is static then access it using class name
		*/
		System.out.println(Demo3.i2);
		System.out.println(s2);
		
		//accessing non static var from static method-create object
		int i3=20;
		Demo3 d=new Demo3();
		System.out.println(i3);//local i3
		System.out.println(d.i3);//global i3
		System.out.println(d.s3);
		System.out.println(d.i4);
		System.out.println(d.s4);
	}
	
	public static void main(String[] args) 
	{
		//how to call static method ? using class name
//		Demo3.m1();
		int i1=10,i3=20;
		System.out.println(i1);
		System.out.println(Demo3.i1);

		System.out.println(i3);
		Demo3 d=new Demo3();
		System.out.println(d.i3);
	}
}
