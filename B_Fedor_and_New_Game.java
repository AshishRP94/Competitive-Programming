package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Fedor_and_New_Game
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
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();
		String s1=Long.toBinaryString(1);
//		System.out.println(""+s1.length());
		
		long []arr=new long[(m+1)];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextLong();
		}
		
	    long fedor=arr[arr.length-1];
	    int count=0;
	    String bs=Long.toBinaryString(fedor);
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	String s=Long.toBinaryString(arr[i]);
	    	int min=Math.min(bs.length()-1, s.length()-1);
	    	int diff=Math.abs(bs.length()-s.length());
	    	for(int j=min;j>=0;j--)
	    	{
	    		if(bs.charAt(j)!=s.charAt(j))
	    		{
	    			diff+=1;		
	    		}
	    		
	    		if(diff>=k)
	    		{
	    			break;
	    		}
	    		
	    		if(j==0)
	    		{
	    			count+=1;
	    		}
	    	}
	    }
	    
	    System.out.println(""+count);
	}

}
