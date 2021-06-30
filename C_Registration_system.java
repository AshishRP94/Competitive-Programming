package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class C_Registration_system {

	static HashMap<String,Integer>hm=new HashMap<String,Integer>();
	private static String response(String s)
	{
		String ans="";
		if(hm.containsKey(s))
		{
			int c=(hm.get(s)+1);
			hm.put(s, c);
			ans=(s+c);
			
		}
		else
		{
			hm.put(s, 0);
			ans="OK";
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
		String s=scan.nextLine();
		System.out.println(response(s));
		}
		
		
	}



}
