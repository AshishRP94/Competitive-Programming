package competitive_programming;

import java.util.Scanner;

public class Little_Chef_and_Sums {
	
	static class pair
	{
		long sum=0;
		int ind=0;
		pair(long sum,int ind)
		{
			this.sum=sum;
			this.ind=ind;
		}
		
		
		
	}
	
	private static long  prefix(int i, long[] prefix)
	{
//		System.out.println("prefix"+prefix[i]);
		return prefix[i];
	}
	
	
	private static long suffix(int i, long[] suffix)
	{
//		System.out.println("ind"+i);
//		System.out.println("suffix"+suffix[i]);
		return suffix[i];
	}
	
	
	

	private static void prefix_suffix(int[] arr, long[] prefix)
	{
		long []suffix=new long[arr.length];
		long sum=0;
		for(int i=suffix.length-1;i>=0;i--)
		{
			sum+=arr[i];
			suffix[i]=sum;
		}

		System.out.println();
		int n=arr.length;
		n=n-1;
		
		pair p =new pair(Integer.MAX_VALUE,0);
		long temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=(prefix(i,prefix)+suffix(i,suffix));
//			System.out.println("temp="+temp);
			if(temp<p.sum)
			{
				p.sum=temp;
				p.ind=i;
			}
		}
		
		System.out.println(""+(p.ind+1));
		
		
	}

	
//	2
//	3
//	1 2 3
//	4
//	2 1 3 1








	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			long []prefix=new long[arr.length];
			long sum=0;
			
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
				sum+=arr[j];
				prefix[j]=sum;
			}
			prefix_suffix(arr,prefix);
			
		}

	}

}
