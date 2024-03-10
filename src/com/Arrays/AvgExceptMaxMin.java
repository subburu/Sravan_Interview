package com.Arrays;

public class AvgExceptMaxMin {

	public static void main(String[] args) {
	
	//	int [] a= {5,7,2,4,9};
        int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		
		int max=a[0],min =a[0]; int sum=0;
		
		for (int i=0;i<a.length;i++)
			
		{
			sum =sum+a[i];
			if (a[i]>max)
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
		}
		System.out.println(max );
		System.out.println(min);
		 float avg=((sum-max-min)/(a.length-2));

		 System.out.println(avg+" expected");
		

	}
}
	
	


