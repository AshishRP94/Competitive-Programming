package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class World_Record
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
	

	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		for(int i=0;i<t;i++)
		{
			double k1=scan.nextDouble();
			double k2=scan.nextDouble();
			double k3=scan.nextDouble();
			double v=scan.nextDouble();
			double ans=100/(k1*k2*(k3*v));
			double temp=Double.parseDouble(df.format(ans));
			if(temp<9.58)
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
