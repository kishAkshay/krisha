package Basic_Java;

import java.util.ArrayList;

public class ArrayList22 {

	public static void main(String[] args) {

//		ArrayList arr = new ArrayList();
//		System.out.println(arr.add(1));
//		arr.add(2);	//add method is used to add the value in variable
//		arr.add(3);
//		arr.add(4);
//		arr.add('A');
//		arr.add(6.556);
//		arr.add("uti");
//		
//		System.out.println(arr.get(2));// get is used to extract the value based on index
//		System.out.println(arr.remove(1)); //remove the value based on index

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Hi");
		arr2.add("good");
		arr2.add("bad");
		arr2.add("road");

		// System.out.println(arr2.get(1));

		// note : To get the length of the normal array we user length function but in
		// ArrayList we user size method to get length

		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}

		System.out.println("*****************");

		for (String val : arr2) {
			System.out.println(val);
		}

	}

}
