package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;



public class Iron_Magnet_Wall {
	
	
	
	private static int findmagnets(String s, int n, int constant) 
	{
//		System.out.println("hi");
		int count=0;
		int niron=0;
		int d=Integer.MAX_VALUE;
		boolean[]info=new boolean[n];
		Arrays.fill(info, Boolean.FALSE);

		int power=0,temp=0,nsheets=0;
		boolean[] bool=new boolean[n];
		Arrays.fill(bool, Boolean.FALSE);
		for(int i=0;i<n;i++)
		{
//			System.out.println("i="+i);
//			System.out.println("s at i=="+s.charAt(i));
			if((s.charAt(i))=='M')
			{
//				System.out.println("index M="+i);
			

				
			for(int j=i+1;j<n;j++)
			{
//				System.out.println("Searching for I");
//				System.out.println("j="+j);
				if((s.charAt(j)=='I') && (bool[j]==false))
				{
//					System.out.println("Index I="+j);
					
					if(i>=j)
					{
					temp=i-j;
					}
					else
					{
					temp=j-i;
					}
//					System.out.println("temp="+temp+"nsheets"+nsheets);
					power=constant+1-temp-nsheets;
//					System.out.println("power"+power);
					
					if(power>0)
					
					bool[j]=true;
					count=count+1;
//					niron=niron-1;
					break;
				}
				
				else if(s.charAt(j)=='X')
				{
					break;
				}
				
				else if(s.charAt(j)==':')
				{
					nsheets=nsheets+1;
				}
				
				
			
			
			}
			
//			System.out.println("niron= "+niron+" i="+i);

			if(niron>0 && i>0)
			{
				int j=d;
//				for(int t=0;t<n;t++)
//				{
//					if(info[t]==true)
//					{
//						j=t;
//						break;
//					}
//				}
//				
//				System.out.println("not needed");
				for(;j<=i;j++)
				{
//					System.out.println("Searching for I");
//					System.out.println("j="+j);
					
					if((s.charAt(j)=='I') && (bool[j]==false))
					{
//						System.out.println("Index I="+j);

					
						if(i>=j)
						{
						temp=i-j;
						}
						else
						{
						temp=j-i;
						}
						
//						System.out.println("temp="+temp+"nsheets"+nsheets);
						power=constant+1-temp-nsheets;
//						System.out.println("power"+power);
						
						if(power>0)
						
						bool[j]=true;
						count=count+1;
//						niron=niron-1;
						break;
					}
					
					else if(s.charAt(j)=='X')
					{
						break;
					}
					
					else if(s.charAt(j)==':')
					{
						nsheets=nsheets+1;
					}
					
					else if(s.charAt(j)=='I' && bool[i]==false)
					{
						niron=niron+1;
					}	
			
			
			}
				
			}
			}
			
			else if(s.charAt(i)=='I' && bool[i]==false)
			{ 
				niron=niron+1;
				info[i]=true;
				if(i<=d)
				{
					d=i;
					
				}
//				System.out.println("niornnnnnnnnnnnn"+niron);
			}
			
			
		
		
		}
		
		
		
		
		return count;
	}
	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in); 
		int t=scan.nextInt();
		int k=0,n=0;
		String s=new String();
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			scan.nextLine();
			s=scan.nextLine();
		
			
			System.out.println(findmagnets(s,n,k));
			
		}
		

		
		
		
		
		
		
		
	}

	

}







