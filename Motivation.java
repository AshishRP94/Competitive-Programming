package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Motivation
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
	
	static class Pair implements Comparable<Pair>
	{
		int value;
		int index;
		public Pair(int value,int index)
		{
			this.value=value;
			this.index=index;
			
		}
		
		 public int compareTo(Pair o) {
		        return value - o.value;
		    }
	}
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long space=scan.nextLong();
			long max=Long.MIN_VALUE;
//			System.out.println("space"+space);
//			System.out.println("max"+max);
			for(int j=0;j<n;j++)
			{
				long fspace=scan.nextLong();
				long ratings=scan.nextLong();
//				System.out.println("fspzce"+fspace);
				if((space-fspace)>=0)
				{
//					System.out.println("in");
					if(max<=ratings)
					{
						max=ratings;
					}
					
				}
				
			}
			System.out.println(""+max);
		}
		
	}

}
