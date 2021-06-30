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
import java.math.BigInteger;



public class template
{
	static class cp_default {
		BigInteger bi1=new BigInteger("2");//initialize as string
//		1.BigInteger bi=new BigInteger(Readers.next());- take input as biginteger
		StringBuilder sb=new StringBuilder();
//		2.StringBuilder temp=new StringBuilder(str[i-1]);
//		3.String rev=temp.reverse().toString(); convert sb to string
//		4.if(str[i].compareTo(rev)>=0)minn=0;-compare two Strings
	//  5.(Initialize as string) - (a.add(b)) - (array initialized with null and not 0)
		Integer[] ARRE=new Integer[5];//Integer sort-TLE-Initialize object elements i.e a[0].
		static final int mod1 = 1000000007;//or 1e9+7
	    //	6.System.exit(0); to exit from code....esp in recur 
		static long gcd(long a,long b) {if(b==0)return a;else return gcd(b,a%b);}
		long ceil(double d) {return (long)Math.ceil(1.0*d);}
		int ch_int(char c) {return Integer.parseInt(String.valueOf(c));}//change char to Integer
		String ch_str(char c) {return String.valueOf(c);}
		String int_str(int num) {return Integer.toString(num);}
		void divisor(long n,int start) {
			int cnt=0;for(int i=start;i<=Math.sqrt(n);i++) {
			if(n%i==0) {if(i==n/i)cnt++;else cnt+=2;}}}
		static class pair{
			 int fir;
			 int sec;
			 pair(int _fir, int _sec){
				 fir=_fir;
				 sec=_sec;
			 }
		}

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
	


	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
	
		
			
		
		
		
		


		
	
	
	
	}






}

}








