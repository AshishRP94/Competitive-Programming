package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Edit_Distance_Leetcode
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
	static int [][]dp;
	private static void init(int i, int j)
	{
		dp=new int[i][j];
		for(int k=0;k<dp.length;k++)
		{
			for(int l=0;l<dp[0].length;l++)
			{
				dp[k][l]=-1;
			}
		}
	}
	

	private static int convert(String s1, String s2, int i, int j)
	{
		if(i>=s1.length())
		{
//			s1=ho
//			s2=horse
			return s2.length()-j;
		}
		
		if(j>=s2.length())
		{
//			s1=horse
//			s2=ho
			return s1.length()-i;
		}
		
		if(s1.charAt(i)==s2.charAt(j))
		{
			return dp[i][j]=1+convert(s1, s2, i+1, j+1);
		}
		else
		{
			int count1=1+convert(s1, s2, i, j+1);//insert
			int count2=1+convert(s1, s2, i+1, j);//delete
			int count3=1+convert(s1, s2, i+1, j+1);//replace
			return dp[i][j]=Math.min(count1, Math.min(count3,count2));
			
		}
		
		
		
		
		
		
		
		

		
	
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s1=scan.nextLine();
			String s2=scan.nextLine();
			ArrayList<Character>word1=new ArrayList<Character>();
			init(s1.length(),s2.length());
			int count=convert(s1,s2,0,0);
			System.out.println(""+count);
		}
		

	}





}
