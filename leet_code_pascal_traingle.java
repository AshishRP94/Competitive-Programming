package competitive_programming;

import java.util.*;

public class leet_code_pascal_traingle
{
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
//        	System.out.println("i="+i);
            if(i==0)
            {
                temp.add(1);
                ans.add(temp);
                temp=new ArrayList<Integer>();
            }
            else if(i==1)
            {

                temp.add(1);

                temp.add(1);

                ans.add(temp);

                temp=new ArrayList<Integer>();

            }
            else
            {
                temp.add(1);
                List<Integer>temp1=ans.get((i-1));
//                System.out.println("temp1"+temp1);
                for(int j=0;j<temp1.size()-1;j++)
                {
                    int sum=(temp1.get(j))+(temp1.get(j+1));
//                    System.out.println("sum"+sum);
                    temp.add(sum);
                }
                
                temp.add(1);
//                System.out.println("temp"+temp);
                ans.add(temp);
//                System.out.println("ans"+ans);
                temp=new ArrayList<Integer>();
//                temp.clear();
//                System.out.println("temp"+temp);
            }
            System.out.println();
        }
        
        return ans;
        
    }
    
	public static void main(String[] args)
	{
//		System.out.println(generate(5));
		
		int i=6;
		init(++i);
		System.out.println(" after i="+i);
		

	}

	private static void init(int i) {
		
		System.out.println("i="+i);
		i+=10;
		System.out.println("i="+i);
	}

}
