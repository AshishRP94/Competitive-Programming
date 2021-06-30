package competitive_programming;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Compilers_and_parsers 
{
	private static int findmaxlength(String str) 
	{
		int max=Integer.MIN_VALUE;
		int count=0;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			System.out.println("i"+i);
			if(str.charAt(i)=='<')
			{
				st.add('<');
				count+=1;
			}
			else
			{
				if(str.charAt(i)=='>')
				{
					if(st.peek()=='<')
					{
					System.out.println("hi");
					System.out.println("st peek"+st.peek());
					System.out.println("st size"+st.size());
						if(st.size()>1)
						{
//							try
//							{
								st.pop();
								count+=1;
								
//							}
//							catch(EmptyStackException e)
//							{
//								
//							}

						}
						else if(st.size()==1)
						{
							
							count+=1;
						}
						else
						{
							continue;
						}
					 }
					else
					{
						System.out.println("st size"+st.size());
						System.out.println("hi else");
						while(true)
						{
							if(st.empty()==true)
							{
								break;
							}
							else
							{
								st.pop();
								
							}
							
								
							
						}
						if(count>max)
						{
							max=count;
						}
						count=0;
						
					}
				}
				
			}
			System.out.println(" count"+count);
		
		}
		if(count>max)
		{
			max=count;
		}
		
		
		return max;
	}


	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		String str="";
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			
			str=scan.nextLine();
			System.out.println(findmaxlength(str));
			
		}
		
		
//		3
//		<<>>
//		><
//		<>>>
	
	}


}
