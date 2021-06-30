package competitive_programming;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class CodeChef_Div_3_Rated_Contest_2021_1 {

//	The first line of input contains a single integer T, denoting the number of testcases. Then the testcases follow.
//	First line of each testcase contains 2 space separated integers, N and K, denoting the number of participants and the number of problems in the contest respectively.
//	The second line contains K space separated integers - A1,A2,…,AK, where Ai denotes the points assigned to the ith problem.
//	The ith of the next N lines contains a binary string Si of length K, where Sij represents the verdict of the jth problem for ith participant. Sij=1 if they solved that problem, and Sij=0 otherwise.
	
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
	 
	private static void find_total_score(int[] points, int problems, String[] verdict)
	{
		for(int i=0;i<verdict.length;i++)
		{
			long ts=0;
			for(int j=0;j<points.length;j++)
			{
				if(verdict[i].charAt(j)=='1')
				{
					ts+=points[j];
				}
			}
			System.out.println(ts);
		}
		
		
	}
	
	
	public static void main(String[] args) throws java.lang.Exception
	{
		
		
//		Scanner scan=new Scanner(System.in);
        FastReader scan = new FastReader();

		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=scan.nextInt();
			int problems=scan.nextInt();
			int []points=new int[problems];
			for(int i=0;i<problems;i++)
			{
				points[i]=scan.nextInt();
			}
			String []verdict=new String[n];
//			scan.nextLine();
			for(int i=0;i<n;i++)
			{
				verdict[i]=scan.nextLine();
			}
			find_total_score(points,problems,verdict);
			
			
		}

	}





}
