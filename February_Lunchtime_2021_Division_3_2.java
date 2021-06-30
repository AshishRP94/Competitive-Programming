package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;



public class February_Lunchtime_2021_Division_3_2 {

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains 10 space-separated integers A1,A2,…,A10.
//	The second line contains a single integer  K
	
	 static class FastReader {
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
	 

	 
		private static void help_hacker(long[] problems, long remove)
		{
		
			for(int i=problems.length-1;i>=0;i--)
			{
//				System.out.println("i="+i);
				if(remove==0)
				{
				

					for(int j=i;j>=0;j--)
					{
//						System.out.println("j="+j+"|problems[j]="+problems[j]);
						if(problems[j]>0)
						{
							System.out.println(""+(j+1));
							return;
						}
					
					}
					
					
				}
				long p=problems[i];
//				System.out.println("p[i]"+p);
				long ans=p-remove;
				if(ans<0)
				{
//					System.out.println("-ve="+ans);
//					System.out.println("b remove="+remove);
					remove-=p;
//					System.out.println("a remove="+remove);
					problems[i]=0;
				}
				else if(ans>0)
				{
//					System.out.println("b p="+p);
					p-=remove;
//					System.out.println("a p="+p);
					problems[i]=p;
					
//					System.out.println("p[i]="+problems[i]);
					remove=0;
					if(problems[i]>0)
					{
						System.out.println(""+(i+1));
						return;
					}
				}
				else
				{
//					System.out.println("0="+ans);
					remove=0;
					problems[i]=0;
//					System.out.println("remove="+remove);
//					System.out.println("p[i]="+problems[i]);
				}
//				System.out.println();
			}
			
			if(problems[0]>=0)
			{
				System.out.println(1);
			}
			
			
			
		
			
			
		}
		
	 

	 
	public static void main(String[] args)throws java.lang.Exception
	{
        FastReader scan = new FastReader();
        int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long []problems=new long[10];
	        for(int j=0;j<10;j++)
			{
				 problems[j]=scan.nextLong();
			
			}
	       long remove=scan.nextLong();
	       help_hacker(problems,remove);	       
		}
		

	}
	
//	5
//	1 10 1 5 3 2 4 9 0 100
//	100
//	2 0 1 0 0 0 0 0 0 10
//	12
//	2 0 1 0 0 0 0 10 0 0
//	0
//	2 0 1 0 0 0 0 0 0 10
//	10
//	1 10 1 5 3 2 4 9 0 100
//	125







}
