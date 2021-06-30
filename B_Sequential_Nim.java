package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Sequential_Nim
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
	
//	The first line contains a single integer t (1≤t≤1000)  — the number of test cases. Next 2t lines contain descriptions of test cases.
//	The first line of each test case contains a single integer n (1≤n≤105)  — the number of piles.
//	The second line of each test case contains n integers a1,…,an (1≤ai≤109)  — ai is equal to the number of stones in the i-th pile.
//	It is guaranteed that the sum of n for all test cases does not exceed 105.

	private static void find_winner(int n, long[] stones)
	{
		
		
	}
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []stones=new long[n];
			for(int j=0;j<stones.length;j++)
			{
				stones[j]=scan.nextLong();
			}
			find_winner(n,stones);
			
		}
		

	}



}
