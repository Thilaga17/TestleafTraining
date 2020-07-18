package week1.day2.assignments;

public class FindIntersection 
{

	public static void main(String[] args)
	{
	int[] arr1 = {3,2,4,6,7,11};
	int[] arr2 = {1,2,8,4,9,7};
	
	for(int i=0; i<arr1.length;i++)      	//0		0	  0	   0	0	 0		1	 1	 2	 4
	{	
		for(int j=0;j<arr2.length;j++)   	//0		1	  2	   3	4	 5		0	 1	 3	 5
		{
			if( arr1[i] == arr2[j])			//3!=1	3!=2  3!=8 3!=4 3!=9 3!=7	2!=1 2=2 4=4 7=7
			{		
				System.out.println(arr1[i]);//										 2	 4	 7
			}
		}
	}

	}

}
