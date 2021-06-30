package competitive_programming;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
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
	public static void main (String[] args) throws java.lang.Exception
	{
	   FastReader scan=new FastReader();
	   int t=scan.nextInt();
	   for(int i=0;i<t;i++)
	   {
	       int n=scan.nextInt();
	       Long []arr=new Long[n];
	       for(int j=0;j<arr.length;j++)
	       {
	           arr[j]=scan.nextLong();
	       }
	       for(int j=0;j<n;j++)
	       {
	           int count=0;
	           for(int k=i-1;k>=0;k--)
	           {
	               if(arr[k]>arr[j])
	               {
	                   break;
	               }
	               else if(arr[k]==arr[k])
	               {
	                   count+=1;
	               }
	           }
	       
	       for(int k=i+1;k<n;k++)
	       {
	           if(arr[k]>arr[j])
	           {
	               break;
	           }
	           else if(arr[j]==arr[i])
	           {
	               count+=1;
	           }
	       }
	       System.out.print(count+" ");
	       }
	       System.out.println();
	   }
	   
	   
	}
}
