package competitive_programming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class D_Even_Odd_Game {

//	The first line contains an integer t (1≤t≤104) — the number of test cases. Then t test cases follow.
//	The first line of each test case contains an integer n (1≤n≤2⋅105) — the number of elements in the array a.
//	The next line contains n integers a1,a2,…,an (1≤ai≤109) — the array a used to play the game.
//	It is guaranteed that the sum of n over all test cases does not exceed 2⋅105.
	
	private static void alice_and_bob( PriorityQueue<Integer> even,  PriorityQueue<Integer> odd, boolean flag, int prev)
	{
		if(even.size()==1 && odd.size()==1)
		{
			if(even.peek()>odd.peek())
			{
				System.out.println("Alice");
			}
			else if(even.peek()<odd.peek())
			{
				System.out.println("Bob");
			}
			else
			{
				System.out.println("Tie");
			}
		return;
		}
		
		if(flag==false)
		{
			if((prev&1)==1)
			{
				System.out.println("Bob");
			}
			else
			{
				System.out.println("Alice");
			}
		
		}
		
		even.add(-1);
		even.add(-1);
		int chance=0;
		long bobsc=0;
		long alicesc=0;
		while(true)
		{
		
			
		if(even.size()==0 && odd.size()==0)
		{
		break;
		}
		
		
			
		
		
		if((chance&1)==0)
		{
			if(even.size()==1)
			{
				if(odd.peek()==-1)
				{
					break;
				}
				else
				{
					
				odd.poll();
				}
				
			}
			else
			{
			if(even.peek()>=odd.peek())
			{
			alicesc+=even.poll();
			}
			else
			{
				alicesc+=0;
				odd.poll();
			}
			}
		
		}
		else
		{
			if(odd.size()==1)
			{
				if(even.peek()==-1)
				{
					break;
				}
				else
				{
					even.poll();
				}
			}
			else
			{
				
			if(odd.peek()>=even.peek())
			{
				bobsc+=odd.poll();
			}
			else
			{
				bobsc+=0;
				even.poll();
			}
			}
			
		}
		
		chance+=1;
		}
		
		
		
		
		
		if(alicesc>bobsc)
		{
			System.out.println("Alice");
		}
		else if(bobsc>alicesc)
		{
			System.out.println("Bob");
			
		}
		else
		{
			System.out.println("Tie");
			
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
	        PriorityQueue<Integer> even = new PriorityQueue<Integer>(Collections.reverseOrder());
	        PriorityQueue<Integer> odd = new PriorityQueue<Integer>(Collections.reverseOrder());
	        boolean flag=false;
	        boolean once=false;
	        int prev=0;
			for(int j=0;j<n;j++)
			{
				int temp=scan.nextInt();
				if(once==false)
				{
					prev=temp;
					once=true;
				}
				if(prev!=temp)
				{
					flag=true;
				}
				if((temp&1)==1)
				{
					
					odd.add(temp);
				}
				else
				{
					even.add(temp);
				}
			}
			alice_and_bob(even,odd,flag,prev);
			
			
		}
		
		
	}



}
