package competitive_programming;

import java.util.Scanner;

class Books
{
	int findmaxpage(int nob, int mtp, int[] price, int[] pages,int i)
	{
		
	if(mtp==0||i==price.length-1)
	{
		
		System.out.println("mtp base="+mtp);

	
		return 0;
	}
	int sum=0;
	
	if(mtp>=price[i])
	{
	
	sum+=Math.max(sum,Math.max(findmaxpage(nob,mtp-price[i+1],price,pages,i=i+1)+pages[i+1],findmaxpage(nob,mtp-price[i],price,pages,i)+pages[i] ) );
	System.out.println("sum= "+sum+" mtp="+mtp);
	
	}
	
	
	else
	{
		sum+=Math.max(sum,Math.max(findmaxpage(nob,mtp,price,pages,i=i+1),findmaxpage(nob,mtp,price,pages,i)));

	System.out.println("sum= "+sum+" mtp="+mtp);

	
	}
	
	
		return sum;	
    }
    
}

public class Books_Shop 
{
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int nob=scan.nextInt();
		int mtp=scan.nextInt();
		int [] price=new int[nob];
		for(int i=0;i<nob;i++)
		{
			price[i]=scan.nextInt();
		}
		
		int [] pages=new int[nob];

		
		for (int i=0;i<nob;i++)
		{
			pages[i]=scan.nextInt();
		}
		
		Books b=new Books();
		int i=0;
		int j=0;
		System.out.println(b.findmaxpage(nob,mtp,price,pages,i));
		
		
		
	}

}




