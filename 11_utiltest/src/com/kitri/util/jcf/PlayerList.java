package com.kitri.util.jcf;

import java.util.*;

public class PlayerList {
//	List<PlayerDto> list = new ArrayList<PlayerDto>();
//Note that this implementation is not synchronized.
//��̸���Ʈ�� �Ϻ��� ������ ������ �� ����.�׷��⿡ �ӵ��� ����.
//�Ϻ��ϰ� 0.000001%�������� ��ġ�� ���ϸ� ���͸� �׿ܿ� ���δ� ��̸���Ʈ��.
	List<PlayerDto> list = new Vector<PlayerDto>(); // ��� ����Ʈ�� �ϳ� ���͸� �ϳ� ����� �Ȱ���.
// ���� ������� �Ȱ��� �� �����ؼ� ����� �ʿ䰡 ������?
//Vector is synchronized. ���ʹ� ����ȭ�� �Ǿ��ִ�. ���� ȣ��� ���� ȣ���ϰ� ���� -> ���� ������� ���ٴ� �Ҹ�.���ʹ� �Ϻ��� ������ �����.
//If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
	private void playeRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}

	private void PlayerList() {
		System.out.println("=== �λ� ��� ����� ===");
		System.out.println("----------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

	}

	private PlayerDto playerSearch(int number) {
		PlayerDto playerDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			PlayerDto dto = list.get(i);
			if (number == dto.getNumber()) {
				playerDto = dto;
				break;
			}
		}

		return playerDto;
	}

	private void playerInfo(PlayerDto playerDto) {
		if (playerDto != null)
			System.out.println(playerDto);
		else
			System.out.println("�� ������ �����ϴ�.");
	}

	public static void main(String[] args) {
		PlayerList pl = new PlayerList();

		pl.playeRegister(new PlayerDto(24, "�����", 4, 0.321));
		pl.playeRegister(new PlayerDto(13, "����", 5, 0.351));
		pl.playeRegister(new PlayerDto(34, "�����", 1, 0.001));
		pl.playeRegister(new PlayerDto(9, "�丣������", 3, 0.421));
		pl.playeRegister(new PlayerDto(38, "�����", 7, 0.384));

		pl.PlayerList();

		int number = 38;
		System.out.println(number + "�� ���� ����!!");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);

		number = 13;
		double score = 0.357;
		pl.playerSearch(13);

		System.out.println(number + "�� ������ ��Ÿ!!!! Ÿ���� " + score + "�� ����");
		playerDto = pl.playerSearch(number);
		playerDto.setGrade(score);
		pl.playerInfo(playerDto);

		pl.PlayerList();// ����Ʈ �ȿ� ����ִ°� ���۷����� ����Ǵ°��� ��ü�� ī�ǵǴ� ���� �ƴϴ�.

	}

}
