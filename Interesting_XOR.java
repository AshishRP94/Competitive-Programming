package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Interesting_XOR
{

	static class FastReader {
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
	
	
	
	
	private static void find_max_product(long c)
	{
		String bsc=Long.toBinaryString(c);
//		System.out.println("bsc="+bsc);
		long d=(bsc.length()+1);
		long tword=(1<<d);
		String a="";
		String b="";
		Stack<Integer>st=new Stack<Integer>();
		
		for(int i=0;i<bsc.length();i++)
		{
			if(bsc.charAt(i)=='1')
			{
				
				if(i!=0)
				{
					
				a+="1";
				b+="0";
				
				}
				else
				{
					a+="0";
					b+="1";
				}
				
			}
			else
			{
				b+="1";
				a+="1";
				st.add(i);
			}
		}
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		long A=Long.parseLong(a,2);
		long B=Long.parseLong(b,2);
		System.out.println(""+(A*B));
		
		
		
	
		
		
		
		
	}
	
	
	




	public static void main(String[] args) throws java.lang.Exception
	{
        FastReader scan = new FastReader();
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
        	long c=scan.nextLong();
        	find_max_product(c);
        }

	}




}
