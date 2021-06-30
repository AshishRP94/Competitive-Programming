package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B_TMT_Document
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
	
	static String s;
	private static void solve()
	{
	    int tmp1 = 0, tmp2 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='T'){
                tmp1 += 1;
            }
            else{
                tmp1 -=1 ;
            }
            if(tmp1 < 0){
                break;
            }
        }
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='T'){
                tmp2 += 1;
            }
            else{
                tmp2 -=1 ;
            }
            if(tmp2 < 0){
                break;
            }
        }
        int n=s.length();
        if(tmp1 == n/3 && tmp2 == n/3)
        {
            System.out.println("YES");
        }
        else
        {
//            cout<<"NO"<<endl;
            System.out.println("NO");
        }    
    }
		
		
	
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			s=scan.nextLine();
			if(s.charAt(0)!='T'|| s.charAt(s.length()-1)=='M')
			{
				System.out.println("NO");
			}
			else
			{
				solve();
				
			}
		}
		

	}


}
