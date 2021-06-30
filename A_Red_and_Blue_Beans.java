package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Red_and_Blue_Beans
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

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
		   long r=scan.nextLong();
		   long b=scan.nextLong();
		   long d=scan.nextLong();
		   
		   if((r==b)&& (d==0))
		   {
			   System.out.println("YES");
			   continue;
		   }
		   
		   if((r!=b)&& (d==0))
		   {
			   System.out.println("NO");
			   continue;
		   }
		   
		   if((Math.abs(r-b)<=d))
		   {
			   System.out.println("YES");
			   continue;
		   }
		   else
		   {
			   
		   }
		   
		   
		   
		   
		   
		   
		}

	}

}
