package may14_1030b_day13;

public class Demo6 
{
	static int i1=101;
	static String s1="abc1";
	final static int i2=102;
	final static String s2="abc2";
	
	int i3=103;
	String s3="abc3";
	final  int i4=104;
	final  String s4="abc4";
	/*How to access static & non static var of class 
	 * from non static method
	 */
	void m1()
	{//access static from non static method
		int i4=200;
		System.out.println(Demo6.i1);
		System.out.println(Demo6.s1);
		System.out.println(Demo6.i2);
		System.out.println(Demo6.s2);
		
		System.out.println(i3);
		System.out.println(s3);
		System.out.println(i4);
		System.out.println(this.i4);
		System.out.println(s4);
		
	}
	public static void main(String[] args) 
	{
		Demo6 d=new Demo6();
		d.m1();
	}
}
