package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_M_arrays {
	
	
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
	
	static class pair
	{
		int count;
		int ind;
		public pair(int count ,int ind)
		{
			this.count=count;
			this.ind=ind;
		}
		
	}
	
	private static void m_divisible(int[] arr, int m, HashMap<Integer, pair> hm)
	{
		int []temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			int mod=arr[i]%m;
			int c=hm.get(arr[i]).count;
			int ind=hm.get(arr[i]).ind;
			hm.put(arr[i],new pair(c-1,ind));
			boolean flag=false;
			if(i!=0)
			{
				if(mod==0)
				{
					continue;
				}
				
				for(int k=0;k<j;k++)
				{
					if(mod==temp[k])
					{
						temp[k]=mod;
						System.out.println("inside set");
						flag=true;
					}
				}
			}
			
			if(flag==true)
			{
				continue;
			}
			
			if(mod==0)
			{
				temp[j]=arr[i];
				System.out.println("divisible set");
				j+=1;
			}
			else
			{
				if(hm.containsKey(mod)==true && hm.get(mod).count>=1)
				{
					int cc=hm.get(mod).count;
					int iind=hm.get(mod).ind;
					hm.put(mod,new pair(cc-1,iind));
					arr[hm.get(mod).ind]=-1;
					temp[j]=mod;
					System.out.println("hashmap set set");
					j+=1;
				}
				else
				{
					System.out.println("new set");
					temp[j]=arr[i];
					j+=1;
				}
			}
		}
		
		System.out.println((j-1));
	
		
		
		
		
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		HashMap<Integer, pair> hm= new HashMap<Integer, pair>(); 
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
				if(hm.containsKey(arr[j])==true)
				{
					int c=hm.get(arr[j]).count;
					hm.put(arr[j],new pair((c+1),j));
				}
				else
				{
					hm.put(arr[j],new pair(1,j));
				}
			}
			m_divisible(arr,m,hm);
		}

	}

//	4
//	6 4
//	2 2 8 6 9 4
//	10 8
//	1 1 1 5 2 4 4 8 6 7
//	1 1
//	666
//	2 2
//	2 4


}
