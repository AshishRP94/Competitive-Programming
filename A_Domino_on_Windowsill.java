package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Domino_on_Windowsill {
	
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
	/*
	 * The first line contains a single integer t (1≤t≤3000) — the number of test
	 * cases.
	 * 
	 * The first line of each test case contains three integers n, k1 and k2
	 * (1≤n≤1000; 0≤k1,k2≤n).
	 * 
	 * The second line of each test case contains two integers w and b (0≤w,b≤n).
	 */
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int wcells1=scan.nextInt();
			int wcells2=scan.nextInt();
			int white=scan.nextInt();
			int black=scan.nextInt();
			if(white==0 && black==0)
			{
				System.out.println("YES");
			}
			else
			{
				int cells=(n<<1);
				int bcells1=cells-wcells1;
				int bcells2=cells-wcells2;
				
				int rw1=(wcells1%2);
				int rw2=(wcells2%2);
				int w1=(wcells1/2);
				int w2=(wcells2/2);
				
				int rb1=(bcells1%2);
				int rb2=(bcells2%2);
				int b1=(bcells1/2);
				int b2=(bcells2/2);
				
				boolean flag=false;
				int tempw=rw1+rw2;
				if((tempw&1)==1)
				{
					tempw-=1;
				}
				
				if((w1+w2+tempw)>=white)
				{
					flag=true;
				}
				
				boolean flag1=false;
				int tempb=rb1+rb2;
				if((tempb&1)==1)
				{
					tempb-=1;
				}
				
				if((b1+b2+tempb)>=black)
				{
					flag1=true;
				}
				if(flag==true && flag1==true)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
					
				}
			
			}	
		
		

	}
	}}


