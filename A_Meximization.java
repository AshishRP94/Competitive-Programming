package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A_Meximization
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
	

	private static void reordering(int[] arr, HashMap<Integer, Integer> hm)
	{
		int i=0;
		while(true)
		{
//			System.out.println("size"+hm.size());
			if(hm.size()==0||i==(arr.length))
			{
				break;
			}
			
			for(int key:hm.keySet())
			{
				if(hm.get(key)!=0)
				{
					i+=1;
					System.out.print(key+" ");
					
				}
//				System.out.println("size"+hm.size());
				if(hm.get(key)==0)
				{
					
				}
				else
				{
					hm.put(key, hm.get(key)-1);
				}
			}
		}
		System.out.println();
		
		
	}
	
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>(); 
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
				if(hm.containsKey(arr[j]))
				{
					hm.put(arr[j],(hm.get(arr[j])+1));
				}
				else
				{
					hm.put(arr[j],1);
					
				}
			}
//			System.out.println("call");
			reordering(arr,hm);
			hm.clear();
		}
		

	}




}
