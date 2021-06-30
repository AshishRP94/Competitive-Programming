package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pawri_ho_rahi_hai
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


	private static void findwinner(String rashmi, String mohit)
	{
		long sumr=0;
		for(int i=0;i<rashmi.length();i++)
		{
			sumr+=(long)rashmi.charAt(i);
		}
		
//		System.out.println("sumr="+sumr);
		long summ=0;
		for(int i=0;i<mohit.length();i++)
		{
			summ+=(long)mohit.charAt(i);
		}
//		System.out.println("summ="+summ);
		
		if(summ==sumr)
		{
			System.out.println("NO");
		}
		else
		{
			
		long ans=Math.abs(sumr-summ);
		if(ans>=1 && ans<=10)
		{
			System.out.println("Rashmi");
		}
		else
		{
			System.out.println("Mohit");
		}
		
		}
		
		
	}
	
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String mohit=scan.nextLine();
			String rashmi=scan.nextLine();
			findwinner(rashmi,mohit);
		}
		
		


	}

}
