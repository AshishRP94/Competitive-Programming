package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class February_CodeChef_Starters_2021_3
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
	 
	 
//	 First line will contain a single integer, T, denoting the number of testcases. Then the testcases follow.
//	 The first line of each testcase will contain a single integer S, denoting the total number of seasons.
//	 The second line contains S space separated integers, Q1,Q2,…,QS, where Qi denotes the duration of the intro song in the ith season.
//	 The ith of the next S lines contains Ei+1 space separated integers, where the first integer is Ei, denoting the number of episodes in the ith season. That is followed by the duration of each of the Ei episodes, Li,1,Li,2,…,Li,Ei.
	public static void main(String[] args) throws java.lang.Exception
	{
		 FastReader scan = new FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 int season=scan.nextInt();
			 long []isong=new long[season];
			 for(int j=0;j<isong.length;j++)
			 {
				 isong[j]=scan.nextLong();
			 }
			 long tt=0;
			 for(int j=0;j<season;j++)
			 {
				 
			 int episodes=scan.nextInt();
			 for(int k=0;k<episodes;k++)
			 {
				 int et=scan.nextInt(); 
				 if(k==0)
				 {
					 tt+=et;
				 }
				 else
				 {
					 et-=isong[j];
					 tt=(tt+et);
				 }
			 }
			 }
			 
			 System.out.println(""+tt);
		 
		 }
		 

	}

}
