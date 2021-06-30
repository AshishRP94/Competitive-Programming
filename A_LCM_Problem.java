package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_LCM_Problem {

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
	
//	The first line contains one integer t (1≤t≤10000) — the number of test cases.
//	Each test case is represented by one line containing two integers l and r (1≤l<r≤109).
	static int gcd(int a, int b)
	{
		if (a == 0)
		{
			
			return b; 
		}
		return gcd(b % a, a); 
	}
	
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}
	
	
	private static void find_x_y(long l, long r)
	{
		long ll=l*2;
		if((ll)<=r)
		{	
			System.out.println(""+l+" "+ll);
		}
		else
		{
			l=-1;
			ll=-1;
			System.out.println(""+l+" "+ll);
		
		}
		
		
	}


	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long l=scan.nextLong();
			long r=scan.nextLong();
			find_x_y(l,r);
		
		}
		

	}
	}


