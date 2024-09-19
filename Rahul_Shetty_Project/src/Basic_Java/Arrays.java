package Basic_Java;

public class Arrays {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 0) 
			{
				System.out.println(arr[i]+" is even number ");
				break;
			}else
			{
				System.out.println(arr[i]+" is odd number");
			}
			
		}
	}

}
