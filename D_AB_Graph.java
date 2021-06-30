package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_AB_Graph
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

//	The first line contains a single integer t (1≤t≤500) — the number of test cases.
//	The first line of each test case contains two integers n and m (2≤n≤1000; 1≤m≤105) — the number of vertices in the graph and desirable length of the palindrome.
//	Each of the next n lines contains n characters. The j-th character of the i-th line describes the character on the edge that is going from node i to node j.
//	Every character is either 'a' or 'b' if i≠j, or '*' if i=j, since the graph doesn't contain self-loops.
//	It's guaranteed that the sum of n over test cases doesn't exceed 1000 and the sum of m doesn't exceed 105.


	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int nodes=scan.nextInt();
			int palindrome=scan.nextInt();
			scan.nextLine();
			boolean flag=false;
			String temp;
			for(int j=0;j<nodes;j++)
			{
				
				String s=scan.nextLine();
				if(flag==false)
				{
					temp=s;
					flag=true;
				}
			}
			for(int j=0;j<palindrome;j++)
			{
				Syste
			}
		}
		
		

	}

}
