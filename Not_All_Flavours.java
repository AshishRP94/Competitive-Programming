package competitive_programming;

import java.util.Scanner;

//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains two integers N and K.
//The second line contains N space-separated integers A1,A2,…,AN.


public class Not_All_Flavours 
{
	
	static int max=Integer.MIN_VALUE;
    static int count=0;
    static int len=0;
    private static int maxsubsegment(int cakes, int flavors, int[] orderf, boolean[] bool) 
	{
    	max=Integer.MIN_VALUE;
    	count=0;
    	len=0;
    	
		for(int i=0;i<cakes;i++)
		{
			if(bool[orderf[i]]==false)
			{
				count+=1;
//				System.out.println("count"+count);
				bool[orderf[i]]=true;
				
			}
			
			
			
			if(count==flavors)
			{
//				System.out.println("count if"+count);
				
				if(len>max)
				{
					max=len;
//					System.out.println("max if"+max);
					len=0;
					count=0;
				}
				for(int f=0;f<bool.length;f++)
				{
					
					bool[f]=false;
					
				}
			}
			
			len+=1;
//			System.out.println("len"+len);
		
		
		}
		if(len>max)
		{
			
			max=len;
		
		}
		
		return max;
	}


	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int cakes=scan.nextInt();
			int flavors=scan.nextInt();
			int []orderf=new int[cakes];
			for(int j=0;j<orderf.length;j++)
			{
				orderf[j]=scan.nextInt();
			}
			 boolean[] bool=new boolean[cakes+1];
			 for(int f=0;f<bool.length;f++)
			 {
				 bool[f]=false;
			 }
			 
			System.out.println(maxsubsegment(cakes,flavors,orderf,bool));
//			System.out.println("ans");
	
			
		}

	
	
	
	}





}
