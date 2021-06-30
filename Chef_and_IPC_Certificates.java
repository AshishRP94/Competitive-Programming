package competitive_programming;


import java.util.Scanner;


public class Chef_and_IPC_Certificates
{

	private static int findnoofvalidcand(int n, int m, int k, int[][] data) 
	{
		int count=0;
		int sum=0;
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k-1;j++)
			{
				if(data[i][k-1]>10)
				{
					flag=true;
					break;
					
				}
				
				sum+=data[i][j];
			
				
				
			}
			if(sum>m &&flag==false)
			{
				count+=1;
				
			}
			flag=false;
			sum=0;
		}
		return count;
	}
		

	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
    
        int n=scan.nextInt();
        
        int m=scan.nextInt();
        int k=scan.nextInt();
     
       int[][] data=new int[n][k+1];
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<k+1;j++)
    	   {
    		   data[i][j]=scan.nextInt();
    	   }
       }
        System.out.println((findnoofvalidcand(n,m,k+1,data)));
      
//        4 8 4
//        1 2 1 2 5
//        3 5 1 3 4
//        1 2 4 5 11
//        1 1 1 3 12
        
		
			
		
		
		
		


		
	
	
	
	}






}

		
		
		
		

