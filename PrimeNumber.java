package week1.day1.assignments;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int x = 0;
		int count=0;
		for(int i=1;i<=13;i++)
		{
			if(x%i == 0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println(x  +"is a Prime Number");
		}
		else
		{
			System.out.println(x + "is not a prime number");
		}
	}
}
