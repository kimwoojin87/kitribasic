package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



//0. com,my 3�ڸ� �迭����.
//1. com ���ڸ� ���� �߻�. >>comRandom()
//2. ���� 1�� ���ڴ� �ߺ����� �ȵ�,0���� �����ϸ� �ȵ�.
//3. ���� �Է��� 3�ڸ� ���ڸ� my �迭�� �ֱ�.
//4. com�� my�� ���ڿ� �ڸ���
//	367    159 �迭�� �ٲ����ʴ� �̻� ���� �ڸ��� �񱳺Ұ�����
//5. ���ڰ� ���ٸ�
// 5-1 �ڸ��� ���ٸ� strike ����
// 5-2 �ڸ��� �ٸ��ٸ� ball ����
//6. strike�� 3�̶�� : xxx�� x���� ���� �����Դϴ�.���(1);,����(0);
//  6-1 strike�� 3�� �ƴ϶��
//    xxx�� x��Ʈ����ũ x���Դϴ�. >> 3������

public class NumberBaseball {
	private int my[] = new int[3];
	private int com[] = new int[3];
	BufferedReader in;

	public NumberBaseball() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	private void comRandom() {

		com[0] = (int) (Math.random() * 9 + 1);
		com[1] = 0;
		com[2] = 0;
		for (;;) {
			com[1] = (int) (Math.random() * 10);
			if (com[0] != com[1]) {
				break;
			}
		}
		for (;;) {
			com[2] = (int) (Math.random() * 10);
			if (com[1] != com[2] && com[0] != com[2]) {
				break;
			}
		}
	}

	private void game() {
		int count = 0;
		int strike;
		int ball;
		while (true) {
			System.out.print("�����Է� : ");
			int myNum = getNumber();
			strike = 0;
			ball = 0;
			my[0] = myNum / 100; // 1
			my[1] = myNum / 10 % 10; // 4
			my[2] = myNum % 10; // 9
			
			System.out.println(Arrays.toString(my));
			System.out.println(Arrays.toString(com));
			// ���ڿ� �ڸ��� ��
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (my[i] == com[j]) {// ���� ���ڶ��..
						if (i == j) {// �ڸ��� ���ٸ�
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			count++;
			// ���
			if (strike != 3) {
				System.out.println(myNum + strike + " strike " + ball + " �� �Դϴ�.");
			} else {
				System.out.println(" ����� " + count + " ������ ���߼̽��ϴ�.");
				System.out.println("��� �Ͻ÷��� [1]�� �׸��Ͻ÷��� [0]�� �Է��Ͻʽÿ�.");
				int end = getNumber();
				if (end == 1) {
					comRandom();
					game();
				} else if (end == 0) {
					System.exit(0);
				} else {
					System.out.println("������ ����Ǿ����ϴ�.");
					System.exit(0);
					
				}

			}

		}
	}

	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return num;
	}

	public static void main(String[] args) {
		NumberBaseball nbb = new NumberBaseball();
		nbb.game();

	}

}
