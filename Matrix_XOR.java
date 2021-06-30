package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Matrix_XOR
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
	    HashMap<Long, Long> hm = new HashMap<Long, Long>();
	    for(long i=1;i<1000000;i++)
	    {
	    	for(long j=1;j<1000000;j++)
	    	{
	    		if(hm.containsKey((i+j)))
	    		{
	    			long count=hm.get((i+j));
	    			hm.put((i+j), (count+1));
	    		}
	    		else
	    		{
	    			long a=1;
	    			hm.put((i+j),a);
	    		}
	    	}
	    }

		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			long k=scan.nextLong();
			long tc=(n*m);
			int msum=n+m;
			long xor;
			if((tc&1)==1)
			{
				xor=k;
			}
			else
			{
				xor=0;
			}
			for(long key:hm.keySet())
			{
				if(key>msum)
				{
					break;
				}
				if((hm.get(key)&1)==1)
				{
					xor=xor^key;
				}
			}
			System.out.println(""+xor);
			
			
			
		}
		

	}

}
