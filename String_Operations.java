package competitive_programming;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;




public class String_Operations 
{
 	
	static long count=0;
	
	private static HashSet<Integer> compare(ArrayList<Stack<Integer>> arr2) 
	{
		String temp;
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.size();j++)
			{
				try
				{
					set.add(arr.get(j).pop());
					
				}
				
				catch(EmptyStackException e)
				{
					break;
				}
				
				
			}
		
		}
		return set;
	
	
	
	}

	 
   static ArrayList<Stack<Integer>> arr=new ArrayList<Stack<Integer>>();
 

	private static int findnoequivalenceclasses(String s) 
	{
		String sub="";
		String sub2="";
		
		
		for(int i=0;i<s.length();i++)
		{
			sub=s.substring(i);
			Stack<Integer> stk=new Stack<Integer>();
			stk.add(Integer.parseInt(sub));

		    for(int j=0;j<sub.length();j++)
			  {
			  sub2=s.substring(j);
			  stk.add(Integer.parseInt(sub2));
			  }
		    arr.add(stk);
		    
		    
		}
		
		HashSet<Integer>set=compare(arr);
	    ArrayList<Integer> fin= new ArrayList<Integer>();


	    for (Integer i :set ) 
	    {
	    	  fin.add(i);
	    	
	    }
	    
	    Collections.sort(fin);
	    int tot=set.size();

		for(int x=0;x<fin.size();x++)
		{
			
			if(~((fin.get(x)) | (fin.get(x+1)))==0)
			{
			tot=tot-1;
			}
			
		}
		
		
		
		
		
		return tot;
	}
	



	public static void main(String args[]) throws java.lang.Exception
	{
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
//		Reader scan=new Reader();
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		String s="";
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			s=scan.nextLine();
//			s=scan.readLine();
			
			System.out.print(findnoequivalenceclasses(s));
			
		
		}
		
		
		
		
	
	
	
	}








}