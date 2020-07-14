package week1.day1.assignments;

public class SumofDigits 
{
	public static void main(String[] args)
	{
	int num = 567;
	int sum = 0;
	while(num>0)
	{
		sum = sum+num%10;// 7 13
		num=num/10; // 56 5
	}
	System.out.println("The Sum of digits of 567 is:" + sum );
	}
		
	

}
