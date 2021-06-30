package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Bench_Press
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
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();	
			int tw=scan.nextInt();	
			int iw=scan.nextInt();
			int []w=new int[n];
			
			int temp=Math.abs(tw-iw);
			temp=temp>>1;

		int count=0;
		HashSet<Integer>[]set=new HashSet[n];
//		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		    for(int j=0;j<n;j++)
		    {
		 	    w[j]=scan.nextInt();
//		 	    if(hm.containsKey(w[j])==true)
//		 	    {
//		 	    	hm.put(w[j], hm.get(w[j])+1);
//		 	    }
//		 	    else
//		 	    {
//		 	    	hm.put(w[j],1);
//		 	    }
		 	    
		    }
			if(iw>=tw)
			{
				System.out.println("Yes");
				continue;
			}
			else
			{	
				Arrays.sort(w);
				int sum=0;
				
				for(int k=0;k<set.length;k++)
				{
					set[k]=new HashSet<Integer>();
				}
				
				for(int j=0;j<w.length;j++)
				{
					sum+=w[j];
					set[count].add(w[j]);
					if(sum==temp)
					{
						count+=1;
						sum=0;
					}
					
					if(sum>temp)
					{
						sum=0;
						set[count].clear();
					}
				}
			}

//			System.out.println(""+count);
//			System.out.println(""+temp);
			
			HashSet<Integer>set1=new HashSet<Integer>();
			int count1=0;
			boolean flag=false;
			for(int k=0;k<count;k++)
			{
				
			for(int j=0;j<w.length;j++)
			{
				if(set[k].contains(w[j])==true)
				{
					count1+=1;
				}
				if(count1==set[k].size()+set[k].size())
				{
					System.out.println("YES");
					flag=true;
					break;
					
				}
				
			}
			if(flag==true)
			{
				break;
			}

			count1=0;
			}
			if(flag==false)
			{
				System.out.println("NO");
				
			}
		}  

	}

}
