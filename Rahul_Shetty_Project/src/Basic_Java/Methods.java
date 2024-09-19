package Basic_Java;

import java.lang.reflect.Method;

public class Methods {

	private static final String Methods = null;


	public static void main(String[] args)
	{
		// calling the dynamic method of the same class
		Methods d = new Methods();
		String returndata = d.getdata();
		System.out.println(returndata);
		
		System.out.println("@@@@@@@@@@@@@");
		
		
		//calling the dynamic mehtod of another class
		
		ClassMethod d1 = new ClassMethod();
		d1.getdata1();
		
		System.out.println("@@@@@@@@@@@@@@@@@");
		
		// calling the static method
			getdata2();
	}
	
	
	public String getdata()
	{
		System.out.println("Hello- world");
		return "how r u";
	}
	
	
	public static String getdata2()
	{
		System.out.println("Hello- world");
		return "how r u";
	}
	
	
	

}
