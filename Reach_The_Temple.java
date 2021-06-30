package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

class Hill
{
	static  int[][] arr;
	public Hill(int hill, int k)
	{
		 arr=new int[hill+1][k+1];
		for(int i=0;i<hill+1;i++)
		{
			for(int j=0;j<k+1;j++)
			{
				arr[i][j]=-1;
				
			}
		}
		
		
	}
	 int findways(int hill, int a, int b, int c, int k, int sum,int count)
	{
		int ways=0;
		
		if(count>=k)
		{
			 if(sum==hill)
			 {
			
		
				 return ways=ways+1;
				 
	         }
			 return 0;

		}
		
			
		
	 int p1=0,p2=0,p3=0;
	 if(arr[sum+a][count+1]!=-1)
	 {
		 arr[sum+a][count+1]+=1;
	return arr[sum+a][count+1];	 
	 
	 }
	 
	 if(arr[sum+b][count+1]!=-1)
	 {
		 arr[sum+b][count+1]+=1;

	return arr[sum+b][count+1];	 
	 
	 }
	 
	 if(arr[sum+c][count+1]!=-1)
	 {
		 arr[sum+c][count+1]+=1;

		 
	return arr[sum+c][count+1];	 
	 
	 }
	 
	 
	 
	 p1=findways(hill,a,b,c,k,sum+a,count+1);
	 arr[sum+a][count+1]=p1;
	 
	 p2=findways(hill,a,b,c,k,sum+b,count+1);

	 arr[sum+b][count+1]=p2;

	 p3=findways(hill,a,b,c,k,sum+c,count+1);

	 arr[sum+c][count+1]=p3;

	 int tot=p1+p2+p3;
	 return tot;
	 

	}
}

public class Reach_The_Temple 
{


	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		int hill=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int k=scan.nextInt();
		int sum=0;
		int count = 0;
		Hill h=new Hill(hill,k);
		System.out.println((h.findways(hill,a,b,c,k,sum,count)+1)%1000000007);
	
	}

//	6
//	1 2 3
//	3

}
