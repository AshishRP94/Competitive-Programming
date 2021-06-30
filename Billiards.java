package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Billiards 
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
	
	static int []dp;
	private static void init(int x)
	{
		dp=new int[(x+1)];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	
	
	private static int count(int x, int[] arr, int sum)
	{
		if(sum>x)
		{
			return 0;
		}
		if(sum==x)
		{
			return 1;
		}
		int count=0;
		if(dp[sum]!=-1)
		{
			return dp[sum];
		}
		for(int i=0;i<arr.length;i++)
		{
			if((sum+arr[i])<=x)
			{
				count=((count+count(x, arr, sum+arr[i]))%1000000009);
			}
		}
		
		return dp[sum]=count;
	}

	
	
//	The first line of input will contain an integer T which denotes the number of test cases. 1≤T≤2000
//	The next T lines will each have a positive integer X, denoting the score which has to be achieved.


	
	public static void main(String args[]) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=scan.nextInt();
			if(x==1||x==0)
			{
				System.out.println("0");
			}
			else if(x==3||x==2)
			{
				System.out.println("1");
			}
			else
			{
				
			int []arr=new int[2];
			arr[0]=2;
			arr[1]=3;
			init(x);
			System.out.println(count(x,arr,0));
			}
		
		}
		
		
		
		
	}








}