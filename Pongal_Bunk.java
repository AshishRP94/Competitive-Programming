package competitive_programming;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pongal_Bunk
{   static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
     public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
      public static FastReader s = new FastReader();
	public static void main (String[] args) throws java.lang.Exception
	{
        //int tc =s.nextInt();
        //for (int i = 0; i < tc; i++) {
            solve();
        //}
        out.close();
        
       
	}
	private static void solve(){
	    int arr[]=new int[10000001];
        int b[]=new int[10000001];
        int n=s.nextInt();
        int q=s.nextInt();
        while(q--!=0){
            int L=s.nextInt();
            int R=s.nextInt();
            arr[L]+=1;
            arr[R+1]-=1;
            b[R+1]-=(R-L+1);
        }
        
        for(int i=1;i<=n;i++)
        {
        	System.out.print(" "+arr[i]);
        }
        
        System.out.println();
        for(int i=1;i<=n;i++)
        {
        	System.out.print(" "+b[i]);
        }
        
        for(int i=1;i<=n;i++)
        {
            arr[i]+=arr[i-1];
        }
        
        System.out.println();
        for(int i=1;i<=n;i++)
        {
        	System.out.print(" "+arr[i]);
        }
        
        
        System.out.println();
        
        for(int i=1;i<=n;i++)
        {
            b[i]+=b[i-1]+arr[i];
        }
        
        System.out.println();
        for(int i=1;i<=n;i++)
        {
        	System.out.print(" "+b[i]);
        }
      
        int m=s.nextInt();
        while(m--!=0){
            int i=s.nextInt();
           // out.printf("%d\n",b[i]);
           out.println(b[i]);
        }
	}
}

//5
//3 
//1 3 
//2 4 
//1 5 
//3 
//1 
//3
//5

