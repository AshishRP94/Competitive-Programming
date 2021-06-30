package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Place_The_Numbers_Game
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
	
	
	
	
	
//	First line will contain T, number of testcases. Then the testcases follow.
//	Each testcase contains the 1st input integer as an size of array i.e N
//	There are N elements followed by a[1],a[2],a[3]…….a[N];
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
//			System.out.println("i="+i);
			int n=scan.nextInt();
			long []arr=new long[n];
			int even=0;
			int odd=0;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
				if((arr[j]&1)==0)
				{
					even+=1;
				}
				else
				{
					odd+=1;
				}
				
			}
			
			int halfe=arr.length/2;
			if((arr.length&1)==1)
			{
				halfe+=1;
			}
			int halfo=arr.length-halfe;
			if(odd==halfo && even==halfe)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
				
			}
			
			
		}

	}



}
