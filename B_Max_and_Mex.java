package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_Max_and_Mex
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
	
//	The input consists of multiple test cases. The first line contains a single integer t (1≤t≤100) — the number of test cases. The description of the test cases follows.
//	The first line of each test case contains two integers n, k (1≤n≤105, 0≤k≤109) — the initial size of the multiset S and how many operations you need to perform.
//	The second line of each test case contains n distinct integers a1,a2,…,an (0≤ai≤109) — the numbers in the initial multiset.
//	It is guaranteed that the sum of n over all test cases does not exceed 105.
	
	
	private static long mex(PriorityQueue<Long> pq)
	{
		
		
		int len=pq.size();
		long mexx=0;
		for(int i=0;i<len;i++)
		{
			long temp=pq.poll();
			if((pq.peek()-temp)==1)
			{
				
			}
			else
			{
				mexx=temp+1;
				break;
			}
		}
			
		return mexx;
	}
	
	
	private static void operations(int n, long k, long max, HashSet<Long> set, PriorityQueue<Long> pq)
	{
		long mex=mex(pq);
		for(long i=0;i<)
		
	}

	
	




	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		int n=scan.nextInt();
		long k=scan.nextLong();
		long max=Long.MIN_VALUE;
	    HashSet<Long> set=new HashSet<Long>();
        PriorityQueue<Long> pq = new PriorityQueue<Long>();

	    for(int i=0;i<n;i++)
	    {
	    	long temp=scan.nextInt();
	    	set.add(temp);
	    	pq.add(temp);
	    	if(temp>max)
	    	{
	    		temp=max;
	    	}
	    }
	    
	    operations(n,k,max,set,pq);
	    	

		
		
	}


}
