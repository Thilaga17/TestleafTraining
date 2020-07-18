// A Palindrome number is a number that remains the same when its digits are reversed. 
// Scanner is a class in java.util package to get the inputs.
// Reverse a number using algorithm.

package week1.day2.assignments;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); // To get the inputs from the user during runtime.
		System.out.println("Enter a Number: ");
		int num= sc.nextInt();  // this method will accept the value from the user.
		
		int org_num = num;
		
		int rev=0;
		while(num !=0)  		  // 123    12			1
		{
			rev = rev*10 + num%10; // 0+3=3  30+2=32	320+1
			num = num/10;		  // 12		 1			321
		}
		System.out.println("Reverse number is : " + rev);
		
		if (org_num == rev)
		{
			System.out.println(org_num  + "is a palindrome number");
		}
		else 
		{
			System.out.println(org_num + "is not a palindrome number");
		}
		sc.close();
	}
}
