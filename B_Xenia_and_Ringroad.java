package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Xenia_and_Ringroad
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
            while (st == null || !st.hasMoreElements())
            {
                try
                {
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
	
	
	private static void solve(int[] house, int n)
	{
		long time=0;
		for(int i=0;i<house.length;i++)
		{
			if(i==0)
			{
				time+=((house[i])-1);
				continue;
			}
			if(house[i]<house[i-1])
			{
				time+=(((n-house[i-1])+((house[i])-1))+1);
			}
			else
			{
				time+=house[i]-house[i-1];
			}
		
		}
		System.out.println(""+(time));
		
	}

	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		int m=scan.nextInt();
		int []house=new int[m];
		for(int i=0;i<house.length;i++)
		{
			house[i]=scan.nextInt();
		}
		solve(house,n);
		
	}


}
