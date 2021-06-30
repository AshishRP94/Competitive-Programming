package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_occurrence {
	
	private static void maxoccurance(String s)
	{
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		int max=Integer.MIN_VALUE;
		char maxoccletter = 0;
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i))==true)
			{
				int count=hm.get(s.charAt(i))+1;
				hm.put(s.charAt(i),count);
				if(count>max)
				{
					max=count;
					maxoccletter=s.charAt(i);
				}
				if(count==max)
				{
					if(maxoccletter>s.charAt(i))
					{
						maxoccletter=s.charAt(i);
					}
					
				}
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(""+maxoccletter+" "+max);
		
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		maxoccurance(s);
		
	}


}
