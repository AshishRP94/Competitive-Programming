package competitive_programming;

import java.util.Scanner;

public class Target_Sum_Subsets_Dp 
{

//	static boolean flag=false;
	private static void findsubset(int[] arr,  int i,int target,int sum,String set) 
	{
		if(i==arr.length)
		{
			if(sum==target)
			{
				System.out.println("");
			}
			return;
		}
		
		findsubset(arr,i+1,target,sum+arr[i] ,set+arr[i]+",");
		findsubset(arr,i+1,target,sum ,set);
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();			
		}
		
		int target=scan.nextInt();
		findsubset(arr,0,target,0,"");
	
	
	
	}



}
