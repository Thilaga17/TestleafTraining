// Armstrong Number - It is a number which is equal to the sum of cube of its digits.

package week1.day1.assignments;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		int originalNumber = 153;
		int number,rem,sum=0;
		number = originalNumber;
		
		while(number!= 0)
		{
			rem = number%10;                // 3   5    1
			sum = sum + (rem * rem *rem);   // 27  125  1
			number = number/10;				// 15  1    0
		}
		if(sum == originalNumber)
		{
			System.out.println("Number" + originalNumber + "is a ArmStrong Number");
		}
		else
		{
			System.out.println("Number" + originalNumber +  "is not a ArmStrong Number");
		}
	}
}
