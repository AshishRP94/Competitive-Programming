package competitive_programming;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class counts {
	static	int []tempc;
	public static void queryTime(int arr[], int max)
	{
		tempc=new int[max+1];
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int []temp=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i])==true)
			{
				hm.put(arr[i], hm.get((arr[i])+1));
				
			}
			else
			{
				
				hm.put(arr[i], 0);
				
			}
			
			
			
			
		}

		System.out.println();

		int x=0;
		for(int i=0;i<tempc.length;i++)
		{
			x+=temp[i];
			tempc[i]=x;
		}

		




	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
				for(int j=0;j<q;j++)
		{
			int arr[]=new int[n];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			queryTime(arr,max);


			for(int i=0;i<q;i++)
			{

			
			int l=sc.nextInt();
			int r=sc.nextInt();
		
			if(l-1==0)
			{
				System.out.println(tempc[r]-tempc[0]);
			}
			else
			{

			System.out.println(tempc[r]-(tempc[l-1]));
			}
			}
	  }              // Your code here
	}
}