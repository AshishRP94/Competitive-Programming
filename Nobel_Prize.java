package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Nobel_Prize
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
//	First line will contain T, number of testcases. Then the testcases follow.
//	Each testcase contains of two lines of input.
//	First line contains two space separated integers N, M, number of researchers excluding Chef and total number of fields respectively.
//	Second line contains N space separated integers A1,A2,…AN, research topic of the researchers.

	public static void main(String[] args)throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
//			System.out.println("i="+i);
			HashSet<Long>set=new HashSet<Long>();
			long n=scan.nextLong();
			long fields=scan.nextLong();
			for(int j=0;j<n;j++)
			{
				System.out.println("jj="+j);
				long temp=scan.nextLong();
				set.add(temp);
			}
			
			boolean flag=false;
			for(long j=1;j<=fields;j++)
			{
//				System.out.println("j="+j);
				if(set.contains(j)==true)
				{
//					System.out.println("if");
				}
				else
				{
//					System.out.println("else");
					flag=true;
				}
			}
			
			if(flag==true)
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
