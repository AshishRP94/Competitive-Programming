package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class IPL_Pawri
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

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			HashMap<Long,Long>hm=new HashMap<Long,Long>();
			for(int j=0;j<n;j++)
			{
				long temp=scan.nextLong();
				if(hm.containsKey(temp)==true)
				{
					hm.put(temp,(hm.get(temp)+1));
				}
				else
				{
					hm.put(temp,(long)1);
				}
			}
			
			for(long keys:hm.keySet())
			{
				long c=3;
				if(hm.get(keys)==c)
				{
					long ans=keys+keys+keys;
					System.out.println(""+ans);
					break;
				}
			}
		}

	}

}
