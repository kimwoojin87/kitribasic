package com.kitri.io;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			File infile = new File("d:\\iotest\\hello.txt");
			in = new FileInputStream(infile);//never closed io와network,db도 연결했으면 끊어야한다.
			long lenth = infile.length();
			byte b[] = new byte[(int) lenth];
			int x = in.read(b);
			String str = new String(b,0,x);
			System.out.println(x + "bytes read!!!");
			System.out.print(str);
			
			File outfile = new File("d:\\iotest\\hello_copy.txt");
			out = new FileOutputStream(outfile);
			out.write(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
				in.close();
				if(out != null)
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
