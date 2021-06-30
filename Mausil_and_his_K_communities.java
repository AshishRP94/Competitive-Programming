package competitive_programming;

import java.util.Scanner;

//These are different Eclipse keyboard shortcuts that don't fit on any category, but they can be quite helpful while working in Eclipse.
//
//20) Ctrl + T for toggling between supertype and subtype
//
//21) Go to other open editors: Ctrl + E.
//
//22) Move to one problem (i.e.: error, warning) to the next (or previous) in a file: Ctrl +. For next, and Ctrl +, for the previous problem
//
//23) Hop back and forth through the files you have visited: Alt + ← and Alt + →, respectively
//
//25) CTRL+Shift+G, which searches the workspace for references to the selected method or variable
//
//26) Ctrl+Shift+L to view the listing for all Eclipse keyboard shortcuts
//
//27) Alt + Shift + j to add Javadoc at any place in Java source file
//
//28) CTRL+SHIFT+P to find closing brace. Place the cursor at the opening brace and use this.
//
//29) Alt+Shift+X, Q to run Ant build file using keyboard shortcuts in Eclipse
//
//30) Ctrl + Shift +F for autoformatting


class codechef
{
	
	

	
	
	public int findmin(int mspace, int nmaxfloors, int kcommunity, int[] building, int[][] cost) 
	{
		
		
	
		
		
		
		
		return 0;
	}
	
}


public class Mausil_and_his_K_communities {

	public static void main(String[] args) {
		
		int Mspace,Nmaxfloors,Kcommunity;
		Scanner scan=new Scanner(System.in);
		Mspace=scan.nextInt();
		Nmaxfloors=scan.nextInt();
		Kcommunity=scan.nextInt();
		int [] Building =new int[Mspace];
		for(int i=0;i<Mspace;i++)
		{
			Building[i]=scan.nextInt();
		}
		
		int [][] cost=new int[Mspace][Nmaxfloors];
		
		for(int land=0;land<Mspace;land++)
		{
			for(int floor=0;floor<Nmaxfloors;floor++)
			{
				cost[land][floor]=scan.nextInt();
			}
		}
		
	
		codechef c=new codechef();
		System.out.println(c.findmin(Mspace,Nmaxfloors,Kcommunity,Building,cost));
		
		
		
		
		
		
		

		
		
		
	}

}
