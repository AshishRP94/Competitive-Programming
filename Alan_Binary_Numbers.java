package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alan_Binary_Numbers
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
	
	private static void solve(String a, String b, int counta, int countb)
	{
		long ba=Long.parseLong(a);
		long bb=Long.parseLong(b);
		long ans=(ba&bb);
		long x=0;
		long y=0;
		boolean flag=false;
		if((ans&1)==1)
		{
			x=0;
			flag=true;
		}
		else
		{
			y=0;
			flag=false;
		}
		
		if(flag=true)
		{
//			make it even
			
		}
		else
		{
//			make it odd
			
		}
		
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String a=scan.nextLine();
			int counta=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)=='1')
				{
					counta+=1;
				}
			}
			String b=scan.nextLine();
			int countb=0;
			for(int j=0;j<b.length();j++)
			{
				if(b.charAt(j)=='1')
				{
					countb+=1;
				}
			}
			solve(a,b,counta,countb);
		}

	}



}
