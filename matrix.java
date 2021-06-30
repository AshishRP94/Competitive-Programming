package competitive_programming;

import java.util.Scanner;

public class matrix 
{
	private static int findweight(int[][] mat, int n, int m,int r) 
	{
		int weight=0;
		int temp=0;
		int count=0;
		for(int t=0;t<(n-r+1)*(n-(2*r)+2);t++)
		{
		for(int i=0;i<m;i++)
		{
			int te=i;
			for(int j=0;j<n;j++)
			{
				System.out.println("i="+i+"j="+j);
				while(true)
				{
					System.out.println("wile");
					System.out.println("i="+i+1+"j="+j);

				for(int x=j-1;x<m;x++)
				{
					System.out.println("i="+i+1+"j="+j);

					if(i+1<n && x<m)
					{
						
					System.out.println(mat[i+1][x]);
					temp+=mat[i+1][x];
					count=count+1;
					if(i*3%count==0)
					{
						i=i+1;
						x=j-1;
						
					}
					}
					else
					{
						System.out.println("yo");
						break;
					}
					
				}
				i=te;
				
				
				if(temp>weight)
				{
					weight=temp;
					System.out.println("weight"+weight);
					
				}
				
				}
				
				
			
				
			
			}
		
		
		}
		}
		
		
		return weight;
	}


	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int [][]mat=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=scan.nextInt();			
				}
		}
		int weight=0;
		for(int r=2;r<=m;r++)
		{
			
			int temp=findweight(mat,n,m,r);
			if(weight<temp)
			{
				weight=temp;
				
			}
		}
		System.out.println(weight);
	
//		4
//		3
//		4 5 9 6 7
//		2 1 9 9 4
//		3 4 4 5 7
	
	}

	
}
