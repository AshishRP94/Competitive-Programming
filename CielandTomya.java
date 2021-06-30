package competitive_programming;


import java.util.Scanner;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;





public class CielandTomya 
{
	static class Reader
	{
	
	final private int BUFFER_SIZE = 1 << 16; 
	private DataInputStream din; 
	private byte[] buffer; 
	private int bufferPointer, bytesRead; 

	public Reader() 
	{ 
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE]; 
		bufferPointer = bytesRead = 0; 
	} 

	public Reader(String file_name) throws IOException 
	{ 
		din = new DataInputStream(new FileInputStream(file_name)); 
		buffer = new byte[BUFFER_SIZE]; 
		bufferPointer = bytesRead = 0; 
	} 

	public String readLine() throws IOException 
	{ 
		byte[] buf = new byte[64]; // line length 
		int cnt = 0, c; 
		while ((c = read()) != -1) 
		{ 
			if (c == '\n') 
				break; 
			buf[cnt++] = (byte) c; 
		} 
		return new String(buf, 0, cnt); 
	} 

	public int nextInt() throws IOException 
	{ 
		int ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do
		{ 
			ret = ret * 10 + c - '0'; 
		} while ((c = read()) >= '0' && c <= '9'); 

		if (neg) 
			return -ret; 
		return ret; 
	} 

	public long nextLong() throws IOException 
	{ 
		long ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 
		if (neg) 
			return -ret; 
		return ret; 
	} 

	public double nextDouble() throws IOException 
	{ 
		double ret = 0, div = 1; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 

		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 

		if (c == '.') 
		{ 
			while ((c = read()) >= '0' && c <= '9') 
			{ 
				ret += (c - '0') / (div *= 10); 
			} 
		} 

		if (neg) 
			return -ret; 
		return ret; 
	} 

	private void fillBuffer() throws IOException 
	{ 
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
		if (bytesRead == -1) 
			buffer[0] = -1; 
	} 

	private byte read() throws IOException 
	{ 
		if (bufferPointer == bytesRead) 
			fillBuffer(); 
		return buffer[bufferPointer++]; 
	} 

	public void close() throws IOException 
	{ 
		if (din == null) 
			return; 
		din.close(); 
	} 
} 	
	
//	The first line contains an integer T, the number of test cases. Then T test cases follow.
//	The first line of each test case contains 2 integers N, M. Then next M lines contains 3 integers denoting Ai, Bi and Ci.
	static int ans=Integer.MAX_VALUE;
	static int dtravelled=0;
	static int  x=0;
	private static int findshortestpath(int n, int m, int[] source, int[] dest, int[] distance, boolean[] track,int ind,   int bool) 
	{
		if(x==m-1)
		{
			return 0;
		}
		
		
		if(ind>=m-1)
		{
		if(bool>=m-1)
		{
			return 0;
		}
		else
		{
			ind=0;
		}
		}
		
		x+=1;
		if(source[ind]==1 && track[ind]==false)
		{
			x-=1;
			
			track[ind]=true;
			dtravelled+=distance[ind]+findshortestpath(n,m,source,dest,distance,track,ind+1,bool+1);
			if(dtravelled<ans)
			{
				ans=dtravelled;
			}
		}
		else 		
		{
			x-=1;
			if(ind>0)
			{
			int temp=+distance[ind-1];
			for(int i=0;i<m;i++)
			{
				
				if(dest[ind-1]==source[i] && track[i]==true)
				{
					track[bool]=true;
					bool=bool+1;
					int tempans=Integer.MAX_VALUE;
					if(dest[i]==m)
					{
						return temp+distance[i];
						
					}
					temp+=distance[i]+findshortestpath(n,m,source,dest,distance,track,i,bool);
					if(temp<tempans)
					{
				           return tempans=temp;
					}
					
					track[bool]=false;
					bool=bool-1;
				}
			 
			}
			}
			
			
			
		}
		
		
		
		
		return ans;
	
	}
	
	
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		
		int t=scan.nextInt();
		int n,m;
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			int []source=new int[m];
			int []dest=new int[m];
			int []distance=new int[m];
			for(int j=0;j<m;j++)
			{
				source[j]=scan.nextInt();
				dest[j]=scan.nextInt();
				distance[j]=scan.nextInt();
			}
			
			int count=0;
//			int dj=0;
			int d=0;
			int bool=0;
			boolean[] track=new boolean[source.length];
			for(int f=0;f<track.length;f++)
			{
				track[f]=false;
			}
		
			System.out.println(findshortestpath(n,m,source,dest,distance,track,count,d));
		}
		
		
		
		
//		1
//		3 3
//		1 2 3
//		2 3 6
//		1 3 7	
//		
		
	
	}








}