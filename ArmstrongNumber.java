package week1.day1.assignments;

public class ArmstrongNumber
{

	public static void main(String[] args)
	{
		int originalNumber = 375;
		int number,rem,sum=0;
		number = originalNumber;
		
		while(number!= 0)
		{
			rem = number%10;
			sum = sum + (rem * rem *rem);
			number = number/10;
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
