package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Review_Site
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
	
	
	

	private static void countvotes(long[] arr)
	{
		int u1=0;
		int u2=0;
		int d1=0;
		int d2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				if(d1<u1)
				{
					u1+=1;
					continue;
				}
				else
				{
					if(d2<u2)
					{
						u2+=1;
						continue;
					}
					u1+=1;
				}
			}
			
			if(arr[i]==2)
			{
				if(u1<d1)
				{
					d1+=1;
					continue;
				}
				else
				{
					if(u2<d2)
					{
						d2+=1;
						continue;
					}
					
				}
				d1+=1;
				
				
				
			}
				
				
				
				
			if(arr[i]==3)
			{
				if(u1>=d1)
				{
					u1+=1;
					continue;
				}
				else
				{
					if(u2>=d2)
					{
						u2+=1;
						continue;
					}
				}
				d1=+1;				
			}
			
		
		}
		System.out.println(""+(u1+u2));
		
	}

	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
			}
			countvotes(arr);
			
		}

	}


}
