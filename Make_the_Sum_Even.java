package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Make_the_Sum_Even 
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
	
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
			long temp=0;
			boolean flag=false;
			long sum=0;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
				sum+=arr[j];
			}
			if((sum&1)==0)
			{
				System.out.println("0");
			}
			else
			{
				
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&1)==0 &&(((arr[j]+1)/2-1)<=0))
				{
					flag=true;
					
				}
				
			}
			}
			
			

				if(flag==true )
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("-1");					
				}
			}
		
		}
		
		
	}

