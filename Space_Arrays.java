package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import competitive_programming.Chef_and_Groups.FastReader;

public class Space_Arrays
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
	
//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains a single integer N.
//	The second line contains N space-separated integers a1,a2,…,aN.
	

	
//	4
//	4
//	1 2 3 3
//	4
//	1 1 3 3
//	5
//	1 2 2 1 5
//	3
//	2 2 3
	
	
	private static void find_winner(int[] sparr, int[] temp, long sum)
	{
		if((sum&1)==0)
		{
			System.out.println("Second");
		} 
		else
		{
			System.out.println("First");
			
		}
		
	}
	
	
	
	public static void main(String[] args)throws java.lang.Exception
	{
        FastReader scan = new FastReader();
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
        	int n=scan.nextInt();
        	int []sparr=new int[n+1];
        	boolean flag=false;
        	int []temp=new int[(n+1)];
        	long sum=0;
        	for(int j=1;j<sparr.length;j++)
        	{
        		sparr[j]=scan.nextInt();
        		temp[j]=j-sparr[j];
        		sum+=temp[j];
        		if(sparr[j]>j)
        		{
        			flag=true;
        		}
        	}
        	
        	for(int j=0;j<temp.length;j++)
        	{
        		System.out.print(temp[j]+" ");
        		
        	}
        	
        	if(flag==true)
        	{
        		System.out.println("Second");
        	
        	}
        	else
        	{
        		find_winner(sparr,temp,sum);
        	}

        }



	}





}
