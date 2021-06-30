package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Random_Teams
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
	
	
	private static void solve(long n, long m)
	{
		long tm=m-1;
		long nn=n-m;
		long max=((nn*(nn-1))>>1);
		long min=n/m;
		long rem=n%m;
		if((rem)>0)
		{
			min+=1;
			long temp=min-rem;
			long ans=(((min*(min-1))>>1)*rem)+(temp*(temp-1)>>1);
			System.out.print(""+ans);
			System.out.print(" ");
			System.out.print(""+max);
		}
		else
		{
			System.out.print(""+min);
			System.out.print(" ");
			System.out.print(""+max);
		}
	}

	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		long n=scan.nextInt();
		long m=scan.nextInt();
		solve(n,m);
		System.out.println();
		

	}


}
