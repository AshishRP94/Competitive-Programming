package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class CodeChef_Div_3_Rated_Contest_2021_2
{
	
	static class Pair implements Comparable<Pair>
	{
		int value;
		int index;
		public Pair(int value,int index)
		{
			this.value=value;
			this.index=index;
			
		}
		
		 public int compareTo(Pair o) {
		        return value - o.value;
		    }
	}

	
	 static class FastReader {
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
		 * The first line of the input contains a single integer T denoting the number
		 * of test cases. The description of T test cases follows. The first line of
		 * each test case contains a single integer N. The second line contains N
		 * space-separated integers A1,A2,…,AN.
		 */
	 
	 
		private static void find_wait(PriorityQueue<Pair> pq, int n, int[] arr)
		{
			
			Pair p;
			long []hrs=new long[n];
			PriorityQueue<Pair> temp = new PriorityQueue<Pair>();
			long wait=1;
			long waitt = 0;
			boolean flag=false;
			for(int i=0;i<n-1;i++)
			{
				p=pq.poll();
//				System.out.println(" p="+p.value+"|"+p.index);
				
				if(p.value==pq.peek().value)
				{
					if(flag==false)
					{
						flag=true;
						waitt=wait;
					}
					temp.add(new Pair(p.index,p.value));
				}
				else
				{
					int len=temp.size();
//					System.out.println("len="+len);
					if(len==0)
					{
//						System.out.println("p.index="+(p.index-1));
//						System.out.println("wait="+wait);
						hrs[(p.index-1)]=wait;
						
					}
					else
					{
						temp.add(new Pair(p.index,p.value));
						len=temp.size();
//						System.out.println("waitt="+waitt);
						for(int j=0;j<len;j++)
						{
							Pair t=temp.poll();
//							System.out.println("t.index="+(t.value-1));
							hrs[(t.value-1)]=waitt;

//							System.out.println("waitt="+waitt);
//							System.out.println();
							waitt+=1;
							
						}
						flag=false;
						
					}
					
	
					
					
				}
				
				if(i==n-2)
				{
					
					temp.add(new Pair(pq.peek().index,pq.peek().value));
					int len1=temp.size();
					if(len1>0)
					{
						
						for(int j=0;j<len1;j++)
						{
							Pair t=temp.poll();
//							System.out.println("t.index="+(t.value-1));
							hrs[(t.value-1)]=waitt;

//							System.out.println("waitt="+waitt);
//							System.out.println();
							waitt+=1;
							
						}
					}
					
				}
				
				wait+=1;
//				System.out.println("wait="+wait);
//				System.out.println();
					
			}
			
		
			
			
			
			
			for(int j=0;j<hrs.length;j++)
			{
//				if((pq.peek().index-1)==j)
//				{
//					System.out.print(wait+" ");
//					
//				}
//				else
//				{
					System.out.print(hrs[j]+" ");
						
//				}
				
			}
			
			
			System.out.println();
		}
				
	public static void main(String[] args)
	{
//		Scanner scan=new Scanner(System.in);
        FastReader scan = new FastReader();
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
	        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
	        for(int i=0;i<n;i++)
	        {
	        	int value=scan.nextInt();
	        	pq.add(new Pair(value,i+1));
	        }
	        find_wait(pq,n,arr);
	        

			
		}
	


	}

	

}
