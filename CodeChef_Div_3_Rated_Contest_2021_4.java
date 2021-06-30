package competitive_programming;

import java.util.Scanner;

//You are given the height H (in metres) and mass M (in kilograms) of Chef. The Body Mass Index (BMI) of a person is computed as MH2.
//
//Report the category into which Chef falls, based on his BMI:
//
//Category 1: Underweight if BMI ≤18
//Category 2: Normal weight if BMI ∈{19, 20,…, 24}
//Category 3: Overweight if BMI ∈{25, 26,…, 29}
//Category 4: Obesity if BMI ≥30



public class CodeChef_Div_3_Rated_Contest_2021_4 {
	
	private static void cal_bmi(long height, long mass)
	{
		height=(height<<1);
//		System.out.println("h="+height);
		long bmi=mass/height;
//		System.out.println("bmi="+bmi);
		if(bmi<=18)
		{
			System.out.println("1");
		}
		else if(bmi>=19 && bmi<=24)
		{
			System.out.println("2");
			
		}
		else if(bmi>=25 && bmi<=29)
		{
			System.out.println("3");
			
		}
		else
		{
			System.out.println("4");
			
		}
		
	}

	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			long mass=scan.nextLong();
			long height=scan.nextLong();
			cal_bmi(height,mass);
			
		}


	}



}
