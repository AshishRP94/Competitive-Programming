package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turn_It 
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
	
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long u=scan.nextLong();
			long v=scan.nextLong();
			long a=scan.nextLong();
			long s=scan.nextLong();
			long temp=(u*u)-(2*a*s);
			System.out.println("temp="+temp);
			long ans=0;
			if(temp==2)
			{
				ans=2;
			}
			else
			{
				ans=(long) Math.sqrt(temp);
			}
			if(ans<=v)
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
