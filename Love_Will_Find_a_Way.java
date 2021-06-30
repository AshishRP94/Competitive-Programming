package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Love_Will_Find_a_Way
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
			long sachin=scan.nextLong();
			long sakshi=scan.nextLong();
			long item=scan.nextLong();
			
			long modsachin=sachin%item;
			long modsakshi=sakshi%item;
		
			if(modsachin>0 && modsakshi>0)
			{
				
			long rem1=(item-modsachin);
//			System.out.println("rem1="+rem1);
			long rem2=(item-modsakshi);
//			System.out.println("rem2="+rem2);
			
			if(rem1<=rem2)
			{
				long ans=modsakshi-rem1;
//				System.out.println("ans if="+ans);
				if(ans>=0)
				{
					System.out.println(""+rem1);					
				}
				else
				{
					long ans1=modsachin-rem2;
					if(ans1>0)
					{
						System.out.println(""+rem2);					
						
					}
					else
					{
						System.out.println("0");					
						
					}
				}
			}
			else
			{
				
				long ans=modsachin-rem2;
				if(ans>0)
				{
					System.out.println(""+rem1);
					
				}
				else
				{
					long ans2=modsakshi-rem1;
					if(ans2>=0)
					{
						System.out.println(""+rem1);					
					}
					else
					{
						System.out.println("0");					
						
					}
				}
			}
			}
			else
			{
				
				long ans=0;
				System.out.println(""+ans);
			}
			
		}

	}

}
