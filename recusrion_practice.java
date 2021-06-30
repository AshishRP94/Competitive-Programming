package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class recusrion_practice
{

		
		static void substrings(int start, int end,String in)
		{
			if(start == in.length() && end == in.length())
			{
				return;
			}
			else
			{
				if(end == in.length()+1)
				{
					substrings(start+1,start+1,in);
				}else
				{
					System.out.println(in.substring(start, end));
					substrings(start, end+1,in);
				}
			}
		}
		
	
	
	
	private static int call(int[] arr, int i, ArrayList<Integer> temp)
	{
		if(i>(arr.length))
		{
			return 0;
		}
		
		
		
		if(i<=(arr.length-1))
		{
			for(int j=0;j<temp.size();j++)
			{
				System.out.print(temp.get(j)+" ");
			}
			System.out.println();
		}
		
		
//		System.out.println("i="+i);
		for(int j=0;j<arr.length;j++)
		{
			
		temp.add(arr[i]);
		call(arr, i+1, temp);
		temp.remove(new Integer(arr[i]));
		}
		
		return 0;
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
		ArrayList<Integer>temp=new ArrayList<Integer>();
		call(arr,0,temp);
		
	}


}
