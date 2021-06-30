package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class OR_thodox_Distinction
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
	
	
	private static void distinct(long[] arr)
	{
     HashSet<Long>set=new HashSet<Long>();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
		    long value=0;
			for(int j=i;j<arr.length;j++)
			{
//				System.out.println("arr[j]"+arr[j]);
				value=(value|(arr[i]|arr[j]));
//				System.out.println("value"+value);
				if(set.contains(value))
				{
					flag=true;
//					System.out.println("flag"+flag);
					break;
				}
				else
				{
					set.add(value);
				}
			}
			if(flag==true)
			{
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("NO");
		
		}
		else
		{
			System.out.println("YES");
		}

			
		
	}


	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextLong();
			}
			distinct(arr);
			
			
		}
	}




	
	
}

//	4/*
//	3
//	1 2 7
//	2
//	1 2
//	3
//	6 5 8
//	5
//	12 32 45 23 47*/


