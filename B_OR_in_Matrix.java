package competitive_programming;
import java.util.Scanner;

public class B_OR_in_Matrix {

//	The first line contains two integer m and n (1 ≤ m, n ≤ 100), number of rows and number of columns of matrices respectively.
//	The next m lines each contain n integers separated by spaces describing rows of matrix B (each element of B is either 0 or 1).
	
	private static void findA(int rows, int columns, int[][] matrixb)
	{
		int [][]matrixa=new int[rows][columns];
		boolean [][]bool=new boolean[rows][columns];
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<columns;j++)
			{
				if(matrixb[i][0]==1)
				{
					boolean flag=false;
					boolean checkrows=false;
					int count=0;
					for(int k=j;k<rows;k++)
					{
						if(matrixb[i][k]==1)
						{
							if(j==0)
							{
								if(matrixb[i+1][k]==1)
								{
									matrixa[i][k]=1;
									flag =true;
								}
								count+=1;
								if(count==rows)
								{
									checkrows=true;
								}
								
								
							}
							
							else if(j==rows)
							{
								if(matrixb[i-1][k]==1)
								{
									matrixa[i][k]=1;
									flag =true;
								}
								count+=1;
								if(count==rows)
								{
									checkrows=true;
								}
								
								
							}
							else
							{
								if(matrixb[i-1][k]==1 && matrixb[i+1][k]==1)
								{
									matrixa[i][k]=1;
									flag =true;
								}
								count+=1;
								if(count==rows)
								{
									checkrows=true;
								}
								
							}
							
						}
					
						
						
						
						
					}
					if(flag==false ||checkrows==false)
					{
						System.out.println("NO");
						return;
					}
					
				}
			}
		}
		
		
		System.out.println("YES");
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+matrixa[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int columns=scan.nextInt();
	    int[][] matrixb = new int[rows][columns];
	    int maxcount=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrixb[i][j]=scan.nextInt();
				if(matrixb[i][j]==1)
				{
					maxcount+=1;
				}
			}
		}
		if(maxcount==rows*columns)
		{
			System.out.println("YES");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print("1 ");
				}
				System.out.println();
			}
			
		}
		else
		{
			
			findA(rows,columns,matrixb);
			
		}
	}



}
