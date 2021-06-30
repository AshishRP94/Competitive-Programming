package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Count_K_Primes
{

//	First line of input contains a single integer T, the number of times they play.
//	Each game is described in a single line containing the three numbers A,B & K.
	
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
	
	
	
	
	static int[] sieve=new int[100000];
	private static void constructseive_primef()
	{
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i; 
		}
			
		for(int i=2;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int f=(i*i);f<sieve.length;f=f+i)
				{
					if(sieve[f]==f)
					{
						sieve[f]=i;
					}
				}
			}
			
		}
	}
	

	static int []dp=new int[100000];
	private static void init()
	{
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	

	static int counts=0;
	private static int countkp(int l, int r, int k,int tc)
	{
		if(l>=r+1)
		{
			counts=tc;
			return 0;
		}
		
		int t=l;
		HashSet<Integer> set = new HashSet<Integer>();
		while(true)
		{
			if(t==1)
			{
				break;
			}
			int temp=sieve[t];
			set.add(temp);
			t=t/temp;
		}
			
	
		if(set.size()==k)
		{
//			System.out.println("if");
			countkp(l+1, r, k, tc+1);
		}
		else
		{
//			System.out.println("else");
			countkp(l+1, r, k, tc);
		}
		return 0;
	}

	
	

	
	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		constructseive_primef();
		int t=scan.nextInt();
		init();
		for(int i=0;i<t;i++)
		{
			int l=scan.nextInt();
			int r=scan.nextInt();
			int k=scan.nextInt();
			countkp(l,r,k,0);
			System.out.println(""+counts);
			counts=0;
			
		}
		
		

	}






}
