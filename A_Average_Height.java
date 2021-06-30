package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A_Average_Height
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
		FastReader scan= new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			ArrayList<Integer>even=new ArrayList<Integer>();
			ArrayList<Integer>odd=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				int h=scan.nextInt();
				if((h&1)==1)
				{
					odd.add(h);
				}
				else
				{
					even.add(h);
				}
			}
			
			for(int j=0;j<odd.size();j++)
			{
				System.out.print(odd.get(j)+" ");
			}
			
			for(int j=0;j<even.size();j++)
			{
				System.out.print(even.get(j)+" ");
			}
			
	
			
			System.out.println();
			
		}

	}

}
