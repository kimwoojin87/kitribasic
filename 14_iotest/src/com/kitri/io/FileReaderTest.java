package com.kitri.io;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("d:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int) length];
			int x = fr.read(c);
			System.out.println(x + "characters read!!!");// 문자를 읽어들임.
			String str = new String(c);
			System.out.println(str);

			File outfile = new File("d:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			fw.write(str);// 메모리상에서만 써라가 되어있는 상태임.

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
