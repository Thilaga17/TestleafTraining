package week1.day2.classroom;

public class ArrayLearning {

	public static void main(String[] args)
	{
		int arr[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Length of an array is : " + arr.length); //Length of an array
		int len = arr.length;
		System.out.println("The last element in an array is : " +arr[len-1]); // To get last values in an array
		for(int i=0; i<arr.length;i++) // 0 1  2  3  4  5  6  7  8  9  10 11 12   
		{
			System.out.println(arr[i]);	//14 12	13 11 15 14 18 16 17 19 18 17 20// To get all elements in an array.
		}

	}

}
