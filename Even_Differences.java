package competitive_programming;

import java.util.Scanner;

public class Even_Differences {
	
	private static int evendiff(int[] arr)
	{
		int counte=0;
		int counto=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i]&1)==1)
			{
				counto+=1;
				
			}
			else
			{
				counte+=1;
			}
		}
		if((counto==arr.length) ||(counte==arr.length))
		{
			return 0;
		}
		
		
		if(counte>=counto)
		{
			return counto;
			
		}
		else
		{
			return counte;
			
		}
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<5;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			System.out.println(evendiff(arr));
			
		}

	}



}
