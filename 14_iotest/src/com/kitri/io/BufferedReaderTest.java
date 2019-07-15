package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// 입력받을 파일의 이름을 써라.
		BufferedReader fin = null; // 문자열로 입력받는건 버퍼드리더밖에 없어서 버퍼드리더를 쓰는데
		FileWriter fw = null;      // 출력은 아무거나 써도된다.내부적으로 스트링을 출력하는 것이 많아서.
		try {
//			InputStream is = System.in;
//			Reader r = new InputStreamReader(is);
//			BufferedReader in = new BufferedReader(r);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("파일이름 : ");
//			String infile = in.readLine();// in.readLine()의 기준으로 엔터전까지 읽어들인다.
//			System.out.println("infile == " + infile);
			
			System.out.println("읽을 파일이름 : ");
			String infile = in.readLine();
			
			System.out.println("복사할 파일이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));

			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			String str = null;
			while ((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fw != null)
					fw.close();
				if (fin != null)
					fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}

	}
}

