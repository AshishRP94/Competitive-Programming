package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_Substring_Removal_Game
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
	
	
	
//	The first line contains one integer T (1≤T≤500) — the number of test cases.
//
//	Each test case contains exactly one line containing a binary string s (1≤|s|≤100).
//
//	Output
//	For each test case, print one integer — the resulting score of Alice (the number of 1-characters deleted by her)
	
	private static void Alice_score(String bs)
	{

		int count=0;
		int start=0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int l=bs.length();
		for(int i=0;i<l;i++)
		{
			
			if(bs.charAt(i)=='1')
			{
				count+=1;
			}
			else
			{
				pq.add(count);
				count=0;
			}
			
		}
		if(count>0)
		{
			pq.add(count);
		}
		
		int len=pq.size();
		int alice=0;
		for(int i=0;i<len;i++)
		{
			int ones=pq.poll();
			if((i&1)==0)
			{
				alice+=ones;
			}
		}
		
		System.out.println(""+alice);
		
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		String bs;
	    boolean flag=false;
		for(int i=0;i<t;i++)
		{
			bs=scan.nextLine();
			Alice_score(bs);
			}
	}





}
