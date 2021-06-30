package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import competitive_programming.A_Tit_for_Tat.FastReader;

public class B_Lecture
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
		int n=scan.nextInt();
		int m=scan.nextInt();
		HashMap<String,String>hm=new HashMap<String,String>();
		for(int i=0;i<m;i++)
		{
			String temp=scan.nextLine();
			boolean flag=false;
			String s1="";
			String s2="";
					
			for(String t:temp.split(" "))
			{
				
				if(flag==false)
				{
					 s1=t;
					 flag=true;
				}
				else
				{
					s2=t;					
					hm.put(s1,s2);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			String s1=scan.nextLine();
			String s2=hm.get(s1);
						
			if(s1.length()<s2.length())
			{
				System.out.print(s1+" ");
			}
			else if(s2.length()<s1.length())
			{
				System.out.print(s2+" ");				
			}
			else
			{
				System.out.print(s2+" ");								
			}
		}
//		4 3
//		codeforces codesecrof
//		contest round
//		letter message
//		codeforces contest letter contest
	}

}
