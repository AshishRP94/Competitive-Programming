package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Bishu_and_Soldiers {

//	7
//	1 2 3 4 5 6 7
//	3
//	3
//	10
//	2
	
	private static void helpbishu(int[] spower, int[] bishupow) 
	{
		long []lhprefixsum=new long [spower.length];
		long []hlprefixsum=new long [spower.length];
		long sum=0;
		for(int i=0;i<spower.length;i++)
		{
			sum+=spower[i];
			lhprefixsum[i]=sum;
		}
		
		
		for(int i=0;i<bishupow.length;i++)
		{
			int low=0;
			int solki=0;
			int high=spower.length-1;
			int bishupower=bishupow[i];
			if(spower[0]>bishupower)
			{
				System.out.print("0"+" "+spower[0]);
				continue;
			}
			
			int mid=0;
			if(bishupower>=spower[(spower.length-1)])
			{
				System.out.print(spower.length+""+" "+lhprefixsum[(lhprefixsum.length-1)]);
				System.out.println();
			
			}
			else
			{
		     while(low<=high)
		     {
		    	 mid=((low+high)/2);
		    	 System.out.println("mid"+mid);
		    	 if(bishupower>=spower[mid])
		    	 {
		    		 
		    		 solki=mid+1;
		    			 low=mid+1;
		    		 
		    		 
		    	 }
		    	 else
		    	 {
		    		 high=mid-1;
		    	}
			
		
		     }
		     }
		System.out.println("soki"+solki);
		if(solki==0)
		{
			System.out.print(solki+""+" "+lhprefixsum[0]);
			
		}
		else
		{
			
			System.out.print(solki+""+" "+lhprefixsum[solki-1]);
		}
		System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int [] spower=new int[n];
	
	for(int i=0;i<spower.length;i++)
	{
		spower[i]=scan.nextInt();
	}
	int rounds=scan.nextInt();
	int []bishupow=new int[rounds];
	for(int j=0;j<bishupow.length;j++)
	{
		
		bishupow[j]=scan.nextInt();
	}
	Arrays.sort(spower);
	helpbishu(spower,bishupow);
	
		

	}



}
