package competitive_programming;

import java.util.Scanner;

public class Koko_Eating_Bananas {

//	Input: piles = [3,6,7,11], H = 8
	
	private static void helpkoko(int[] piles, int h)
	{
		int low=1;
		System.out.println("hi");
		int high=Integer.MIN_VALUE;
		int mid=0;
		for(int i=0;i<piles.length;i++)
		{
			if(piles[i]>high)
			{
				high=piles[i];
			}
		}
		
//		int []bs=new int[high+1];
//		for(int i=low;i<=high;i++)
//		{
//			bs[i]=i;
//		}
		int ans=Integer.MAX_VALUE;
		while(low<=high)
		{
			System.out.println("low="+low+"|high="+high);
			
			boolean flag=false;
			mid=((high+low)/2);
			System.out.println("mid="+mid);
			int hrs=0;
			for(int i=0;i<piles.length;i++)
			{
				int temp=piles[i]/mid;
				if((piles[i]%mid)==piles[i])
				{
					hrs+=1;
					
				}
				else
				{
					
					if((piles[i]%mid)==0)
					{
						hrs+=1;
					}
					else
					{
						hrs+=temp+1;
						
					}
				}
			}
			
			System.out.println("hrs="+hrs);
			
			if(hrs<=h)
			{
				System.out.println("in");
				if(mid<ans)
				{
					ans=mid;
					System.out.println("i");
					flag=true;
				}
			}
		
			System.out.println("high"+high);
			System.out.println("low"+low);
			if(flag==true)
			{
				high=mid-1;
			}
			else
			{
					
			low=mid+1;
			}
			System.out.println();
			
			
		}
		
		System.out.println(""+ans);
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
		int sizep=scan.nextInt();
		int []piles=new int[sizep];
		for(int j=0;j<piles.length;j++)
		{
			piles[j]=scan.nextInt();
		}
		int h=scan.nextInt();
		helpkoko(piles,h);
		}
		
//		Input: piles = [30,11,23,4,20], H = 6
//				Output: 23
		
		
		
//		piles = [30,11,23,4,20], H = 5
		
	}



}
