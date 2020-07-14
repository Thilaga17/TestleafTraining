// In series of numbers in which each number(FN) is a sum of the two preceding number.
//        0 0 1 2 3 5 8 13 21


package week1.day1.assignments;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
	int n1=0, n2=1, sum=0;
	System.out.println(n1 +" "+ n2);
	
	for(int i=2;i<10;i++)
		{
		sum= n1+n2;
		System.out.println(" " + sum);
		n1=n2;
		n2=sum;
		}
	}
}
