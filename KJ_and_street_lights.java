package competitive_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KJ_and_street_lights 
{
	
	
//	The first line contains two space seperated integers n and p, the number of street lights and the position of PS's house on x - axis.
//	The next n lines contain two space seperated integers, xi and ri, the position of the ith street light and the characteristic of the ith street light.
	
	static class pair
	{
		int x,y;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	private static void helpkj(int streetl, int pj, ArrayList<pair> streetlight)
	{
		int [] prefixarr=new int[pj+1];
		for(int i=0;i<prefixarr.length;i++)
		{
			prefixarr[i]=0;
		}
		
		int t=0;
		int m=0;
		if(streetl==0)
		{
			System.out.println(""+(pj+1));
			return;
			
		}
		
		for(int i=0;i<streetlight.size();i++)
		{
			int x=streetlight.get(i).x;
			int y=streetlight.get(i).y;
			int minr=x-y;
			int maxr=x+y;
	
			if(minr>0)
			{
				t=minr;
			}
			else
			{
				t=0;
			}
			
			if(maxr>pj)
			{
				m=(pj);	
			}
			else
			{
				m=maxr;
			}
			
//			System.out.println("m"+m);
			prefixarr[t]=prefixarr[t]+1;
			if((m+1)<prefixarr.length)
			{
				prefixarr[m+1]=-(prefixarr[m+1]+1);
				
			}
		}
		
		


		int sum=0;
		

		for(int i=1;i<prefixarr.length;i++)
		{
			sum+=prefixarr[i];
			prefixarr[i]=sum;
		}


		int max=Integer.MIN_VALUE;
		int count=0;
		boolean bool=false;
		for(int i=0;i<prefixarr.length;i++)
		{
		
			if(prefixarr[i]!=1)
			{
				
				count+=1;
//				System.out.println("count"+count);
			}
			else
			{
				bool=true;
//				System.out.println("in");
				if(count>max)
				{
					max=count;
					count=0;
//					System.out.println("bool"+bool);
				}
				
			}
		}
		
//		System.out.println("bool"+bool);
		if(bool==false)
		{
			System.out.println(""+(pj+1));
			
		}
		else
		{
			System.out.println(""+max);
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		Scanner scan=new Scanner(System.in);
		int streetl=scan.nextInt();
		int pj=scan.nextInt();
		ArrayList<pair>streetlight=new ArrayList<pair>(); 
		for(int i=0;i<streetl;i++)
		{
			int x=scan.nextInt();
			int y=scan.nextInt();
			streetlight.add(new pair(x,y));
		}
		helpkj(streetl,pj,streetlight);
		
	}



}
