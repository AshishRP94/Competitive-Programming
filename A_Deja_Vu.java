package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Deja_Vu {
	
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
	
	private static void solve(String s)
	{
		boolean flag=false;
		int i=0;
		int j=(s.length()-1);
		while(true)
		{
			if(i>j)
			{
				break;
			}
			if(s.charAt(i)==s.charAt(j))
			{
				
			}
			else
			{
				String temp1=s.substring(0,(i+1));
				String temp2=s.substring((i+1));
				String a="a";
				System.out.println("YES");
				System.out.println(""+(temp1+a+temp2));
				flag=true;
				return;
			}
			i+=1;
			j-=1;
			
		}
		boolean ans=false;
		 i=0;
		 j=(s.length()-1);
		if(flag==false)
		{
			while(true)
			{
				if(i>j)
				{
					break;
				}
				if(s.charAt(i)==s.charAt(j))
				{
					if(s.charAt(i)!='a')
					{
						String temp1=s.substring(0,(i+1));
						String temp2=s.substring((i+1));
						String a="a";
						System.out.println("YES");
						System.out.println(""+(temp1+a+temp2));
						ans=true;
						return;
					}
					
				}
				i+=1;
				j-=1;
				
			}
			
			
		}
		if(ans==false)
		{
			System.out.println("NO");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			String a="a";
		    solve(s);	
		}
		

	}



}
