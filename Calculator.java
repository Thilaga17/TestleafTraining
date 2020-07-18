package week1.day2;

public class Calculator
{
	public int add(int num1,int num2)
	{
		int sum;
		sum= num1+num2;
		return sum;
	}
	
	public double sub(double num1,double num2)
	{
		double subvalue;
		subvalue= num2-num1;
		return subvalue;
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		System.out.println("Sum value is" + cal.add(5,6));
		double sub = cal.sub(2.1,7.2);
		System.out.println(sub);
	}
}
