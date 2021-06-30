package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Almost_Rectangle
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
	
	private static void solve(char[][] arr, int x1, int y1, int x2, int y2)
	{
//		System.out.println("x1"+x1);
//		System.out.println("y1"+y1);
//		System.out.println("x2"+x2);
//		System.out.println("y2"+y2);
		if(x1!=x2 && y1 !=y2)
		{
			if((x1==y2 &&y1!=x2))
			{
				arr[x1][y2]='*';
				arr[x2][y1]='*';
			}			
		    else if(((x1==y1) && (x2==y2)))
			{
				arr[y1][x2]='*';
				arr[y2][x1]='*';

			}
			else
			{
			arr[y1][x2]='*';
			arr[x1][y2]='*';
			}
		}
		else if(x1 !=x2 && y1==y2)
		{
			if((y1-1)>=0 && (y2-1>=0))
			{
				
			arr[(x1)][(y1-1)]='*';
		    arr[(x2)][(y2-1)]='*';
			}
			else
			{
				if((y1+1)<arr.length && (y2+1)<arr.length)
				{
					
					arr[(x1)][(y1+1)]='*';
				    arr[(x2)][(y2+1)]='*';
				}				
			}
		
		}
		else
		{
			if((x1+1)<arr.length && (x2+1)<arr.length)
			{
//				System.out.println("toooooo");
				arr[(x1+1)][y1]='*';
				arr[(x2+1)][y2]='*';
			}
			else 
			{
				if((x1-1)>=0 && (x2-1)>=0)
				{
					arr[(x1-1)][y1]='*';
					arr[(x2-1)][y2]='*';
				}
			}
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(""+arr[i][j]);
			}
			System.out.println();
		}
			
		
	}
	




	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
//		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int x1=0 ,y1 = 0;
			int x2 =0,y2 = 0;
			char [][]arr=new char[n][n];
			String []s=new String[n];
			boolean flag1=false;
			boolean flag2=false;
			for(int j=0;j<arr.length;j++)
			{
				s[j]=scan.nextLine();
			}
			
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[0].length;k++)
				{
					arr[j][k]=s[j].charAt(k);
					if(flag1==false)
					{
						if(arr[j][k]=='*')
						{
							flag1=true;
							x1=j;
							y1=k;
							continue;
						}
					}
					
					if(flag2==false)
					{
						if(arr[j][k]=='*')
						{
							flag2=true;
							x2=j;
							y2=k;
							break;
						}
					}
				}
			
				
			}
			
			solve(arr,x1,y1,x2,y2);
		}
//		1
//		4
//		∗...
//		....
//		∗...
//		....


	}



}
