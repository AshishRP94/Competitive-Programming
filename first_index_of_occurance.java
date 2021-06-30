package competitive_programming;

import java.util.Scanner;

public class first_index_of_occurance 
{
	private static int findfirst(int[] arr, int i,int f) 
	{
		
		if(i==arr.length)
		{
		return 0;	
		}
		
		
		if(arr[i]==f)
		{
			return i;
			
		}
		return findfirst(arr,i+1,f);
		
		
		
		
		
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		
		}
		int f=scan.nextInt();
		int i=0;
		System.out.println(findfirst(arr,i,f));

	
	}





}
