package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Dp_Count_Subarrays
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
	
	static int []dp;
	static HashSet<ArrayList<Integer>>set;
	private static void init(int length)
	{
		dp=new int[length];
		set=new HashSet<ArrayList<Integer>>();
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	
	private static int count(int[] arr, int i, ArrayList<Integer> temp)
	{
		if(i<=arr.length-1)
		{
			boolean flag=false;
			if(set.contains(temp))
			{
				return 0;
			}
			else
			{
			set.add(temp);
			for(int k=0;k<temp.size()-1;k++)
			{
				if(temp.get(i)<temp.get(i+1))
				{
					
				}
				else
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				return 1;
			}
			else
			{
				return 0;
			}
			}
		}
		
		int cost=0;
		for(int j=i;j<arr.length;j++)
		{
			temp.add(arr[j]);
		}
		temp.clear();
		cost+=count(arr, i+1, temp);
		return cost;
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			init(arr.length);
			ArrayList<Integer>temp=new ArrayList<Integer>();
			int cost=count(arr,0,temp);
			System.out.println(""+cost);
		}

	}
	
	/*2
	4
	1 4 2 3
	1
	*/
	






}
