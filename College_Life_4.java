package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class College_Life_4 {
	
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
	
	static class pair implements Comparable<pair>
	{
		int price;
		char item;
		public pair(int price ,char item)
		{
			this.price=price;
			this.item=item;
		}
		
		 public int compareTo(pair o)
		 {
			 return price - o.price;
		 }
	}
	
	
	
	static long[][][]dp;
	static long mincost;
	
	private static void init(int friends, int eggs, int chocbars)
	{
		dp=new long[(friends+1)][(eggs+1)][(chocbars+1)];
		for(int i=0;i<=friends;i++)
		{
			for(int j=0;j<=eggs;j++)
			{
				for(int k=0;k<=chocbars;k++)
				{
					dp[i][j][k]=-1;
				}
			}
		}
		mincost=Long.MAX_VALUE;
	}
	
	
	
	private static long find_min_cost(int friends, int eggs, int chocbars, int pomm, int pchocmilk, int pchoccake)
	{
		if(friends==0)
		{
			return 1;
		}
		

		
		long tco=Long.MAX_VALUE,tcm=Long.MAX_VALUE,tcc=Long.MAX_VALUE;
		
		if(dp[friends][eggs][chocbars]!=-1)
		{
			return dp[friends][eggs][chocbars];
		}

		if(eggs>=2)
		{
//			ommelete
			tco=pomm+find_min_cost(friends-1, eggs-2, chocbars, pomm, pchocmilk, pchoccake);
		}
		
		
		if(eggs>=1 && chocbars>=1)
		{
//			chocolate cake
			tcc=pchoccake+find_min_cost(friends-1, eggs-1, chocbars-1, pomm, pchocmilk, pchoccake);
		}
		 
		
		if(chocbars>=3)
		{
//			chocolate milkshake
			tcm=pchocmilk+find_min_cost(friends-1, eggs, chocbars-3, pomm, pchocmilk, pchoccake);
			
		}
		
		return dp[friends][eggs][chocbars]=Math.min(tco, Math.min(tcm,tcc));
			
		
	
	
	}
	
//	3
//	5 4 4 2 2 2
//	4 5 5 1 2 3
//	4 5 5 3 2 1
	
	





	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int friends=scan.nextInt();
			int eggs=scan.nextInt();
			int chocbars=scan.nextInt();
			int pomm=scan.nextInt();
			int chocmilk=scan.nextInt();
			int choccake=scan.nextInt();
			init(friends,eggs,chocbars);
			find_min_cost(friends,eggs,chocbars,pomm,chocmilk,choccake);
			System.out.println(""+dp[friends][eggs][chocbars]);
				
		
		}
		

	}






//	3
//	5 4 4 2 2 2
//	4 5 5 1 2 3
//	4 5 5 3 2 1




}
