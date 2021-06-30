package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class February_Lunchtime_2021_Division_3_3
{
	
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
	 
	  static long gcd(long a, long b)
	    {
	      if (b == 0)
	        return a;
	      return gcd(b, a % b); 
	    }
	

	
//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first and only line of each test case contains two space-separated integers L and R.
	  
	  
	  private static void find_x(long x, long l, long r)
	  {
		  
		  
			while(true)
			{
			boolean coprime=false;
			
			x+=2;
			for(long j=l;j<=r;j++)
			{
				if(j==r)
				{
					if(gcd(x,j)==1)
					{
						coprime=true;
						
					}
					
				}
				
				long ans=gcd(x,j);
				if(ans==1)
				{
					
				}
				else
				{
					break;
				}
						
			
			}
			
			
			
			if(coprime==true)
			{
				System.out.println(""+x);
				break;
			}
			
			}
			
		  
			
	
	  }
	  
	public static void main(String[] args)throws java.lang.Exception
	{

        FastReader scan = new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long l=scan.nextLong();
			long r=scan.nextLong();
			long x=1;
//			must not exceed 2⋅109.
			find_x(x,l,r);
	
			
//			3
//			16 17
//			16 17
//			973360 973432
		
		}
		
		

	}





}
