package week1.day2.classroom;

public class PrintDuplicates {

	public static void main(String[] args) 
	{
		int arr[]= {14,12,13,11,15,14,20,18,16,17,19,18,17,20};
		int len = arr.length;
	    		
			for(int i=0;i<len;i++)		  // 0<13	
			{
				for(int j=i+1;j<len;j++)  // 5<13	
				{
					if(arr[i] == arr[j])  // 14=14
					{
				    	System.out.println(arr[i]); // 14
				    }
				}
		    } 

	}

}
