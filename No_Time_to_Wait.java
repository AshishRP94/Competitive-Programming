package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No_Time_to_Wait {
	
	static class FastReader {
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
	
	
	private static void help_chef(int cheftime, int timerem, int[] timezone)
	{
		for(int i=0;i<timezone.length;i++)
		{
			if((timerem+timezone[i])>=cheftime)
			{
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}
	

	public static void main(String args[]) throws java.lang.Exception
	{
        FastReader scan = new FastReader();
        int n=scan.nextInt();
        int cheftime=scan.nextInt();
        int timerem=scan.nextInt();
        int []timezone=new int[n];
        for(int i=0;i<n;i++)
        {
        	timezone[i]=scan.nextInt();
        }
        if(timerem>=cheftime)
        {
        	System.out.println("YES");
   
        }
        else
        {
        	help_chef(cheftime,timerem,timezone);
        	
        }
    
        
        

	}




}
