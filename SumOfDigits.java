package week1.day1.assignments;

public class SumOfDigits
{
	public static void main(String[] args)
	{
	int num = 567;
	int sum = 0;
	while(num>0)
	{
		sum = sum+num%10;   // 7     7+6=13  13+5=18
		num=num/10;         // 56    5       0
	}
	System.out.println("The Sum of digits of 567 is:" + sum );
	}
}
