package competitive_programming;

import java.util.Scanner;

public class C_Ping_pong 
{


//The first line contains a single integer t (1≤t≤104) — the number of test cases.
//The first and only line of each test case contains two integers x and y (1≤x,y≤106) — Alice's and Bob's initial stamina.
	
//	3
//	1 1
//	2 1
//	1 7
//	outputCopy
//	0 1
//	1 1
//	0 7
//	Note
//	In the first test case, 
//	Alice serves the ball and spends 1 stamina. Then Bob returns the ball and also spends 1 stamina. 
//	Alice can't return the ball since she has no stamina left and loses the play. Both of them ran out of stamina,
//	so the game is over with 0 Alice's wins and 1 Bob's wins.
//
//	In the second test case,
//	Alice serves the ball and spends 1 stamina. Bob decides not to return the ball — he loses the play but saves stamina. 
//	Alice, as the winner of the last play, serves the ball in the next play and spends 1 more stamina. This time, Bob returns the ball and spends 1 stamina.
//	Alice doesn't have any stamina left, so she can't return the ball and loses the play. Both of them ran out of stamina, so the game is over with 1 Alice's and 1 Bob's win.
//
//	In the third test case, Alice serves the ball and spends 1 stamina. 
//  Bob returns the ball and spends 1 stamina. Alice ran out of stamina, so she can't return the ball and loses the play.
//	Bob, as a winner, serves the ball in the next 6 plays. Each time Alice can't return the ball and loses each play. 
//	The game is over with 0 Alice's and 7 Bob's wins.


	
	private static void pingpong(int alice, int bob)
	{
		int alicescore=0;
		int bobscore=0;
		
		if(alice==bob)
		{
			alicescore=(alice-1);
			bobscore=bob;
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int alice=scan.nextInt();
			int bob=scan.nextInt();
			pingpong(alice,bob);
		}

	}



}
