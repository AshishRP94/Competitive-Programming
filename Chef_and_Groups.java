package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Chef_and_Groups {
	
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
	
	
	private static void find_gp_of_friends(String s)
	{
		int count=0;
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='1')
			{
//				System.out.println("if s at i="+s.charAt(i));
//				System.out.println("flag="+flag);
				if(flag==false)
				{
					count+=1;
				}
				flag=true;
			}
			else
			{
				flag=false;
//				System.out.println("init");
			}
		}
		System.out.println(""+count);
		
	}
	

	public static void main(String[] args)throws java.lang.Exception
	{
		
        FastReader scan = new FastReader();
        int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scan.next();
			find_gp_of_friends(s);
		}
		
		
		
	}



}
