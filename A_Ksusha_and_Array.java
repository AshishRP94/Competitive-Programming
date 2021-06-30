package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class A_Ksusha_and_Array
{
	
	 static int gcd(int a, int b)
	 {
	      if (b == 0)
	      {
	    	  return a;
	      }
	      return gcd(b, a % b);
	      
	 }
	
	private static void find_num(int[] arr, HashMap<Integer, Integer> hm)
	{
		
		int ans=0;
		boolean flag=false;
		boolean bool=false;
		for(int i=arr.length-1;i>0;i--)
		{	
			int temp=gcd(arr[i],arr[i-1]);
			if(temp==1)
			{
				System.out.println("-1");
				return;
			}
			if(flag==false)
			{
				ans=temp;
				flag=true;
				continue;
			}
			if(ans!=temp)
			{
				bool=true;
				if(hm.containsKey(ans)==true)
				{
					int ind=hm.get(ans);
					if(arr[ind]==arr[i-1])
					{
						System.out.println(""+ans);
					}
					else
					{
						System.out.println("-1");
						
					}
				}
				else
				{
					System.out.println("-1");
				}
				break;
			}
		}
		if(bool==false)
		{
			System.out.println(""+ans);
		}
	}
	
	
	

//	The first line contains integer n (1 ≤ n ≤ 105), 
//	showing how many numbers the array has. The next line contains integers a1, a2, ..., an (1 ≤ ai ≤ 109) — the array elements.
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int n=scan.nextInt();
		int []arr=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			hm.put(arr[i],i);
			if(arr[i]==1)
			{
				flag=true;
			}

		}
		if(flag==true)
		{
			System.out.println("1");
		}
		else
		{
			
			find_num(arr,hm);
		}

	}





}
