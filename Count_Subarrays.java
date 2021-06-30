package competitive_programming;

import java.util.ArrayList;

//Count_Subarrays 

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




public class Count_Subarrays 
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
	
	static long f=0;


	static class pair
	{
		long c=0;
		long start=0;
		long last=0;
		pair(long c,long start,long last)
		{
			this.c=c;
			this.start=start;
			this.last=last;
		}
	
	}
	ArrayList<pair> mem=new ArrayList<pair>();
	static long counts=0;
	private static long count(int n, long[] arr, int i,int j ) 
	{
		if(i>arr.length)
		{
//			System.out.println("-1 i="+i);
			return -1;
		}
		int d=Math.abs(i-j);
		if(d==0)
		{
//		
//		System.out.println("a[i]="+arr[i]+"arr[j]"+arr[j]);
//		System.out.println("i="+i+"j"+j);
		
		if(arr[i]<arr[j])
		{
			counts+=1;
//			System.out.println("counts"+counts);
//			System.out.println("counts"+counts);
		}
		else
		{
//			System.out.println("break");
			return -1;
		}
		}
		
		
		else
		{
//			System.out.println("for loop");
			for(int ti=i;ti<j;ti++)
			{
//				System.out.println("ti="+ti);
//				System.out.println("a[i]="+arr[ti]+"arr[j]"+arr[ti+1]);
				if(arr[ti]<arr[ti+1])
				{
//					System.out.println("counts"+counts);
				}
				else
				{
//					System.out.println("break");
					break;
				}
				
			}
			counts+=1;
		}
		if(j<arr.length-1)
		{
//			System.out.println("in j="+j);
			
			if(f==-1)
			{
				i=i+1;
				f=0;
				if(i+1<arr.length)
				{
					j=i;
//					System.out.println("in in j="+(j+i));
				}
				else
				{
//					System.out.println("0 else j="+j);
					return 0;
				}
				
//				System.out.println("in i="+i+"|j="+(j+1));
				f=count(n,arr,i,j+1);
				
			}
			else
			{
//				System.out.println("else i="+i+"|j="+(j+1));
				f=count(n,arr,i,j+1);
				
			}
		
		
		}
	
//	System.out.println("counts"+counts);
	return counts;
	}
	
	
	
	
	
	
	
	
	
	
//	1
//	4
//	1 4 2 3
//	
	
//	The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
//
//	The first line of each test case contains a single integer N denoting the size of array.
//
//	The second line contains N space-separated integers A1, A2, …, AN denoting the elements of the array
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		int t=scan.nextInt();
	    int n=0;
	    long []arr;
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			arr=new long[n];
			for(int j=0;j<n;j++)
			{
			arr[j]=scan.nextLong();
			}
			int indi=0;
			int indj=1;
			System.out.println(((count(n,arr,indi,indj))+arr.length));
			counts=0;
		
	    }
		
		
		
		
		
		
		
	
	
	
	}








}