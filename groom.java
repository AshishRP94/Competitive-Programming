package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class groom {
	
    public static int countSetBits(int n) 
    { 
  
        // base case 
        if (n == 0) 
            return 0; 
  
        else
  
            // if last bit set add 1 else add 0 
            return (n & 1) + countSetBits(n >> 1); 
    } 
    
    static int gcd(int a, int b)
    {
        // Everything divides 0 
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
	
	private static int round(int n, int[] groom, int x, int y, int b) 
	{
		int []sel=new int[x];
		int j=0;
		for(int i=0;i<groom.length;i++)
		{
			int ans=Math.abs(groom[i]-b);
			if(ans>=0 && ans<=3 )
			{
				sel[j]=groom[i];
				j++;
			}
			if(sel.length-1>x)
			{
				return -1;
			}
		
		}
		
		
		int []tsel2=new int[n];
		 j=0;
		
		for(int i=0;i<sel.length;i++)
		{
			tsel2[j]=countSetBits(sel[i]);
			j=j+1;
		}
		
		Arrays.sort(tsel2);
		int []sel2=new int[y];
		int j1=0;
		for(int y1=sel2.length-1;y1>=0;y1--)
		{
			sel[j1]=sel2[y1];
			
			if(sel2.length-1>y)
			{
				return -1;
			}
		
			
		}
		
		int fgroom=0;
		for(int v=0;v<sel2.length;v++)
		{
			int t= gcd(sel2[v] ,  b);
			if(fgroom<t)
			{
				fgroom=t;
			}
		}
		
		
		
		return fgroom;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] groom=new int[n];
		for(int i=0;i<n;i++)
		{
			groom[i]=scan.nextInt();
		}
		int b=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(round(n,groom,x,y,b));

   }


}
