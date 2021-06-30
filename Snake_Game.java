package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snake_Game
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
	
	
	private static void solve(long[] x, long[] y, long m)
	{
		long px=0,py=0;
		long tot=0;
		long ans1=0;
		for(int i=0;i<x.length;i++)
		{
			if(i==0)
			{
				ans1=(x[i]-px);
				ans1=ans1*ans1;
			}
			else
			{
				px=x[i-1];
				py=y[i-1];
				ans1=(x[i]-px);
				ans1=ans1*ans1;
			}
			long ans2=y[i]-py;
			ans2=ans2*ans2;
			long mans=(long)Math.ceil(Math.sqrt((ans1+ans2)));
			tot+=mans;
		}
//		System.out.println("tot"+tot);		
		if(tot<m)
		{
			System.out.println("YES");
  		}
		else
		{
			System.out.println("NO");			
		}
	}
	
	public static void main(String[] args)
	{
		 FastReader scan=new  FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 int k=scan.nextInt();
			 int m=scan.nextInt();
			 int []x=new int[k];
			 for(int j=0;j<x.length;j++)
			 {
				 x[j]=scan.nextInt();
			 }
			 
			 int []y=new int[k];
			 for(int j=0;j<y.length;j++)
			 {
				y[j]=scan.nextInt();
			 }
			 solve(x,y,m);
		 }
		

	}



}
