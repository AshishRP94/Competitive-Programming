package competitive_programming;

import java.util.Scanner;

class code
{
	public  long findcandies(int[] arr, int turns,long res) 
	{
	Long  chefscore=(long) res;
	int avl;
	

		for(int i=0;i<turns;i++)
		{
			int temp=Integer.MIN_VALUE;
//	    	System.out.println("i="+i);

				
			
			if(i<arr.length-1)
			{
			avl=(i%arr.length);
			for(int j=0;j<arr.length;j++)
			{
				
//			if(arr[j]<=arr[avl] && arr[j]%2==0)
			{
			    if(arr[j]>=temp)
				{
			    	temp=arr[j];
//			    	System.out.println("temp="+temp+"j="+j);
				}
			    
//		    	System.out.println("tempp="+temp+"j="+j);

			   
				
			}
			}
			
			
			if(temp==0)
			{
				for(int j=0;j<arr.length;j++)
				{
					
				if(arr[j]<=arr[avl] && arr[j]%2==1)
				{
					
				    if(arr[j]>=temp)
					{
				    	temp=arr[j];
//				    	System.out.println("temp="+temp+"j="+j);
					}
//			    	System.out.println("tempp="+temp+"j="+j);

				   
					
				}
				}
				
				
				
				return chefscore+temp;
			}
			chefscore=chefscore+temp;
//	    	System.out.println("chefscore="+chefscore);

			}
			
			else
			{
				avl=((i-1)%arr.length);
				for(int j=0;j<arr.length;j++)
				{
					
				if(arr[j]<=arr[avl] && arr[j]%2==1)
				{			    	

				    if(arr[j]>=temp)
					{
//				    	System.out.println("lasttemp="+temp+"j="+j);
				    	temp=arr[j];
					}
//			    	System.out.println("lasttemppp="+temp+"j="+j);

					
				}
				}
				chefscore=chefscore+temp;
//		    	System.out.println("chefscore="+chefscore);

		
				
				
			
			
			}
			
		}
			
			
			
		
		
 		
		
		
		
		
		
		
		
		
		
		
		return chefscore;
	
	
	}
}






public class Magicalcandystore 
{
	


	public static void main(String[] args) throws java.lang.Exception
	{
		int t=0;
		
		int queries,turns;
		long res=0;

		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		int temp=0;
		code mcs=new code();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr =new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
			}
			queries=scan.nextInt();
			Long result[] =new Long[queries];
			for(int k=0;k<queries;k++)
			{
				if(k%2==0)
				{
					

				temp=scan.nextInt();
				res=mcs.findcandies(arr,temp,res);
				
				}
				else
				{
					
					turns=scan.nextInt();
					temp=turns-temp;
					res=mcs.findcandies(arr,temp,res);
					
					
				}
				result[k]=(res%1000000007);
			}
			for(int ii=0;ii<result.length;ii++)
			{
				
				System.out.println((result[ii]%1000000007));
			}
			
			
		}
		
	
//		1
//		4
//		4 10 2 1
//		2
//		4
//		5	
		
		

	}

	
   }
