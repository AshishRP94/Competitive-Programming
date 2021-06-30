package competitive_programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains two space-separated integers N and M.
//The second line contains N space-separated integers A1,A2,…,AN.
//The third line contains M space-separated integers B1,B2,…,BM.
class CustomComparator implements Comparator<Long> {

    @Override
    public int compare(Long number1, Long number2) {
    	Long value =  (long) number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

public class Fair_Elections 
{
	


	private static int swaps(long[] johnvotes, long[] jackvotes, long sumjohn, long sumjack) 
	{
		
		int swaps=0;
		
		if(sumjohn>sumjack)
		{
			return 0;
			
		}
		
		
		Arrays.sort(johnvotes);
		Arrays.sort(jackvotes);
		int max=jackvotes.length-1;
		for(int min=0;min<johnvotes.length;min++)
		{
			if(max==0)
			{
				break;
			}
//			System.out.println("sumjack="+sumjohn);
//			System.out.println("sumjohn="+sumjack);
//			System.out.println("min="+min);
//			System.out.println("john="+johnvotes[min]+"jackvotes"+jackvotes[max]);
			if(johnvotes[min]>=jackvotes[max])
			{
			//	System.out.println("in if ");
				max-=1;
			//   System.out.println("max="+max);
				continue;
				
			}
			else
			{
			//  System.out.println("in else ");
				
			
			if(((sumjohn-johnvotes[min])+jackvotes[max])>(sumjack-jackvotes[max])+johnvotes[min])
			{		
				swaps+=1;
				sumjohn=(sumjohn-johnvotes[min])+jackvotes[max];
				sumjack=(sumjack-jackvotes[max])+johnvotes[min];
			//	System.out.println("in else if ");
				break;
			
			}
			else
			{
				
				swaps+=1;
			//	System.out.println("swaps="+swaps);
				max-=1;
			//	System.out.println("max="+max);
				sumjohn=(sumjohn-johnvotes[min])+jackvotes[max];
		   //	System.out.println("sumjohn="+sumjohn);
				sumjack=(sumjack-jackvotes[max])+johnvotes[min];
		   //	System.out.println("sumjack="+sumjack);
			}
			
			}
		//	System.out.println();
		
		}
		if(sumjohn<=sumjack)
		{
			return -1;
		}
		
//		System.out.println("sumjack="+sumjack);
//		System.out.println("sumjohn="+sumjohn);
		return swaps;
			

		
		
	}
	
	
  static   PriorityQueue<Long> pqjohn = new PriorityQueue<Long>();
   static PriorityQueue<Long> pqjack = new PriorityQueue<Long>(new CustomComparator());

	private static int swap(long[] johnvotes, long[] jackvotes, long sumjohn, long sumjack) 
	{
		for(int i=0;i<johnvotes.length;i++)
		{
			pqjohn.add(johnvotes[i]);
		}
		
		for(int i=0;i<jackvotes.length;i++)
		{
			pqjack.add(jackvotes[i]);
		}
		int j=0;
		for(int i=0;i<johnvotes.length;i++)
		{
			if((sumjohn+pqjack.peek())-(pqjohn.peek())>((sumjack+pqjohn.peek())-pqjack.peek()))
			{
				sumjohn=((sumjohn+pqjack.peek())-(pqjohn.peek()));
				
			}
			
		}
		
		return 0;
	}


	



	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long sumjohn=0;
			long []johnvotes=new long[n];
			long sumjack=0;
			int m=scan.nextInt();
			long []jackvotes=new long[m];
			for(int j=0;j<n;j++)
			{
				johnvotes[j]=scan.nextLong();
				sumjohn+=johnvotes[j];
			}
			
			for(int k=0;k<m;k++)
			{
				jackvotes[k]=scan.nextLong();
				sumjack+=jackvotes[k];
			}
			
//			System.out.println(swaps(johnvotes,jackvotes,sumjohn,sumjack));
			System.out.println(swap(johnvotes,jackvotes,sumjohn,sumjack));
		
		
		
		}

	
	
	
	
	}








}
