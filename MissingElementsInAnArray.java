package week1.day2.classroom;

public class MissingElementsInAnArray
{
	public static void main(String[] args)
	{
// Array should not have any duplicates
	int arr[] = {1,2,3,4,7,6,8};
	
// Sum of elements in an array
	int sum1=0;
	for(int i=0;i<=arr.length-1;i++) 
	{
		sum1=sum1+arr[i];
	}
	System.out.println("The Sum of elements in an array is" + sum1);
	

	// Sum of range of values from 1 to 8.
	int sum2 =0;
	for(int i=1;i<=8;i++)
	{
		sum2=sum2+i;
	}
	System.out.println("The sum of range of elements" + sum2);
	int sum3;
	sum3 = sum2-sum1;
	System.out.println("Missing element is" + sum3);	
	}
}
