package competitive_programming;

import java.io.*;
import java.util.*;
public class CandidateCode
{
   	static int []eratosthenes=new int[1000000];
	//1-is prime 
	//0-not prime
	private static void sieve_of_eratosthenes()
	{
		
		for(int i=2;i<eratosthenes.length;i++)
		{
			eratosthenes[i]=1;
		}
		
		for(int i=2;(i*i)<eratosthenes.length;i++)
		{
			if(eratosthenes[i]==1)
			{
				for(int p=i*i;p<eratosthenes.length;p=p+i)
				{
					if(eratosthenes[p]==1)
					{
						
						eratosthenes[p]=0;
					}
					
				}
			}
		}
	}

   public static void main(String args[] ) 
   {
      sieve_of_eratosthenes();
      Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      for(int i=0;i<t;i++)
      {
         int l=scan.nextInt();
         int r=scan.nextInt();
         boolean flag=false;
         boolean flag1=false;
         int lx=0,rx=0;
         
         for(int j=l;j<=r;j++)
         {
            if(flag==false)
            {
            if(eratosthenes[j]==1)
            {
               lx=j;
//               System.out.println(""+j);
               flag=true;
               break;
            }
            } 
            
         }
         
         if(flag==true)
         {
        	 
         for(int k=r;k>=lx;k--)
         {
//        	 System.out.println(""+k);
             if(flag1==false)
             {
             if(eratosthenes[k]==1)
             {
//            	 System.out.println(""+k);
             rx=k;
             flag1=true;
             break;             
             }
             }
        	
         }
         }
//         System.out.println(flag);
//         System.out.println(flag1);
         if(flag==false && flag1==false)
         {
            System.out.println("-1");

         }
         else if((flag==true && flag1==false)|| (flag==false && flag1==true))
         {            
            System.out.println("0");
         }
         else
         {
            System.out.println(""+(rx-lx));
         }

      }

	

   }
}