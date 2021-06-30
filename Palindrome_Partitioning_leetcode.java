package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Palindrome_Partitioning_leetcode 
{
	static class FastReader
	{
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	
	private static boolean palindrome(String temp)
	{
		int l=0;
		int r=temp.length()-1;
		while(true)
		{
			if(l>r)
			{
				break;
			}
			if(temp.charAt(l)==temp.charAt(r))
			{
				
			}
			else
			{
				return false;
			}
			l+=1;
			r=-1;
		}
		
		return true;
	}

	
	

	
	private static void partitions(String s, ArrayList<ArrayList<String>> ans, ArrayList<String> list)
	{
		
		if(s.length()==0)
		{
			ans.add(list);
			return;
		}
		
		
		for(int i=0;i<s.length();i++)
		{	
			
			String temp=s.substring(0,(i+1));
			String rest=s.substring(i+1);
			if(palindrome(temp)==true)
			{
				list.add(temp);
				partitions(rest,ans,list);
				list.remove(new String(temp));
			}
		}
		
		
	}

	




	public static void main(String[] args)
	{
		 FastReader scan=new  FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 String s=scan.nextLine();
			 ArrayList<String>list=new ArrayList<String>(); 
			 ArrayList<ArrayList<String>>ans=new ArrayList<ArrayList<String>>(); 
			 System.out.print("[");
		     partitions(s,ans,list);
		     System.out.println("]");
		 }

	}






}
