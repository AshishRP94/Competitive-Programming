package competitive_programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C_Team
{
	
	  static class Reader {
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
	            din = new DataInputStream(
	                new FileInputStream(file_name));
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public String readLine() throws IOException
	        {
	            byte[] buf = new byte[64]; // line length
	            int cnt = 0, c;
	            while ((c = read()) != -1) {
	                if (c == '\n') {
	                    if (cnt != 0) {
	                        break;
	                    }
	                    else {
	                        continue;
	                    }
	                }
	                buf[cnt++] = (byte)c;
	            }
	            return new String(buf, 0, cnt);
	        }
	 
	        public int nextInt() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ') {
	                c = read();
	            }
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
	            } while ((c = read()) >= '0' && c <= '9');
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
	 
	        private void fillBuffer() throws IOException
	        {
	            bytesRead = din.read(buffer, bufferPointer = 0,
	                                 BUFFER_SIZE);
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
	private static void solve(int zeros, int ones)
	{
		String ans="";
		boolean flag=false;
		if(zeros>ones)
		{
			flag=true;
		}
		int len=0;
		
		while(true)
		{
//			System.out.println(""+ans.length());
		

					
				
			
			if(zeros==0 ||ones==0)
			{
				break;
			}
			

			if(flag==false)
			{
				if(ones>zeros && ones>1)
				{
					ans+="11";
					ones-=2;
				}
				else
				{
					ans+="1";
					ones-=1;
				}
				if(zeros>0)
				{
					ans+="0";
					zeros-=1;
				}
				
			}
			else
			{
				ans+="0";
				zeros-=1;
				if(ones>0)
				{					
				ones-=1;
				ans+="1";
				}
			}
			
		}
		if(ones>0)
		{
			for(int i=0;i<ones;i++)
			{
				ans+="1";
			}
		}	
		
		if(zeros>0)
		{
			for(int i=0;i<zeros;i++)
			{
				ans+="0";
			}
		}
		
		if(ans.contains("111")==true)
		{
			
			System.out.println("-1");
			return;
		}
	
	
			if(ans.contains("00")==true)
			{
				System.out.println("-1");
				
				return;
			}
		
		

			System.out.println(""+ans);			
		
		
	}

	public static void main(String[] args) throws IOException
	{
		Reader scan=new Reader();
		int zeros=scan.nextInt();
		int ones=scan.nextInt();
		
//		String s="1111111100";
//		System.out.println(s.contains("111"));
//		s.contains("00");
		
		
		solve(zeros,ones);
		
		
		
	}


}
