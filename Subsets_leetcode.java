package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsets_leetcode {
	
	
	private static void genrate_subsets(int[] arr, ArrayList<Integer> set, int i)
	{
		
		
		if(i==arr.length)
		{
			for(int j=0;j<set.size();j++)
			{
				System.out.print(" "+set.get(j));	
			}
			System.out.println();	
			return;
			
		}
		
//	 add the element to the subset
	set.add(arr[i]);
	genrate_subsets(arr, set, i+1);
	set.remove(new Integer(arr[i]));
	
		
		
//	do not add the element to the subset
	genrate_subsets(arr, set, i+1);	
		
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			ArrayList<Integer>set=new ArrayList<Integer>();
			genrate_subsets(arr,set,0);
			
			
		}
		
	}



}
