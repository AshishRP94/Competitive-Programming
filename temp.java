package competitive_programming;


/* package codechef; // don't place package name! */


import java.util.Scanner;

//Example case 1: The original sequence is (2,2,3). Consider the following three operations:
//
//Choose i=1, j=2 and p=1. Then, A1 changes from 2 to 2⊕21=0 and similarly, A2 changes from 2 to 2⊕21=0. Now the sequence is (0,0,3).
//Next, choose i=1, j=2 and p=1. Then, A1 changes to 0⊕21=2 and A2 changes to 0⊕21=2. The sequence is (2,2,3).
//Next, again choose i=1, j=2 and p=1. Then, A1 changes to 2⊕21=0 and A2 changes to 2⊕21=0. The sequence is (0,0,3) again.
class temp

{


	public static void main(String[] args) throws java.lang.Exception
	{
		
		System.out.println(3^1);
		System.out.println(1^4);
		System.out.println(0^2);
		System.out.println(3^3^3);
		System.out.println(20^(2*2*2*2));
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println((long)Math.ceil(Math.log(70)));
		System.out.println(Math.pow(2, d));
		for(int i=1;i<=100;i++)
		{
		
			System.out.println(""+(i^(2*2*2))+"|"+i);
			
		}
		
	

	}



}






//if((hail[i]%2==0))
//{
//	int temp=0;
//	if(hail[i]!=0)
//	{
//		int log=(int)Math.ceil(Math.log(hail[i]));
//		temp=(int)Math.pow(2, log);
//		if(hail[i]<=temp)
//		{
//			hail[i]=hail[i]^temp;
//		}
//		else
//		{
//			temp=(int)Math.pow(2, log-1);
//			hail[i]=hail[i]^temp;
//		}
//	}
//	int j=i+1;
//	long ts=0;;
//	if(hail[j]!=0)
//	{
//		if((hail[j]^temp)<hail[j])
//		{
//			hail[j]=hail[j]^temp;
//			
//		}
//		else
//		{
//			for(int t=j+1;j<hail.length;j++)
//			{
//			long s=hail[t]^temp;
//			if(s<ts)
//			{
//				ts=s;
//				
//			}
//			}
//		}
//		hail[(int)(ts)]=hail[(int)(ts)]^temp;
//	}
//	
//}
//else
//{
//	if(hail[i]!=1)
//	{
//		int temp=0;
//		if(hail[i]!=1)
//		{
//			int log=(int)Math.ceil(Math.log(hail[i]));
//			temp=(int)Math.pow(2, log);
//			if(hail[i]<=temp)
//			{
//				hail[i]=hail[i]^temp;
//			}
//			else
//			{
//				temp=(int)Math.pow(2, log-1);
//				hail[i]=hail[i]^temp;
//			}
//		}
//		int j=i+1;
//		long ts=0;;
//		if(hail[j]!=1)
//		{
//			if((hail[j]^temp)<hail[j])
//			{
//				hail[j]=hail[j]^temp;
//				
//			}
//			else
//			{
//				for(int t=j+1;j<hail.length;j++)
//				{
//				long s=hail[t]^temp;
//				if(s<ts)
//				{
//					ts=s;
//					
//				}
//				}
//			}
//			hail[(int)(ts)]=hail[(int)(ts)]^temp;
//
//		
//	
//		
//		
//		
//	}
//
//}
//
//}














//----------------------------------------------------------------------------------------------------------


//int i = 0, j = 0;
//boolean h1 = false;
//for (int op = 0; op < x;) 
//{
//	while (true) 
//	{
//		System.out.println("i="+i);
//		if ((hail[i] % 2 == 0)) 
//		{
//			System.out.println("in i="+i);
//			int temp = 0;
//			if(hail[i] != 0) 
//			{
//				int log = (int) Math.ceil(Math.log(hail[i]));
//				System.out.println("log="+log);
//				temp = (int) Math.pow(2, log);
//				System.out.println("temp="+temp);
//				if (hail[i] <= temp) 
//				{
//				
//					hail[i] = hail[i] ^ temp;
//					System.out.println("in hail="+hail[i]);
//			    } 
//				else 
//				{
//					temp = (int) Math.pow(2, log - 1);
//					hail[i] = hail[i] ^ temp;
//					System.out.println("else hail="+log);
//				}
//				h1 = true;
//			} 
//			else 
//			{
//				i=i+1;
//				System.out.println("i="+i);
//			}
//			long ts = 0;
//			
//			if (h1 == true) 
//		{
//				j = i + 1;
//				System.out.println("j="+j);
//
//				if ((hail[j] ^ temp) < hail[j]) 
//				{
//					
//					hail[j] = hail[j] ^ temp;
//					
//					System.out.println("in hail[j]="+hail[j]);
//					i=i+1;
//					
//				} 
//				else 
//				{
//					int t = 0;
//					if((j+1)<hail.length)
//					{
//						t=j + 1;
//						
//					}
//					else
//					{
//						t=0;
//					}
//					for (; t < hail.length; t++) 
//					{
//						long s = hail[t] ^ temp;
//						System.out.println("else s="+s+"t="+t);
//
//						if (s < ts) 
//						{
//							ts = s;
//							System.out.println("if"+ts);
//
//						}
//					}
//					i=i+1;
//				}
//				hail[(int) (ts)] = hail[(int) (ts)] ^ temp;
//				System.out.println("hail[(int) (ts)]"+(hail[(int) (ts)]));
//			}
//
//		} 
//		else 
//		{
//			if (hail[i] != 1) 
//			{
//				int temp = 0;
//				if (hail[i] != 1) 
//				{
//					int log = (int) Math.ceil(Math.log(hail[i]));
//					
//					temp = (int) Math.pow(2, log);
//					if (hail[i] <= temp) {
//						hail[i] = hail[i] ^ temp;
//					} 
//					else 
//					{
//						temp = (int) Math.pow(2, log - 1);
//						hail[i] = hail[i] ^ temp;
//					}
//					h1 = true;
//				}
//				long ts = 0;
//				if (h1 = true) 
//				{
//					if(j+1<hail.length)
//					{
//						
//						j = i + 1;
//					}
//					else
//					{
//						j=0;
//					}
//
//					if ((hail[j] ^ temp) < hail[j]) 
//					{
//						hail[j] = hail[j] ^ temp;
//
//					} 
//					else 
//					{
//						int t = 0;
//						if((j+1)<hail.length)
//						{
//							t=j + 1;
//							
//						}
//						else
//						{
//							t=0;
//						}
//					
//						for (; t < hail.length; t++) 
//						{
//							long s = hail[t] ^ temp;
//							if (s < ts) {
//								ts = s;
//
//							}
//						}
//					}
//					hail[(int) (ts)] = hail[(int) (ts)] ^ temp;
//
//				}
//
//			}
//
//		}
//		if (h1 == true) 
//		{
//			op = op + 1;
//			break;
//
//		}
//	}
//}
//for(int t2i=0;t2i<=hail.length;t2i++)
//{
//	
//	System.out.println(hail[t2i]);
//
//}
//return hail;