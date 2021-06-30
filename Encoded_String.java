package competitive_programming;

import java.util.HashMap; // import the HashMap class
import java.util.Scanner;


//The first line of the input contains an integer T, denoting the number of test cases.
//The first line of each test case contains an integer N, the length of the encoded string.
//The second line of each test case contains the encoded string S.


public class Encoded_String 
{
//static char[] alpha= {'0','a' , 'b' , 'c' ,'d' ,'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' ,  'm',   'n', 'o', 'p' }; 
                     //0   1     2    3     4     5     6     7    8      9     10    11   12    13    14    15    16
	
	
	 
	
	 
	
	
	static HashMap<String, Character> alpha = new HashMap<String, Character>();
	private static void findencodedcharacers(String encodedstring) 
	{
		 String temp;
		 alpha.put("0000",'a' );
		 alpha.put("0001",'b' );
		 alpha.put("0010",'c' );
		 alpha.put("0011",'d' );
		 alpha.put("0100",'e' );
		 alpha.put("0101",'f' );
		 alpha.put("0110",'g' );
		 alpha.put("0111",'h' );
		 alpha.put("1000",'i' );
		 alpha.put("1001",'j' );
		 alpha.put("1010",'k' );
		 alpha.put("1011",'l' );
		 alpha.put("1100",'m' );
		 alpha.put("1101",'n' );
		 alpha.put("1110",'o' );
		 alpha.put("1111",'p' );
		 int times=encodedstring.length()/4;
		 int count=0;
		for(int i=0;i<encodedstring.length();i+=4)
		{
			
//			System.out.println("i"+i);
			if(times==count)
			{
				break;
				
			}
			temp=encodedstring.substring(i, (i+3)+1);
//			System.out.println("temp="+temp);
			if(alpha.containsKey(temp)==true)
			{
				System.out.print(alpha.get(temp));
				
			}
			count+=1;
		}
		
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			scan.nextLine();
			String encodedstring=scan.nextLine();
			findencodedcharacers(encodedstring);
		}
		
	
	
//      i0
//		end8
//		i=0
//
//		i1
//		end4
//		i=1
//
//		i2
//		end2
//		i=2
//
//		i3
//		end1
//		i=3
//		start0
//		end1
//

	
	}



}
