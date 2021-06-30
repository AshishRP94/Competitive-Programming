package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Maximum_Value {
	
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
	 
	
	private static long find_max_value(PriorityQueue<Long> pq, boolean flag)
	{
		long a=pq.poll();
//		System.out.println(a);
		long b=pq.poll();
		while(true)
		{
//			System.out.println("a="+a);
//			System.out.println("a="+b);
			if(a!=b)
			{
				break;
			}
			else
			{
				if(pq.size()==0)
				{
					break;
				}
				b=pq.poll();
			}
			
		}
//		System.out.println(b);
//		long t=Math.abs(a-b);
		if(flag==true)
		{
			
		long ans=((a*b)+(Math.max(a-b, b-a)));
		return ans;
		}
		else
		{
			long t=a+b;
			long ans=((a*b)-t);
			return ans;
			
		}
	
	
	}

	
		

	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan = new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
			PriorityQueue<Long> mpq = new PriorityQueue<Long>(Collections.reverseOrder());
			for(int j=0;j<n;j++)
			{
				
				long temp=scan.nextLong();
				if(temp>0)
				{
					pq.add(temp);
					
				}
				else
				{
					temp=Math.abs(temp);
					mpq.add(temp);
				}
			}
			long a=find_max_value(pq,true);
			long b=0;
			if(mpq.size()>=2)
			{
				
			b=find_max_value(mpq,false);
			}
			if(a>b)
			{
				System.out.println(""+a);
			}
			else
			{
				System.out.println(""+b);
			}
			
		}
        


	}






}
