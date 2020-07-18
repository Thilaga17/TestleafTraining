// Ascending order and Second largest

package week1.day2.classroom;

import java.util.Arrays;

public class SecondLargestNumber
{
	public static void main(String[] args)
	{
		int[] data= {3,2,11,4,6,7};
		System.out.println("An ascending order of an array is");
		Arrays.sort(data);
		for (int i : data)
		{
		System.out.println(i);		
		}
		System.out.println("The 2nd largest number in an array is"+ data[data.length-2]);

//System.out.println(data.length);  // to print length of an array
//System.out.println(Arrays.toString(data));		// to print all the elements in an array
//System.out.println("The 3rd element is" + data[2]);  // to print the specific element in an array
	}
}
