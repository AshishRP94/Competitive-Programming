package competitive_programming;

import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution1 {
    public static int beautifulFunction(int N)
    {
    	System.out.println("IN");
        int nr=0;
   
      while(true)
      {
    	  
        	System.out.print(N);
            if(N==0)
            {
                break;
            }
            int ld=N%10;
            if(ld!=0)
            {
            int temp=10-ld;
            N=N+temp;
            nr+=temp-1;
            N/=10;
            }
            else
            {
               N/=10;
            }
      }
        
        
        return nr;
        
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int result;
        result = beautifulFunction(N);
        System.out.print(result);
    }
}