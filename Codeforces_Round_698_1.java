package competitive_programming;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class Codeforces_Round_698_1 {

//	The first line contains a single integer t (1≤t≤9) — the number of test cases.
//
//	The first line of each test case contains two integers q and d (1≤q≤104, 1≤d≤9).
//
//	The second line of each test case contains q integers a1,a2,…,aq (1≤ai≤109).
	
	

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
	
	
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
	    if (r >= l) { 
	        int mid = l + (r - l) / 2; 
	  
	        // If the element is present at the middle 
	        // itself 
	        if (arr[mid] == x) 
	            return mid; 
	  
	        // If element is smaller than mid, then 
	        // it can only be present in left subarray 
	        if (arr[mid] > x) 
	            return binarySearch(arr, l, mid - 1, x); 
	  
	        // Else the element can only be present 
	        // in right subarray 
	        return binarySearch(arr, mid + 1, r, x); 
	    } 
	  
	    // We reach here when element is not 
	    // present in array 
	    return -1; 
	} 
	
	private static void multiply(int t, int m, int d) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);

		long ans=1;
		for(int i=1;i<t;i++)
		{
			ans=i*d;
			if(ans%10==m)
			{
				if(ans>t)
				{
					out.write("NO");
					out.flush();
					
					
				}
				else
				{
					out.write("YES");
					out.flush();
				}
				break;
			}
			
			
			
		}
		
	}
	
	
	
	private static void findlucknumber(int d, int[] num) throws IOException
	{
		for(int i=0;i<num.length;i++)
		{
			int t=num[i];
			System.out.println();
			if(t%10==d)
			{
				System.out.println("YES");
 				
			}
			else
			{
				multiply(t,t%10,d);
				
			}
			
		}
		
		
	}

	
	

	static ArrayList<Long>mul=new ArrayList<Long>(); 
	private static void multiply1(int max, int d)
	{
		for(int i=1;;i++)
		{
			if(d*i>max)
			{
				break;
			}
			mul.add((long)(d*i));
			
		}
	}



	public static void main(String[] args) throws IOException
	{
	
		
//		Scanner scan=new Scanner(System.in);
		Reader scan=new Reader();

		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int q=scan.nextInt();
			int d=scan.nextInt();
			int []num=new int[q];
			int max=Integer.MIN_VALUE;
			for(int j=0;j<num.length;j++)
			{
				num[j]=scan.nextInt();
				if(num[j]>max)
			{
					max=num[j];
				}
			}
		multiply1(max,d);
			findlucknumber(d,num);
		}
		
	}





}
