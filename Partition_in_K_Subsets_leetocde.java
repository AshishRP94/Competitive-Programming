package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Partition_in_K_Subsets_leetocde {
	
	private static void parition(int[] arr, int k, int count, ArrayList<ArrayList<Integer>> list, int j)
	{
		if(j>list.size())
		{
			
		if(count==k)
		{
			for(ArrayList<Integer>temp:list)
			{
				System.out.print("|"+temp);
			}
		}
		return;
		}
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).size()>0)
			{
				list.get(i).add(arr[j]);
				parition(arr, k, count, list,j+1);
				list.get(i).remove(new Integer(arr[j]));
			}
			else
			{
				list.get(i).add(arr[j]);
				parition(arr, k, count+1, list,j+1);				
				list.get(i).remove(new Integer(arr[j]));
			}
		}
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int k=scan.nextInt();
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
			parition(arr,k,0,list,0);
		}

	}



}
