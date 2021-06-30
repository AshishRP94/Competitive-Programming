package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Suffix_Sort {
	
	
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
			long []ability=new long[n];
			long min=Long.MAX_VALUE;
			long max=Long.MIN_VALUE;
			int ind1=0;
			int ind2=0;
			boolean flag1=false;
			boolean flag2=false;
			boolean flag3=false;
			for(int j=0;j<ability.length;j++)
			{
				ability[j]=scan.nextLong();
				if(n<=ability.length-1)
				{
				if(ability[j]>ability[j+1])
				{
					flag1=true;
					System.out.println("flag1="+flag1);
				}
				}
				
			}
			
			
			int k=0;
			for(int j=0;j<ability.length-1;j++)
			{
				if(ability[j]>ability[j+1])
				{
					
					flag2=true;
					k=j;
					break;
				}
			}
			
			k=k+1;
			int x=k-1;
			for(;k<ability.length-1;k++)
			{
				if(ability[k]>ability[k+1])
				{
					
					flag3=true;
					break;
				}
			}
			
			if(flag1==false)
			{
				System.out.println("0");
			}
			else if(flag3==false && ability[x]>=ability[(ability.length-1)])
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("NO");
			}
			
			
		}
	}

}
