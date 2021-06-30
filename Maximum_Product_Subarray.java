package competitive_programming;

import java.util.Scanner;

public class Maximum_Product_Subarray
{
	
	private static void maxproduct(int[] arr) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
			}
			maxproduct(arr);
		}

	}



}
