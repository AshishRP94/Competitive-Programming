package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Euron_Problem {
	
	static int count=0;
	
	private static void conquer(int[] arr, int low, int mid, int high, int n)
	{
		int left=low;
		int right=mid+1;
		ArrayList<Integer>temp=new ArrayList<Integer>();
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				count+=1;
				temp.add(arr[left]);
				left+=1;
			}
			else
			{
				count+=1;
				temp.add(arr[right]);
				right+=1;
			}
			
			
		}
		
		
		
		if(left<=mid)
		{
			for(int i=low;i<=mid;i++)
			{
				temp.add(arr[i]);
			}
			
		}
		
		if(right<=high)
		{
			for(int i=right;i<=high;i++)
			{
				temp.add(arr[i]);
				
			}
			
		}
		
		for(int i=low;i<=high;i++)
		{
			arr[i-low]=temp.get(i);
		}
		
		
	}

	
	
	
	private static void find_volations(int[] arr, int low, int high, int n)
	{
		while(low<=high)
		{
		
		int mid=((low+high)>>1);
		find_volations(arr,low,mid,n);
		find_volations(arr,mid+1,high,n);
		conquer(arr,low,mid,high,n);
		
		}
		
	
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		find_volations(arr,low,high,arr.length);
		System.out.println(""+count);
		

	}



}
