package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A_Strange_Table
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
	
	private static long findx(long n, long m, long x)
	{
		
		long coc=0;
		long temp=0;
//		System.out.println("n="+n+"m="+m+"x="+x);
		for(long i=0;i<m;i++)
		{
			temp+=n;
//			System.out.println("temp="+temp);
			if(temp>=x)
			{
				coc=i+1;
//				System.out.println("break");
				break;
			}
		}
//		System.out.println("coc"+coc);
		long cor=0;
		if(temp==x)
		{
//			System.out.println("if");
			cor=n;
//			System.out.println("cor"+cor);
		}
		else
		{
			long y=temp-x;
//			System.out.println("y="+y);
			cor=n-y;
//			System.out.println("cor="+cor);
		}
		
		long z=(m*(cor-1));
//		System.out.prin/tln("z="+z);
		
		
		
//		System.out.println("z+coc="+(z+coc));
		return (z+coc);
	}
	
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{

			long n=scan.nextLong();
			long m=scan.nextLong();
			long x=scan.nextLong();
			long count=findx(n,m,x);
			long mul=(m*n);
//			System.out.println("mul="+mul);
			if(mul==x)
			{
				System.out.println(""+x);
				
			}
			else
			{
				System.out.println(""+count);
				
			}
		}

	}

	

}
