package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A_Sum_of_2050
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
		HashMap<Integer,Long>hm=new HashMap<Integer,Long>();
		int ten=10;
		long temp=2050;
		for(int i=1;i<19;i++)
		{
			hm.put((i+3),temp);
//			System.out.println(""+temp+" "+(i+3));
			temp=temp*ten;
		}
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			long n=Long.parseLong(s);
			long count=0;
			boolean bool=false;
			if(n<2050)
			{
				System.out.println("-1");				
				continue;
			}
			while(true)
			{
				if(n==0)
				{
					System.out.println(""+count);
					bool=true;
					break;
				}
				
				if(n<0 ||n<2050)
				{
					break;
				}
				
				long ans=hm.get(s.length());
//				System.out.println("ans="+ans);
//				System.out.println("n="+n);
				int len=s.length();
				if(ans<n ||((n-ans)<0))
				{
//					System.out.println("in="+n);
					while(true)
					{
						if(ans<n)
						{
							break;
						}
						len-=1;
						ans=hm.get(len);
					}
				}
				n=(n-ans);
				s=Long.toString(n);
//				System.out.println("n="+n);
//				System.out.println("s="+s);
				count+=1;
//				System.out.println("count="+count);
			}
			if(bool==false)
			{
				System.out.println("-1");				
			}
		}
	}
	
}

