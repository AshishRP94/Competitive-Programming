package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Alexey_and_Train {

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
	 * The first line contains one integer t (1≤t≤100) — the number of test cases.
	 * 
	 * The first line of each test case contains the single integer n (1≤n≤100) —
	 * the number of stations.
	 * 
	 * Next n lines contain two integers each: ai and bi (1≤ai<bi≤106). It's
	 * guaranteed that bi<ai+1.
	 * 
	 * Next line contains n integers tm1,tm2,…,tmn (0≤tmi≤106).
	 */
	static class pair
	{
		int arr=0;
		int dept=0;
		pair(int arr,int dept)
		{
			this.arr=arr;
			this.dept=dept;
		}
		
	}
	
	
	private static void find_last_Station_time(int[] delays, pair[] tt)
	{
		int wait=0;
		for(int i=1;i<tt.length-1;i++)
		{
			pair p=tt[i];
			int add=0;
			int darr=p.arr+delays[i];
			System.out.println("delay+arr="+darr);
			int z=(Math.abs(p.dept-p.arr));
//			System.out.println("z="+z);
			if((z%2)==0)
			{
				wait=z/2;
//				System.out.println("in wait="+wait);
			}
			else
			{
				z/=2;
				z+=1;
				wait=z;
			}
			System.out.println("wait="+wait);
			System.out.println("darr="+darr+"p.dept="+p.dept);
			
			if(darr>=p.dept)
			{

				System.out.println("if");
				tt[i].dept=darr+wait;
				System.out.println("tt[i].dept="+(tt[i].dept));
				add=Math.abs(tt[i+1].arr-p.dept);
				System.out.println("diff="+add);
				tt[i+1].arr=add+tt[i].dept;
				System.out.println("tt[i+1].arr="+tt[(i+1)].arr);
				
			}
			else
			{
				int ew=p.dept-darr;
				System.out.println("ew="+ew);
				if(ew<=p.dept)
				{
					System.out.println("if");
					continue;
				}
				else
				{
				tt[i].dept+=ew;
				System.out.println("tt[i].dept="+(tt[i].dept));				
				add=tt[i+1].arr-p.dept;
				System.out.println("diff="+add);
				tt[i+1].arr=add+tt[i].dept;
				System.out.println("tt[i+1].arr="+tt[(i+1)].arr);
				}
			}
			System.out.println();
			
		}
//		2
//		2
//		2 4
//		10 12
//		0 2
//		5
//		1 4
//		7 8
//		9 10
//		13 15
//		19 20
//		1 2 3 4 5
		
		System.out.println(""+tt[(tt.length-1)].arr);
		
	}
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			pair []tt=new pair[(n+1)];
			for(int j=1;j<tt.length;j++)
			{
				int a=scan.nextInt();
				int d=scan.nextInt();
				tt[j]=new pair(a,d);
			}
			int []delays=new int[(n+1)];
			for(int j=1;j<delays.length;j++)
			{
				delays[j]=scan.nextInt();
			}
			find_last_Station_time(delays,tt);
			
			
		}
		

	}


}
