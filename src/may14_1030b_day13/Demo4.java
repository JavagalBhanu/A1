package may14_1030b_day13;

public class Demo4 
{
	static int i=10;
	
	public static void main(String[] args) 
	{
		//in general we access static variable of a class using 
		//class name
		System.out.println(Demo4.i);
		//but if method is also static and both var & method are in same
		//class then we can directly access the static variable without
		//the class name
		System.out.println(i);
	}
}
