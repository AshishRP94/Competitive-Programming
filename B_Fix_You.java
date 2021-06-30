package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.graalvm.compiler.lir.alloc.lsra.ssa.SSALinearScan;

public class B_Fix_You
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
	
	

	private static void fix_it(char[][] belt)
	{
		
		
	}
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			char [][]belt=new char[n][m];
			for(int j=0;j<belt.length;j++)
			{
				String temp=scan.nextLine();
				for(int k=0;k<belt[0].length;k++)
				{
					belt[j][k]=temp.charAt(k);
				}
			}
			fix_it(belt);
			
		}
		
		
	}


}
