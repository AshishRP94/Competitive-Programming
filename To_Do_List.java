package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class To_Do_List
{
	
//	i want to crack amazon
//  use your brains	
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
		int x=scan.nextInt();
		long sum=0;
		for(int i=0;i<n;i++)
		{
			int temp=scan.nextInt();
			sum+=temp;
		}
		sum=-x;
		if(sum<=24)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
