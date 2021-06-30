package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_Kitkat
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
	
	
	static int []eratosthenes=new int[100000];
	//1-is prime 
	//0-not prime
	private static void sieve_of_eratosthenes()
	{
		
		for(int i=2;i<eratosthenes.length;i++)
		{
			eratosthenes[i]=1;
		}
		
		int c=0;
		for(int i=2;(i*i)<eratosthenes.length;i++)
		{
			if(eratosthenes[i]==1)
			{
				c+=1;
				for(int p=i*i;p<eratosthenes.length;p=p+i)
				{
					if(eratosthenes[p]==1)
					{
						
						eratosthenes[p]=0;
					}
					
				}
			}
		}
	}
	
	private static void solve(int[] arr)
	{
		int sum=0;
		int i=0;
		int j=arr.length-1;
		while(true)
		{
			if(i>=j)
			{
				break;
			}
			int diff=Math.abs(arr[i]-arr[j]);
			sum+=diff;
			i+=1;
			j-=1;
		}
		
		if(sum==1||sum==0)
		{
			System.out.println("KITKAT");			
		}
		else if(eratosthenes[sum]==1)
		{
			System.out.println("KIT");
		}
		else
		{
			System.out.println("KAT");
			
		}
		
		
		
		
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		sieve_of_eratosthenes();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			solve(arr);
			
		}

	}



}
