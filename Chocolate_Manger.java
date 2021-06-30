package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Chocolate_Manger {
	
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
			int n=scan.nextInt();
			int x=scan.nextInt();
			long []flavor=new long[n];
			HashSet<Long>set=new HashSet<Long>();
			for(int j=0;j<flavor.length;j++)
			{
				flavor[j]=scan.nextLong();
				set.add(flavor[j]);
			}
			int len=set.size();
			if(len==n)
			{
				System.out.println(""+(len-x));				
			}
			else if(len<n)
			{
				if(Math.abs(len-n)>=x)
				{
					System.out.println(""+(len));													
				}
				else
				{
					int temp=Math.abs(len-n);
					int ans=Math.abs(temp-x);
					System.out.println(""+(len-ans));													
					
					
				}
			}
			
		}

	}

}
