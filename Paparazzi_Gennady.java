package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Paparazzi_Gennady {
	
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
//	The second line contains N space-separated integers h1,h2,…,hN.
	
	
	
	
		
		private static void findmaxdistance(long[] arr)
		{
			
			 Stack<Long> s = new Stack<Long>();
		        long nge[] = new long[arr.length];
		 
		        for (int i = arr.length - 1; i >= 0; i--)
		        {
		   
		            if (!s.empty())
		            {
		                while (!s.empty() 
		                       && s.peek() <= arr[i])
		                {
		                    s.pop();
		                }
		            }
		            nge[i] = s.empty() ? -1 : s.peek();
		            s.push(arr[i]);
		        }
//		        for (int i = 0; i < arr.length; i++)
//		        {
//		        	System.out.print(nge[i]+" ");
//		        }
//		        System.out.println();
		            
		        long max=Long.MIN_VALUE;
		        boolean flag=false;
		        for(int i=0;i<arr.length;i++)
		        {
		        	for(int j=0;j<arr.length;j++)
		        	{
		        		if(arr[i]>=arr[j])
		        		{
		        			if(i==1)
		        			{
		        				
		        			long temp=arr[i]-arr[j];
		        			if(temp>max)
		        			{
		        				max=temp;
		        			}
		        			}
		        			else
		        			{
		        				if(nge[j]>=arr[i])
		        				{
		        					long temp=arr[i]-arr[j];
				        			if(temp>max)
				        			{
				        				max=temp;
				        			}
		        				}
		        				else
		        				{
		        					continue;
		        					
		        				}
		        			}
		        		}
		        		else
		        		{
		        			break;
		        		}
		        		
		        	}
		        }
		        
		        System.out.println(""+max);
			
				
			
		}
			
			
		


	
//	4
//	2
//	1 2
//	3
//	1 2 3
//	7
//	3 2 5 3 2 4 3
//	8
//	3 2 5 3 2 4 3

	
	
	
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []height=new long[n];
			for(int j=0;j<height.length;j++)
			{
				height[j]=scan.nextLong();
			}
			findmaxdistance(height);
		}
		
		
		
		
		
		
		
	}


}
