package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.*;

public class A_Do_Not_Be_Distracted
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
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String s=scan.nextLine();
			HashMap<Character,ArrayList<Integer>>hm=new HashMap<Character,ArrayList<Integer>>();
			boolean flag=false;
			char c = 0,p = 0;
			for(int j=0;j<s.length();j++)
			{
				if(hm.containsKey(s.charAt(j))==true)
				{
					ArrayList<Integer>arr=hm.get(s.charAt(j));
					arr.add(j);
					hm.put(s.charAt(j),arr);
				}
				else
				{
					ArrayList<Integer>arr=new ArrayList<Integer>();
					arr.add(j);
					hm.put(s.charAt(j),arr);					
				}
			}
			
			
			for(Character cc:hm.keySet())
			{
				for(int j=0;j<hm.get(cc).size()-1;j++)
				{
					int m=hm.get(cc).get(j);
					int o=hm.get(cc).get(j+1);
					if((m+1)!=o)
					{
						System.out.println("NO");
						flag=true;
						break;
					}
					
				}
				if(flag==true)
				{
					break;
				}
				
			}
			
			if(flag==false)
			{
				
				System.out.println("YES");
			}
			
		}
		

	}

}
