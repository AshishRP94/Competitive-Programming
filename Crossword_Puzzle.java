package competitive_programming;

import java.util.Scanner;

public class Crossword_Puzzle{

	private static String[] solvecrossword(String[] crossword, String words)
	{
		
		
		
		
		
		
		
		return null;
	
	}
	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String[] crossword=new String[10];
		String[] res=new String[10];
		for(int i=0;i<10;i++)
		{
			crossword[i]=scan.nextLine();
		}
		
		String words =scan.nextLine();
		res=solvecrossword(crossword,words);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(res);
		}
	
	
	
	
	
	
	}


}
