package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Jumping_Frog
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
//	The first line contains a single integer t(1≤t≤104) — the number of test cases.
//	First line of each test case contain a integers n (1≤n≤5×105).
//	Second line of each test case contains n integers a1,a2,…,an (0≤ai≤n). It is guaranteed that only one ai whose value is 0.
//	It is guaranteed that the sum of n over all test cases does not exceed 5×105.
	
	static boolean flag=false;
	static int temp=0,temp1=0;
	private static int dfs(int[] cells, int i, int moves)
	{
		if(i>cells.length-1 ||i<0)
		{
			return 0;
		}
		
		if(cells[i]==0)
		{
			flag=true;
			return moves;
		}
		
		
		if(flag==false)
		{
			temp=dfs(cells, i+cells[i], moves+1);
			temp1=dfs(cells, i-cells[i], moves+1);
			return 0;
		}
		else
		{
			if(temp!=0)
			{
				return temp;
			}
			
			else
			{
				return temp1;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=scan.nextInt();
			int []cells=new int[n+1];
			for(int i=1;i<cells.length;i++)
			{
				cells[i]=scan.nextInt();
			}
			System.out.println(dfs(cells,0,0));
		}
		

	}


}
