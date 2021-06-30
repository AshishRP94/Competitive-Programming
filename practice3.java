package competitive_programming;

import java.util.Scanner;


  class Dog
  {
	  String name;

	public Dog(String name) {
//		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}


  }
  
  class GreyHound extends Dog
  {

	  private String Color;
	  private int weight;
	public GreyHound(String name, String color, int weight) {
		super(name);
		Color = color;
		this.weight = weight;
	}
	public String getColor() {
		return Color;
	}
	

	public int getWeight() {
		return weight;
	}


  }

public class practice3
{


	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		GreyHound obj=new GreyHound("bob","white",5);
		System.out.println(obj.getName());
		System.out.println(obj.getColor());
		System.out.println(obj.getWeight());
		
		
	}

}
