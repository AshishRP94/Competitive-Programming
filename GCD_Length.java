package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCD_Length
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
	   
	static int gcd(int a, int b)
	{
		if (b == 0)
		{
			return a;			
		}
		
		return gcd(b, a % b);
	}
	static long []temp=new long[10];
	
	private static void solve(int a, int b, int c)
	{

		
		
	}

	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			if(a==1||b==1)
			{
				System.out.println("1 1");
			}
			else
			{
				solve(a,b,c);				
			}
			
			
			
		}
		

	}


}
