package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class OR_of_ANDs
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
			int q=scan.nextInt();
			long []arr=new long[n];
			HashMap<Long,Integer>set=new HashMap<Long,Integer>();
			long xor=0;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
				if(set.containsKey(arr[j])==false)
				{
					set.put(arr[j],1);
					xor=(xor|arr[j]);	
				}
				else
				{
					set.put(arr[j],(set.get(arr[j]+1)));
				}
			}
			System.out.println(""+xor);
			for(int j=0;j<q;j++)
			{
				long u=scan.nextLong();
				long v=scan.nextLong();
				int temp=-1;
				if(set.containsKey(u))
				{
					temp=set.get(u)-1;
					set.put(u, set.get(u)-1);
				}
				if(set.containsKey(v))
				{
					set.put(v,(set.get(v)+1));
					if(temp>0)
					{
						System.out.println(""+xor);						
					}
				}
				else
				{
					set.put(v,1);
					xor=0;
					for(long keys:set.keySet())
					{
						if(set.get(keys)>0)
						{
							xor|=keys;
						}
					}
					System.out.println(""+xor);
				}
				
			}
		}

	}

}
