package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// �Է¹��� ������ �̸��� ���.
		BufferedReader fin = null; // ���ڿ��� �Է¹޴°� ���۵帮���ۿ� ��� ���۵帮���� ���µ�
		FileWriter fw = null;      // ����� �ƹ��ų� �ᵵ�ȴ�.���������� ��Ʈ���� ����ϴ� ���� ���Ƽ�.
		try {
//			InputStream is = System.in;
//			Reader r = new InputStreamReader(is);
//			BufferedReader in = new BufferedReader(r);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("�����̸� : ");
//			String infile = in.readLine();// in.readLine()�� �������� ���������� �о���δ�.
//			System.out.println("infile == " + infile);
			
			System.out.println("���� �����̸� : ");
			String infile = in.readLine();
			
			System.out.println("������ �����̸� : ");
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

