package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Just_Substract_IT
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

			int n=scan.nextInt();
			int k=scan.nextInt();
			HashMap<Long,Long>hm=new HashMap<Long,Long>();
			for(int j=0;j<n;j++)
			{
				long temp1=scan.nextLong();
				long temp=(long)(temp1%k);
				if(hm.containsKey(temp)==true)
				{
					hm.put(temp,(hm.get(temp)+1));
				}
				else
				{
					hm.put(temp,(long)1);					
				}
			}
			
			long ans=0;
			for(long keys:hm.keySet())
			{
//				System.out.println(""+ans+"|"+keys);
				long count=hm.get(keys);
				if((count&1)==1)
				{
					ans+=2;
				}
				else
				{
					ans+=1;
				}
				
			}
			
			System.out.println(""+ans);
			
			
			
			
		

	}

}