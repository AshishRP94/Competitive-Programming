package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class College_Life_5 {
	
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
	
//	First line contain 2 space separated integers N and M, number of important events in football and cricket match respectively.
//	Second line contain N space separated integers Fi, where the ith index represents ith important event in the football match.
//	Third line contain M space separated integers Ci, where the ith index represents ith important event in the cricket match.
	

	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int f=scan.nextInt();
			int c=scan.nextInt();
			long []fs=new long[f];
			for(int j=0;j<fs.length;j++)
			{
				fs[j]=scan.nextLong();
			}
			long []cs=new long[c];
			for(int j=0;j<cs.length;j++)
			{
				cs[j]=scan.nextLong();
			}
			
			int count=0;
			boolean flag=false;
			if(f>=c)
			{
				flag=true;
			}
			else
			{
				flag=false;
				
			}
			int j=0;
			int k=0;
			long time=0;
			boolean tv=false;
			while(true)
			{
				
//				System.out.println("j="+j);
//				System.out.println("k="+k);
				if(j>=fs.length)
				{
					break;
				}
				else if(k>=cs.length)
				{
					break;
				}
				
				
				if(time==fs[j])
				{
					if(tv==false)
					{
//					watching football
					}
					else
					{
//						switch to football
						count+=1;
						tv=false;
					}
					j+=1;
					
				}
			
				
				if(time==cs[k])
				{
					if(tv==false)
					{
						count+=1;
						tv=true;
					}
					else
					{
						
					}
					k+=1;
					
				}
				
				if(j>=fs.length)
				{
					break;
				}
				else if(k>=cs.length)
				{
					break;
				}
				
				time=Math.min(fs[j], cs[k]);
				
			}
			
			if(j<=fs.length-1)
			{
				if(tv==true)
				{
					count+=1;
				}
				
			}
			
			if(k<=cs.length-1)
			{
				if(tv==false)
				{
					count+=1;
				}
			}
			
			System.out.println(""+count);
		
		}
		
		
//		3 1
//		100 200 300
//		1
//		1 2
//		1
//		100 200
	}

}
