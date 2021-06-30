package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Restore_Modulo
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
	
	
	private static void findM(long[] arr, long max)
	{
		long m=(max+1);
		while(true)
		{
			
			for(int j=0;j<arr.length;j++)
			{
				long temp=arr[j];
				if()
			}
		
		}
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
			long max=Integer.MIN_VALUE;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
				if(max<arr[j])
				{
					max=arr[j];
				}
			}
			findM(arr,max);
		}

	}



}
