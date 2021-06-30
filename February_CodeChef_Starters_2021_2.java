package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class February_CodeChef_Starters_2021_2
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

//	 The first line of the input contains a single integer T, denoting the number of test cases.
//	 The first line of each test case contains two space-separated integers D and C, denoting the delivery charge, and the price of the coupon, respectively.
//	 The second line of each test case contains three space-separated integers A1,A2 and A3, denoting the prices of the food items that Chef plans to order on Day 1, respectively.
//	 The third line of each test case contains three space-separated integers B1, B2 and B3, denoting the prices of the food items that Chef plans to order on Day 2, respectively.
	
	 private static int find_with_c(int dvc, int cc, int d1c, int d2c)
	 {
		 int total=cc;
		 if(d1c>=150)
		 {
			 total+=0+d1c;
		 }
		 else
		 {
			 total+=d1c+dvc;
		 }
		 
		 
		 if(d2c>=150)
		 {
			 total+=0+d2c;
		 }
		 else
		 {
			 total+=d2c+dvc;
		 }
		 
		 
		 
		 
		return total;
		 
			
	 }
	 
		private static int find_without_c(int dvc, int cc, int d1c, int d2c)
		{
			
			
			return ((dvc+dvc)+(d1c+d2c));
			
			
		}
	 
	 
	 public static void main(String[] args)throws java.lang.Exception
	{
		 FastReader scan = new FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 int dvc=scan.nextInt();
			 int cc=scan.nextInt();
			 int d1c=0,d2c=0;
			 for(int j=0;j<3;j++)
			 {
				 int c=scan.nextInt();
				 d1c+=c;
			 }
			 
			 for(int j=0;j<3;j++)
			 {
				 int c=scan.nextInt();
				 d2c+=c;
			}
			int wc=find_with_c(dvc,cc,d1c,d2c);
			int wnc=find_without_c(dvc,cc,d1c,d2c);
			 if(wc<wnc)
			 {
				 System.out.println("YES");
 			 }
			 else
			 {
				 System.out.println("NO");
				 
			 }
		 }

	}






}
