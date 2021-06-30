package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Possible_Victory {
	
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
	
	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		long runs=scan.nextLong();
		long overs=scan.nextLong();
		long temp=scan.nextLong();
		if(temp>runs)
		{
			System.out.println("Yes");
		}
		else
		{
			long removers=20-overs;
//			System.out.println("rem="+removers);
			long p=(removers*6*6);
//			System.out.println("p="+p);
			p+=temp;
//			System.out.println("p="+p);
			if(p>runs)
			{
				System.out.println("Yes");
				
			}
			else
			{
				System.out.println("No");
				
			}
		}
		
		
		

	}

}
