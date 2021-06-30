package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chef_in_Heaven
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
	
	
	private static void solve()
	{
		double ans=0;
		int count=0;
		double temp=50.00;
		boolean flag=false;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='1')
			{
				count+=1;
				ans=(double)(count*100/(j+1));
				if(ans>=temp)
				{
					flag=true;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
			
		}
		
	}
 
    static String s="";
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			s="";
			int l=scan.nextInt();
			s=scan.nextLine();
			solve();
	
	    }

    }

}
