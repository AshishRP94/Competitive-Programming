package competitive_programming;

import java.util.Scanner;

public class SIMPLE_MODIFICATION
{
	
	
//	First line will contain n,m,u,q, the dimensions of the grid,the number of modifications and the number of queries respectively.
//	Next n lines: Each line containing m integers representing elements of that row (each element between −1000 and 1000 inclusive).
//	Next u lines : k,r1,c1,r2,c2 , as described in the problem statement ith line representing ith modification.
//	Next q lines : r1,c1,r2,c2 , as described in the problem statement,ith line representing ith query.
	
	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int mod=scan.nextInt();
		int queries=scan.nextInt();
		long [][]arr=new long[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=scan.nextLong();
			}
		}
		
		int [][]scanline =new int[n+1][m+1];
		
		
		for(int i=0;i<mod;i++)
		{
			int incf=scan.nextInt();
			int r1=scan.nextInt();
			int c1=scan.nextInt();
			int r2=scan.nextInt();
			int c2=scan.nextInt();
//			scanline[r1][c1]+=incf;
//			scanline[r1][c2]-=incf;
//			scanline[r2][c2+1]+=(-incf);
			
			int c=0;
			for(int r=r1;r<=r2;r++)
			{
				for(c=c1;c<=c2;c++)
				{
					scanline[r][c]+=incf;
					break;
				}
				
				if((c+1)<scanline.length)
				{
					scanline[r][c2+1]-=incf;
				}
			}
			
			
		}
		
		
//		System.out.println();
//		System.out.println("scanline");
//		for(int i=0;i<n+1;i++)
//		{
//			for(int j=0;j<m+1;j++)
//			{
//				System.out.print(" "+scanline[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		
		
		long sum=0;
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
//				System.out.println("|="+scanline[i][j]+"|i="+i+"j="+j);
				sum+=scanline[i][j];
//				System.out.println("|="+sum);
				if(i<arr.length && j<arr.length)
				{
					
					arr[i][j]+=sum;
				}
//				System.out.println("|="+arr[i][j]);
//				System.out.println();
			}
		
		}
		
	
//		System.out.println();
//		System.out.println("updated array");
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(" "+arr[i][j]);
//			}
//			System.out.println();
//		}
	
	

		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
//				System.out.println("i="+i+"j="+j+"|"+arr[i][j]);
				if((j-1)>=0)
				{
//					System.out.println("i j-1="+arr[i][j-1]);
					arr[i][j]+=arr[i][j-1];
//					System.out.println("i j-1="+arr[i][j]);
				}
				if(i-1>=0)
				{
//					System.out.println("i-1 j="+arr[i-1][j]);
					arr[i][j]+=arr[i-1][j];
//					System.out.println("i-1 j="+arr[i][j]);
					
				}
				if((i-1>=0) &&(j-1)>=0)
				{
//					System.out.println("i-1 j-1="+arr[i-1][j-1]);
					arr[i][j]-=arr[i-1][j-1];
//					System.out.println("i-1 j-1="+arr[i][j]);
					
				}
//				System.out.println();
			}
		}
		
//		System.out.println();
//		System.out.println("prefix arry");
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(" "+arr[i][j]);
//			}
//			System.out.println();
//		
//		}
//		
	
		
		
		
		
		
		for(int i=0;i<queries;i++)
		{
			int r1=scan.nextInt();
		    int c1=scan.nextInt();
		    int r2=scan.nextInt();
		    int c2=scan.nextInt();
		    
		    long diff0=0;
		    long diff1=0;
		    long add=0;
		    if((r1-1)>=0)
		    {
		    	diff0=arr[r1-1][c2];
		    }
		    
		    
		    if((c1-1)>=0)
		    {
		    	diff1=arr[r2][c1-1];
		    }
		    
		    if((r1-1>=0) &&(c1-1>=0))
		    {
		    	add=arr[r1-1][c1-1];
		    }
		    System.out.println(arr[r2][c2]-diff0-diff1+add);
		}
		
		
//		3 3 2 2
//		1 2 3
//		1 1 0
//		4 -2 2
//		2 0 0 1 1
//		-1 1 0 2 2
//		0 0 0 1
//		1 1 2 2
	
//		3 3 2 2
//		1 2 3
//		1 1 0
//		4 -2 2
//		2 0 0 1 1
//		-1 1 0 2 2 
//		0 0 0 1
	
	
	}
	
	

}
