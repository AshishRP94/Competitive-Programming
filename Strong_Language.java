package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Strong_Language {
	
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
	
	private static void stronglang(String s, int k)
	{
		int count=0;
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				if(count>=k)
				{
					flag=true;
				}
				
				count+=1;
			}
			else
			{
				if(count>=k)
				{
					flag=true;
				}
				count=0;
			}
			
		}
		
		
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");			
		}
		
		
	}

	
	

	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			String s=scan.nextLine();
			stronglang(s,k);
		}


	}


}
