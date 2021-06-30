package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class leetcode
{
	
    public static void sortColors(int[] nums)
    {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]==1)
            {
                one+=1;
            }
            else if(nums[i]==2) 
            {
                two+=1;
            }
            else
            {
                zero+=1;
            }
        }
        
//        System.out.println("zero"+zero);
//        System.out.println("one"+one);
//        System.out.println("two"+two);

                
        for(int i=0;i<nums.length;i++)
        {
            if(zero>0)
            {
//            	System.out.println("i"+i);
                nums[i]=0;
                zero-=1;
//                System.out.println("if zero"+zero);
            }
            
            else if(one>0)
            {
                nums[i]=1;
//                System.out.println("i"+i);
                one-=1;
//                System.out.println("one"+one);
            }
           
            else
            {
                nums[i]=2;
//                System.out.println("i"+i);
                two-=1;
//                System.out.println("two"+two);
            }
            
        }
    }
//    https://www.lenskart.com/vincent-chase-vc-e13039-c1-eyeglasses.html
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		
	       List<List<Integer>>ans=new ArrayList<>();
	       List<Integer>temp=new ArrayList<Integer>();
	       temp.add(1);
	       temp.add(1);
	       ans.add(temp);
	       temp.clear();
	       
	       temp.add(1);
	       temp.add(1);
	       temp.add(1);
	       ans.add(temp);
	       
	       System.out.println(ans);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		sortColors(arr);
//		String s="Asis";
//		s
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
