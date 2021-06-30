package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class C_Powers_Of__Two
{
	static class pair
	{
		int ans,power;
		pair(int x,int y)
		{
			ans=x;
			power=y;	
		}
		
	}
	
	
	private static void findans(int n, int k)
	{
		ArrayList<pair>nums=new ArrayList<pair>();
		int count=0;
		int sum=0;
		int power=-1;
		boolean flag=false;
		int nn=n;
		pair p=new pair(0,0);
		while(true)
		{
			power+=1;
			if(n==0)
			{
				if(sum==nn)
				{
					flag=true;
				}
				break;
			}
			
			if((count>k) && (n!=0))
			{
				break;
			}
			
//			9=1001
			
			if((n&1)==1)
			{
				count+=1;
				int temp=(1<<power);
//				System.out.println("temp="+temp+"power="+power);
				sum+=temp;
//				System.out.println("sum="+sum);
				p.ans=temp;
				p.power=power;
				nums.add(new pair(p.ans,p.power));
			}
			n>>=1;
//				p.ans=0;
//				p.power=0;
			
				
		}
		
	
//		System.out.println("flag="+flag);
//		System.out.println("sum="+sum);
		
		
//		for(int i=0;i<nums.size();i++)
//		{
//			System.out.println(" "+nums.get(i).ans+" "+nums.get(i).power);
//		}
		
		
		
		if((flag==false)||(count>k))
		{
			System.out.println("NO");
			
		}
		else
		{
			int spot=k;
			System.out.println("YES");
			if(count==k)
			{
				for(int i=0;i<nums.size();i++)
				{
					System.out.println(nums.get(i).ans+" ");
					
				}
				
			
			}
			else
			{
			int len=nums.size();
			if(count<spot)
			{
			for(int i=0;i<nums.size();i++)
			{
//				System.out.println("i="+i);
				pair t=nums.get(i);
				
				
				
				if(t.power==0)
				{
					int x=1;
					System.out.print(x+" ");	
					spot-=1;
				}
				else
				{
					int tpower=t.power;
					while(true)
					{
						if(tpower==1||count==k)
						{
							break;
							
						}
//						System.out.println("while count="+count);
//						i+=1;
						int x=2;
						System.out.print(x+" ");
						spot-=1;
						count+=1;
						t.power=t.power-1;
						
					}
					
				}
				
				if(count==k)
				{
					System.out.print((1<<t.power)+" ");	
				}
				
					
				
			}
			}
			
			}
			
		}
		
		
		
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		findans(n,k);
	}

	

}
