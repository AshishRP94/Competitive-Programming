package competitive_programming;

import java.util.Scanner;

public class Rotate_Image_Leetcode
{
	
	    public static  void rotate(int[][] matrix)
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=i+1;j<matrix[0].length;j++)
	            {
	                matrix[i][j]=(matrix[i][j]^matrix[j][i]);
	                matrix[j][i]=(matrix[i][j]^matrix[j][i]);
	                matrix[i][j]=(matrix[i][j]^matrix[j][i]);
	            }
	        }
        
//	        for(int i=0;i<matrix.length;i++)
//	        {
//	        	for(int j=0;j<matrix[0].length;j++)
//	        	{
//	        		System.out.print(matrix[i][j]+" ");
//	        	}
//	        	System.out.println();
//	        }
//	        
	        System.out.println(matrix);
	        for(int i=0;i<matrix.length;i++)
	        {
	            int low=0;
	            int high=(matrix[0].length-1);
	            while(true)
	            {
	                if(low>=high)
	                {
	                    break;
	                }
	                matrix[i][low]=(matrix[i][low]^matrix[i][high]);
	                matrix[i][high]=(matrix[i][low]^matrix[i][high]);
	                matrix[i][low]=(matrix[i][low]^matrix[i][high]);
	                low+=1;
	                high-=1;
	            }
	        }
	        
	    }

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		
		System.out.println(matrix[0]);
		
		rotate(matrix);

		

	}

}
