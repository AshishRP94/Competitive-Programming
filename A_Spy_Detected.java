package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A_Spy_Detected
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
	
//	Input
//	The first line contains a single integer t (1≤t≤100). Then t test cases follow.
//
//	The first line of each test case contains a single integer n (3≤n≤100) — the length of the array a.
//
//	The second line of each test case contains n integers a1,a2,…,an (1≤ai≤100).
//
//	It is guaranteed that all the numbers except one in the a array are the same.
	
	static class pair
	{
		long count=0;
		long i=0;
		public pair(long count,long i)
		{
			this.count=count;
			this.i=i;
		}
	}
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
		    HashMap<Long,pair> hm=new HashMap<Long,pair>();  
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextLong();
				if(hm.containsKey(arr[j])==true)
				{
					long counts=hm.get(arr[j]).count+1;
					long ind=hm.get(arr[j]).i;
					
					hm.put(arr[j],new pair(counts,ind));
				}
				else
				{
					hm.put(arr[j],new pair((long) 1,j));	
				}
			}
			for (long keys :hm.keySet())
			{
				if(hm.get(keys).count==1)
				{
					System.out.println(((hm.get(keys).i)+1));
				}
			}
		}
		

	}

}
