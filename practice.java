package competitive_programming;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; 
class practice 
{
	private static void call(int[] arr)
	{
		arr[0]=4;
		
	}
	
	
	private static void call2(ArrayList<Integer> temp)
	{
		temp.add(33);
		
	}
	
	
	private static void call3(String s)
	{
		
		s="ashish_patil";
		
	}
	
	
	public static void main (String[] args) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		String ss=scan.nextLine();
		System.out.println(""+ss);
		
		int[] arr= {1,2,3};
		call(arr);
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp.add(1);
		temp.add(2);
		call2(temp);
		for(int i=0;i<temp.size();i++)
		{
			System.out.print(" "+temp.get(i));
		}
		System.out.println("");
		
		String s="ashish";
		call3(s);
		System.out.println(s);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	
	
	}


	



	
	
}