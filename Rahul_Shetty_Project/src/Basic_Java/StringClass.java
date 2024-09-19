package Basic_Java;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi akshay how are you";
		String[] splittedstring = s.split(" ");
		
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println(splittedstring[3]);
		System.out.println(splittedstring[4]);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		
		String[] splittedstring2 = s.split("how");
		System.out.println(splittedstring2[0]);
		System.out.println(splittedstring2[1]);
		
		String[] splittedstring3 = s.split("how");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(splittedstring3[0].trim());
		System.out.println(splittedstring3[1].trim());  
		//trim method is used to remove the remove the blank space which is there on left and right side of the string
		
		System.out.println("#########################");
		
		//Print the only char in string
		String s4 = "Hi akshay how are you";
		
		for(int i=0; i<s4.length(); i++)
		{
			
			System.out.print(s4.charAt(i));
			
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		
		// print the char in reverse order
		
		for(int i=s4.length()-1; i>=0; i-- )
		{
			System.out.print(s4.charAt(i));
		}
		
		
		

	}

}
