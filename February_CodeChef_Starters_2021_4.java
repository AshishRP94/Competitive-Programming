package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import competitive_programming.CodeChef_Div_3_Rated_Contest_2021_2.Pair;

public class February_CodeChef_Starters_2021_4
{
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
	 
//	 First line will contain T, number of testcases. Then the testcases follow.
//	 Each testcase contains M+3 lines of input.
//	 First line contains 2 space separated integers N, M, the total number of colleges, and total number of students respectively.
//	 Second line contain N distinct space separated integers Ri, rank of the ith college. Here 1 denotes a higher rank and N denotes a lower rank.

//	 Third line contains M distinct space separated integers Si, the rank of the ith student in the exam. Here 1 denotes a higher rank,
//	 i.e, maximum marks scored and M denotes a lower rank, i.e, minimum marks scored.

	 //	 Next M lines contain K+1 space separated integers 
//	 which the first integer K is the number of colleges ith student will apply to and the next K integers describe the same.
	
	 static class pair implements Comparable<pair>
	 {
		 int name=0;
		 int rank=0;
		 public pair(int name,int rank)
		 {
			 this.name=name;
			 this.rank=rank;
		 }
		 
		 public int compareTo(pair o) {
		        return rank - o.rank;
		    }
		 
		 
	 }
	 
	 
		private static void findchefclg(HashMap<Integer, Integer> ranks, PriorityQueue<pair> pq,ArrayList<Integer>[] sclg, int nclg)
		{
			boolean []clg=new boolean[(nclg+1)];
			
			for(int )
			for(int i=1;i<sclg.length;i++)
			{
				
				for(int j=0;j<sclg[i].size();j++)
				{
							
				}
			
			}
			
			
			
			
		}
		
	 
	 
	 public static void main(String[] args)
	{
		 FastReader scan = new FastReader();
		 int t=scan.nextInt();
		 for(int i=0;i<t;i++)
		 {
			 int nclg=scan.nextInt();
			 int nstu=scan.nextInt();
			 HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();
			 for(int j=1;j<(nclg+1);j++)
			 {
				int r=scan.nextInt();
				ranks.put(r, j);
			 }
			 
		        PriorityQueue<pair> pq = new PriorityQueue<pair>();

			 for(int j=1;j<(nstu+1);j++)
			 {
				int r=scan.nextInt();
				pq.add(new pair(j,r));
			 }
			 
			 
			 ArrayList<Integer>[]sclg=new ArrayList[(nclg+1)];
			
			 for(int s=1;s<sclg.length;s++)
			 {
				 sclg[s]=new ArrayList<Integer>();
				 int nsl=scan.nextInt();
				 for(int k=0;k<nsl;k++)
				 {
					 int u=scan.nextInt();
					 sclg[s].add(u);
				 }
				 
			}
			 findchefclg(ranks,pq,sclg,nclg);
			 
			 
			 
			 
		 }

	}




}
