package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class A_Array_and_Peaks
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
		 FastReader scan=new  FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 int n=scan.nextInt();
			 int k=scan.nextInt();
			 if(k==0)
			 {
				 System.out.println("-1");
				 continue;
			 }
			 int temp=n-k;
			 int arr[]=new int[(n+1)];
			 HashSet<Integer> set=new HashSet<Integer>();
			 for(int j=1;j<=temp;j++)
			 {
				 arr[j]=j;
			 }
//			 System.out.println("temp="+temp);
			 if((temp-1)>=k)
			 {			
				 int count=0;
				 for(int j=1;j<arr.length;j++)
				 {
					 if(arr[j]!=0)
					 {
						 
					 System.out.print(arr[j]+" ");
					 if(count<k)
					 {
						 temp+=1;
						 System.out.print(temp+" ");	
						 count+=1;
					 }
					 }
					 
				 }
				 
//				 if(temp<=n)
//				 {
//					 for(int j=temp;j<=n;j++)
//					 {
//						 System.out.print(temp+" ");						 
//					 }
//					 
//				 }
			 }
			 else
			 {
				 System.out.println("-1");
			 }
			 
			 System.out.println();
			 
			 
		 }

	}

}
