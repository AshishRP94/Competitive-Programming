package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_Ordinary_Numbers
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
		
//		long l=1000000000;
//		
//		HashMap<Long,Long>hm=new HashMap<Long,Long>();
//		long count=9;
////		int temp=0;
//		for(long i=0;i<=l;i++)
//		{
//			if(i<=9)
//			{
//				hm.put(i,i);				
//			}
//			else if((i%10)==0)
//			{
//				hm.put(i, hm.get(i-1));
//			}
//			else
//			{
//				if((i%11)==0)
//				{
//					count+=1;
//				}
//				hm.put(i, count);
//			}
//		}
		
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=scan.nextLong();
			long count=9;
			if(n<=9)
			{
				System.out.println(n);
			}
			else
			{
				if(n==10)
				{
					System.out.println(9);					
				}
				int temp=0;
				for(long j=10;j<=n;j++)
				{
					if(j%11==0) 
					{
						if(j/11<=9)
						{
							
							count+=1;						
						}
					}
				}
				System.out.println(count);				
			}
		}

	}

}
