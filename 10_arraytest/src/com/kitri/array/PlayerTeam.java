package com.kitri.array;

public class PlayerTeam {
	public static void main(String[] args) {
		//1�� ����, 2 ����, 1���, 2���, 3���, ���ݼ� , �ܾ߼�(���ͼ�, �߰߼�, ���ͼ�)
		//1~9
		//����Ÿ�� 0
		//�� 10��
		
		//Ÿ��, ����� 
		//������� ����� (�����ϱ�)
		
		PlayerDto[] player = new PlayerDto[5];//�迭���� �۰� �Է��Ǹ� ���� �ȳ����� ������ ������
		player [0] = new PlayerDto(24, "�����", 4, 0.321);
		player [1] = new PlayerDto(13, "����",5 , 0.351);
		player [2] = new PlayerDto(34, "�����", 1, 0.001);
		player [3] = new PlayerDto(9, "�丣������", 3, 0.421);
		player [4] = new PlayerDto(38, "�����", 7, 0.384);
		
		int len = player.length;
		for(int i=0; i<len ; i++) { //�޸𸮸� 5�� �Դٰ��� �ؾ��Ѵ�. //��ȿ��
			
		}
		//�޸� ����Ƚ���� length��ŭ ����ȴ�.
		for(int i=0; i<player.length; i++) {
			
		}
		
		
		//myfor ctrl + space �ڵ��ϼ� ����� -> ���� window preference java editor template for �� ���� ���� ���� ����� myfor
		for (int i = 0; i < len; i++) {
			System.out.println(player[i]);
		}
		
	}
}
