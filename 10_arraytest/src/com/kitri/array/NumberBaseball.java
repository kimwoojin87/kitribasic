package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



//0. com,my 3자리 배열생성.
//1. com 세자리 난수 발생. >>comRandom()
//2. 조건 1의 숫자는 중복숫자 안됨,0으로 시작하면 안됨.
//3. 내가 입력한 3자리 숫자를 my 배열에 넣기.
//4. com과 my의 숫자와 자리비교
//	367    159 배열로 바꾸지않는 이상 숫자 자릿수 비교불가능함
//5. 숫자가 같다면
// 5-1 자리수 같다면 strike 증가
// 5-2 자리수 다르다면 ball 증가
//6. strike가 3이라면 : xxx는 x번쨰 만에 정답입니다.계속(1);,종료(0);
//  6-1 strike가 3이 아니라면
//    xxx는 x스트라이크 x볼입니다. >> 3번으로

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
			System.out.print("숫자입력 : ");
			int myNum = getNumber();
			strike = 0;
			ball = 0;
			my[0] = myNum / 100; // 1
			my[1] = myNum / 10 % 10; // 4
			my[2] = myNum % 10; // 9
			
			System.out.println(Arrays.toString(my));
			System.out.println(Arrays.toString(com));
			// 숫자와 자리수 비교
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (my[i] == com[j]) {// 같은 숫자라면..
						if (i == j) {// 자리수 같다면
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			count++;
			// 결과
			if (strike != 3) {
				System.out.println(myNum + strike + " strike " + ball + " 볼 입니다.");
			} else {
				System.out.println(" 당신은 " + count + " 번만에 맞추셨습니다.");
				System.out.println("계속 하시려면 [1]을 그만하시려면 [0]을 입력하십시오.");
				int end = getNumber();
				if (end == 1) {
					comRandom();
					game();
				} else if (end == 0) {
					System.exit(0);
				} else {
					System.out.println("오류로 종료되었습니다.");
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
