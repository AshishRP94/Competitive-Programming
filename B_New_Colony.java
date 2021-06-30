package competitive_programming;

import java.util.Scanner;

public class B_New_Colony {

//	The first line contains a single integer t (1≤t≤100) — the number of test cases.
//	Each test case consists of two lines. The first line in each test case contains two integers n and k (1≤n≤100; 1≤k≤109) — the number of mountains and the number of boulders.
//	The second line contains n integers h1,h2,…,hn (1≤hi≤100) — the height of the mountains.
//	It is guaranteed that the sum of n over all test cases does not exceed 100.
	
	private static void track_bolders(int boulders, int[] mountains)
	{
	/*	if hi≥hi+1, the boulder will roll to the next mountain;
		if hi<hi+1, the boulder will stop rolling and increase the mountain height by 1 (hi=hi+1);
		if the boulder reaches the last mountain it will fall to the waste collection system and disappear.*/
		
		for(int b=0;b<boulders;b++)
		{
			boolean flag=false;
			for(int i=0;i<mountains.length-1;i++)
			{
				if(mountains[i]>=mountains[i+1])
				{
					if(i==mountains.length-1)
					{
						flag=true;
					}
					continue;	
				}
				
				if(mountains[i]<mountains[i+1])
				{
					mountains[i+1]+=1;
//					System.out.println(""+mountains[i+1]);
					if(b==boulders-1)
					{
						
					System.out.println(" "+(i+1));
					}
					break;
				}
				
			}
			
			
			if(b==boulders-1)
			{	
			if(flag==true)
			{
				
				System.out.println("-1");
			}
			}
			
		
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int boulders=scan.nextInt();
			int []mountains=new int[n];
			for(int j=0;j<mountains.length;j++)
			{
				mountains[j]=scan.nextInt();
				
			}
			track_bolders(boulders,mountains);
		}
		
		
	}



}
