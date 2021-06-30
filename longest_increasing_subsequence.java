package competitive_programming;

import java.util.Scanner;

public class longest_increasing_subsequence
{
	
	private static int lis(int[] arr)
	{
		int []lis=new int[arr.length];
		lis[0]=1;
		int max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && (lis[j]+1)>lis[i])
				{
					lis[i]=lis[j]+1;
					if(max<lis[i])
					{
						max=lis[i];
					}
				}
			}	
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}

			int len =lis(arr);
			System.out.println(""+(len+1));
		}


	}



}
