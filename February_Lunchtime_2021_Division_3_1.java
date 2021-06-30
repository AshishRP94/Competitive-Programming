package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class February_Lunchtime_2021_Division_3_1 {
	
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

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first and only line of each test case contains two space-separated integers N and K.
	private static void find_sol(long n, long k)
	{
	
		long ans=n%k;
	    System.out.println(""+ans);
	
	}

	
	public static void main(String[] args)throws java.lang.Exception
	{
//		Scanner scan=new Scanner(System.in);
        FastReader scan = new FastReader();

		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=scan.nextLong();
			long k=scan.nextLong();
			find_sol(n,k);
		}
		
//		3
//		5 2
//		4 4
//		2 5
		

	}

}
