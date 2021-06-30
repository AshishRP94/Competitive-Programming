package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chef_and_Dice
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
	
	private static void find(long n)
	{
		long temp=n%4;
		long sum=(temp)*44;
		long rem=(temp);
		if(n>4)
		{
			if(rem==0)
			{
				sum+=16;
			}
			else if(rem==1)
			{
				sum+=32;
			}
			else if(rem==2)
			{
				sum+=44;
				
			}
			else if(rem==3)
			{
				sum+=55;
			}
			System.out.println(sum);
			
		}
		else
		{
			if(n==1)
			{
				System.out.println(20);
				
			}
			else if(n==2)
			{
				System.out.println(36);
				
			}
			else
			{
				System.out.println(51);
				
			}
			
		}
		
	}


	public static void main(String[] args)
	{
		 FastReader scan=new  FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 long n=scan.nextLong();
			 find(n);
		 }
		 

	}


}
