package competitive_programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Worthy_Matrix
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
	

	
//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains three space-separated integers N, M and K.
//	N lines follow. For each valid i, the i-th of these lines contains M space-separated integers Ai,1,Ai,2,Ai,3,…,Ai,M.

	
	

	
	public static void main(String[] args) throws IOException
	{
//		FastReader scan=new FastReader();
        Reader scan = new Reader();

		int t=scan.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			long k=scan.nextLong();
			long [][]arr=new long[n][m];
			long [][]sum=new long[(n+1)][(m+1)];
			long count=0;
			for(int j=0;j<arr.length;j++)
			{
				for(int l=0;l<arr[0].length;l++)
				{
					arr[j][l]=scan.nextLong();
					if(arr[j][l]>=k)
					{
						count+=1;
					}
				}
				
			}
			
			for(int j=1;j<=arr.length;j++)
			{
				sum[1][j]=arr[0][j-1];
			}
			
			
			for(int j=1;j<=arr.length;j++)
			{
				for(int l=1;l<=arr[0].length;l++)
				{
					sum[j][l]=arr[j-1][l-1]+sum[j-1][l];
				}
			
			}
			
			for(int j=1;j<=arr.length;j++)
			{
				for(int l=2;l<=arr[0].length;l++)
				{
					sum[j][l]+=sum[j][l-1];
				}
			
			}
			
			System.out.println("count");
			long min=Math.min(arr.length,arr[0].length);
			int order =2;
			long sums=0;
			int t1=0,t2=0;
			
			while(order<=min)
			{
				for(int i=order;i<=arr.length;i++)
				{
					sums=0;
					for(int j=order;j<=arr[0].length;j++)
					{
						sums=0;
						double avg=0.0;
//						System.out.println("i="+i+"j="+j);
						t1=i-order+1;
						t2=j-order+1;
//						System.out.println("t1="+t1+"t2="+t2);
						sums=sum[i][j]-sum[t1-1][j]-sum[i][t2-1]+sum[t1-1][t2-1];
					avg=(sums*1.0)/(order*order*1.0);
					if(avg>=k)
					{
						count=count+(arr[0].length-j)+1;
						break;
					}
							
					}
				}
				order+=1;
				
			}
			System.out.println(count);
			
			
		}

	}

}
