package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Weight_Balance
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
	
	
	/*
	 * The first line of the input contains a single integer T denoting the number
	 * of test cases. The description of T test cases follows. The first and only
	 * line of each test case contains five space-separated integers w1, w2, x1, x2
	 * and M.
	 */
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();	
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int w1=scan.nextInt();
			int w2=scan.nextInt();
			int x1=scan.nextInt();
			int x2=scan.nextInt();
			int m=scan.nextInt();
			int ranges=x1*m;
			int rangee=x2*m;
			if((w2-w1)>=ranges && (w2-w1)<=rangee)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
				
			}
		}
	}

}
