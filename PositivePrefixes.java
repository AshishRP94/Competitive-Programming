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




//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first and only line of each test case contains two space-separated integers N and K.
public class PositivePrefixes 
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

	private static int findsequence(int n, int k) throws IOException 
	{
		  BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
			         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		  
		if(k==n)
		{
			for(int i=1;i<=n;i++)
			{
				
				out.write(i+" ");
			}
		return 0;
		}
		
		if(k==n-1)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1)
				{
					int t=0-j;
					System.out.print(t+" ");

					
				}
				else
				{
					
					System.out.print(j+" ");
				}
				
			}
			System.out.println();

			return 0;

		}
		
		
		
		if(k==1)
		{
			
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.print(i+" ");

				
			}
			else
			{
				int t=0-i;
				System.out.print(t+" ");
			}
			
		}
		System.out.println();

		return 0;

		}
		
//		if(k==2)
//		{
//			
//		for(int i=1;i<=n;i++)
//		{
//			if(i==1)
//			{
//				System.out.print(" "+i);
//
//				
//			}
//			else if(i==2)
//			{
//				System.out.print(" "+i);
//
//				
//			}
//			else
//			{
//				int t=0-i;
//				System.out.print(" "+t);
//			}
//			
//		}
//		
//		}
		
		
		
	
//		if(n%2==0)
//		{
			int o=n/2;
			if(k==o)
			{
//				System.out.println("yo");
				int count=0;
				for(int i=1;i<=n;i++)
				{
					if(i%2==1)
					{
						if(count<=k)
						{
							
							
						int t=0-i;
						System.out.print(t+" ");
						}
						count+=1;
						
					}
					else
					{

						System.out.print(i+" ");
					}
					
				}
			}
			else if(o<k)
			{

				int nottrs=k-o;
				int count=0;
				
			
					count=nottrs;
					if(n%2==0)
					{
					count=count+1;	
					}
			
				
				for(int i=1;i<=n;i++)
				{
					
					if(i%2==1)
					{
//						System.out.print("count="+count+"|");

						if(count<=o)
						{
//							System.out.print("count"+count);
//							System.out.print("k="+k+"|");
							
							
						int t=0-i;
						System.out.print(t+" ");
						count+=1;
						}
						else
						{
							
							System.out.print(i+" ");
						}
						
						
					}
					else
					{

						System.out.print(i+" ");
					}
					
					
					
					
					
					
				}
				
				
			}
			
			else
			{
				int count=0;
//			    System.out.println("hi");
				for(int i=1;i<=n;i++)
				{
//					System.out.print("count="+count+"k="+k+".i="+i+"||");
					if(count<k)
					{

						
					if(i%2==0)
					{
//						System.out.print("in count="+count+"k="+k+".i="+i+"||");
						count=count+1;
//						System.out.print("yo");
//						System.out.print("count="+count+"|");
						System.out.print(i+" ");

					}
					else
					{
						int t=0-i;
						System.out.print(t+" ");
					}
					
					}
					else
					{
						int t=0-i;
//						System.out.print("count="+count+"x");
						System.out.print(t+" ");
						
					}
					
					
				}
				
				
				
				
				
			}	
			System.out.println();

			return 0;

		
		
		
//		return 0;
	
	
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		  Reader scan=new Reader();  
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
		int n=scan.nextInt();
		int k=scan.nextInt();
	    int ans=findsequence(n,k);
		}

		
		
		
		
		
		
		
		
	}

	

}
