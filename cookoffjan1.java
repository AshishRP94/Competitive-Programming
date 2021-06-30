package competitive_programming;

import java.util.Scanner;

class codechef {
	
//	1) Password must contain at least one lower case letter [a−z];
//
//	2) Password must contain at least one upper case letter [A−Z] strictly inside, i.e. not as the first or the last character;
//
//	3) Password must contain at least one digit [0−9] strictly inside;
//
//	4) Password must contain at least one special character from the set { '@', '#', '%', '&', '?' } strictly inside;
//
//	5) Password must be at least 10 characters in length, but it can be longer.
	
	private static void checkpass(String pass)
	{
		if(pass.length()<10)
		{
			System.out.println("NO");
		return;
		}
		
	
		boolean balpha=false;
		boolean salpha=false;
		boolean digit=false;
		boolean ss=false;
		
		
		
		for(int i=1;i<(pass.length()-1);i++)
		{
		
			 if(digit==true && ss==true && balpha==true && salpha==true)
			 {
					
				 System.out.println("YES");
				 return;
				 
			 }
			 
			 
			 
			 
			
//			 '@', '#', '%', '&', '?'
			 if(pass.charAt(i)=='@' || pass.charAt(i)=='#' ||pass.charAt(i)=='%'||pass.charAt(i)=='&'||pass.charAt(i)=='?')
			 {
				 
				 ss=true;
			 }
			 else if(Character.isDigit(pass.charAt(i))==true)
				 {
					 digit=true;
					 
				 }
			else if(Character.isUpperCase(pass.charAt(i))==true )
			{
					 
//						 System.out.println(" else if");
						 balpha=true;
			}		 
			else
		    {
				salpha=true;
						 
			}
					 
					 
		 }
		System.out.println("NO");
			 }
			 
			 
		 
			
		
		
		
		
	
	public static void main(String[] args)throws java.lang.Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String pass=scan.nextLine();
			checkpass(pass);
			
		}
		


	}



}
