package com.kitri.array;
// Dto : Data Transfer Object
// Db�� insert������ �� �� ���
// Vo : Value Object
// Bean : �Ხ����
public class PlayerDto {//������ ���� Ŭ���� : ������ Ŭ���� ���� : ���� �������ִ�.
						//���� dto�� private������ getter, setter�θ� �̷�����ִ�.
	private int number; //pk
	private String name;
	private int position;
	private double grade; //�߱��������� ���� //����: ���� ���� ����.(�����) /Ÿ��: ���� ���� ����.

	String[] positionStr= {"����Ÿ��", "����", "����", "1���", "2���", "3���" ,"���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�" };
	
	//1�� ����, 2 ����, 1���, 2���, 3���, ���ݼ� , �ܾ߼�(���ͼ�, �߰߼�, ���ͼ�)
	//1~9
	//����Ÿ�� 0
	//�� 10��
	
	//Ÿ��, ����� 
	//������� ����� (�����ϱ�)
	
	
	
	
	
	public int register() {
		return number;
	}

	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {

		String pStr = positionStr[position];
				
		return "PlayerDto [���ȣ=" + number + ",\t ������=" + name + 
				",\t ������=" + pStr + ",\t Ÿ��=" + grade + "]";
	}
	
}//end PlayerDto

