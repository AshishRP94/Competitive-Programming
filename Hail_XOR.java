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

public class Hail_XOR {
	static class Reader {

		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

//	static class Pair
//	{
//		long v;
//		long j;
//		Pair(int vt,int jt)
//		{
//			v=vt;
//			j=jt
//			
//			
//		}
//		
//		
//	}

	private static long[] findlexosmaller(long n, long x, long[] a)
	{

	     long r=0;
	     long fg=0;
	     long p=0;
	     long  i=0;
	     long o=0;
	     for(long g=x;g>0 && i<n-1;g--)
	     {
	         fg=0;
	         try
	         {
	        	 
	       
	         long y=((long)Math.log(2));
	           p= ((long)Math.log(a[(int)i]))/y;
	         }
	         catch(Exception e) 
		     {
		    	System.out.println(e);
		     }
	         r=(long) Math.pow(2,p);
	         a[(int)i]=a[(int)i]^r;
	         for(long j=i+1;j<n;j++){
	             if((a[(int)j]^r) < a[(int)j]){
	                 a[(int)j]= a[(int)j]^r;
	                 fg=1;
	                 break;
	             }
	         }
	         if(fg==0){
	             a[(int)n-1]^=r;
	         }
	         while(a[(int)i] <= 0){
	           i++; 
	         }
	         o=g+1;
	     }
	     if(o>0){
	         if(n<3&&o%2>0){
	             a[(int)n-2] ^= 1;
	             a[(int)n-1] ^= 1;
	         }
	     }
	     return a;
	     }
	    

	

	public static void main(String args[]) throws java.lang.Exception {
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan = new Reader();

		int t = scan.nextInt();
		long n = 0, x = 0;
		long[] hail;

		for (int i = 0; i < t; i++) {
			n = scan.nextLong();
			hail = new long[(int) n];
			x = scan.nextLong();

			for (int j = 0; j < n; j++) {
				hail[j] = scan.nextLong();

			}
			long[] ans = new long[(int) n];
			findlexosmaller(n, x, hail);
			for (int ti = 0; ti < hail.length; ti++) {
				System.out.print(ans[ti]+" ");
			}

		}

	}

}




































