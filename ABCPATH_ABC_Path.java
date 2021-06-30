package competitive_programming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ABCPATH_ABC_Path {
	static class trio
	{
		int x=0;
		int y=0;
		int len=0;
		public trio(int x,int y,int len)
		{
			this.x=x;
			this.y=y;
			this.len=len;
			
		}
	}
	
	static boolean [][]visited;
	public ABCPATH_ABC_Path(int h, int w)
	{
		visited=new boolean[h][w];
	}
	
	private static boolean isvalid(char[][] arr, int i, int j)
	{
		
		if(i>=arr.length ||i<0 ||j<0 ||j>=arr[0].length)
		{
			return false;
		}
		
		return true;
	}
	
	
	private static int bfs(char[][] arr, int i, int j)
	{
		int maxlen=Integer.MIN_VALUE;
		boolean[] alpha=new boolean[26];
		Queue<trio>queue=new LinkedList<>();
		queue.add(new trio(i,j,1));
		int len=0;
//		int alphac=0;
//		1 0 -1  0 +1 +1 -1
//		0 1  0 -1  -1 +1 -1
//		System.out.println("in bfs");
		int []di= {1,0,-1,0,1,1,-1};
		int []dj= {0,1,0,-1,-1,1,-1};
		while(true)
		{
			if(queue.size()==0)
			{
				break;
			}
			trio t=queue.poll();
//			System.out.println("arr="+arr[t.x][t.y]);
//			System.out.println("t.x="+t.x+"t.y="+t.y);
			if(maxlen<t.len)
			{
				maxlen=t.len;
			}
			
			
			
			len+=1;
//			alphac+=1;
//			System.out.println("for");
//			alphac+=1;
			for(int k=0;k<di.length;k++)
			{
//				System.out.println("k="+k);
				int nx=t.x+di[k];
				int ny=t.y+dj[k];
//				System.out.println("nx"+nx+" ny"+ny);
				if((isvalid(arr,nx,ny))==true && visited[nx][ny]==false)
				{
//					System.out.println(" in ");
//					System.out.println("arr="+arr[nx][ny]);
//					System.out.println("|value="+(arr[nx][ny]-'A')+"alphac="+len);
					if((arr[nx][ny]-'A'==len) && (alpha[arr[nx][ny]-'A']==false))
					{
// 						System.out.println("in if");
						queue.add(new trio(nx,ny,len));
//						System.out.println("arr="+arr[nx][ny]);
						alpha[arr[nx][ny]-'A']=true;
						visited[nx][ny]=true;
					}


				}
				
			}
//		System.out.println();
			
	
			
		}
		return maxlen+1;

	}
	
	
	




	private static void find_longest_path(char[][] arr)
	{
		
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]=='A' && visited[i][j]==false)
				{
				
//				System.out.println();
				int temp=bfs(arr,i,j);
				
				if(temp>ans)
				{
					ans=temp;
				}
				}
			}
			
		}
		System.out.println(""+ans);
		
		
	}
	
	





	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		char [][]arr=new char[h][w];
		ABCPATH_ABC_Path obj=new ABCPATH_ABC_Path(h,w);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=scan.next().charAt(0);
			}
			
		}
		find_longest_path(arr);
	}




}
