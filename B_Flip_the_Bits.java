package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Flip_the_Bits
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
			String a=scan.nextLine();
			String b=scan.nextLine();
	
			
			int counta=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)=='1')
				{
					counta+=1;
				}
			}
			
			int countb=0;
			for(int j=0;j<b.length();j++)
			{
				if(b.charAt(j)=='1')
				{
					countb+=1;
				}
			}
			System.out.println("counta="+counta+"|countb="+countb);
			if(counta==countb)
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


