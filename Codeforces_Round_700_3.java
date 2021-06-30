package competitive_programming;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeforces_Round_700_3
{
//	Homer likes arrays a lot. Today he is painting an array a1,a2,…,an with two kinds of colors, white and black. A painting assignment for a1,a2,…,an 
//	is described by an array b1,b2,…,bn that bi indicates the color of ai (0 for white and 1 for black).
//	
//	According to a painting assignment b1,b2,…,bn, the array a is split into two new arrays a(0) and a(1),
//	where a(0) is the sub-sequence of all white elements in a and a(1) is the sub-sequence of all black elements in a. For example, if a=[1,2,3,4,5,6] and b=[0,1,0,1,0,0], then a(0)=[1,3,5,6] and a(1)=[2,4].
//	
//	The number of segments in an array c1,c2,…,ck, denoted seg(c), is the number of elements if we merge all adjacent elements with the same value in c. 
//	For example, the number of segments in [1,1,2,2,3,3,3,2] is 4, because the array will become [1,2,3,2] after merging adjacent elements with the same value. Especially,
//	the number of segments in an empty array is 0.
//	
//	Homer wants to find a painting assignment b, 
//	according to which the number of segments in both a(0) and a(1), i.e. seg(a(0))+seg(a(1)), is as large as possible. Find this number.
	
	private static void find_max(PriorityQueue<Integer> pq)
	{
		HashMap<Integer, Integer> hma = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hmb = new HashMap<Integer, Integer>();
        int l=pq.size();
        for(int i=0;i<l;i++)
        {
        	int temp=pq.poll();
//        	System.out.println("temp="+temp);
        	if(hma.containsKey(temp)==true)
        	{
        		if(hmb.containsKey(temp)==true)
        		{
        			
        			
        		}
        		else
        		{
        			hmb.put(temp, 1);
        		}
        		
        	}
        	else
        	{
        		hma.put(temp, 1);
        	}
        	
        	
        }
		
		System.out.println(""+(hma.size()+hmb.size()));
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
			int n=scan.nextInt();
			boolean distinct=false;
//			int []arr=new int[n];
			boolean flag=false;
			int help=0;
			PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
			for(int j=0;j<n;j++)
			{
				int temp=scan.nextInt();
				pq.add(temp);
				if(flag==false)
				{
					help=temp;
					flag=true;
				}
				if(temp!=help)
				{
					distinct=true;
				}
				
			}
			if(distinct==false)
			{
				System.out.println(""+n);
			}
			else
			{
				
				find_max(pq);
			}
		}

	



}
