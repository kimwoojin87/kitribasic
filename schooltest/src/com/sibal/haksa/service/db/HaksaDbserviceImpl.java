package com.sibal.haksa.service.db;

import java.io.*;
import java.util.ArrayList;

import com.sibal.haksa.data.db.HaksaDto;

public class HaksaDbserviceImpl implements HaksaService{
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	HaksaDao dao = HaksaDao.sharedInstance();
	
	public HaksaDbserviceImpl() {
		super();
		
		dao = new HaksaDao();
	}
	@Override
	public void menu() {
		int num =0;
		System.out.println("========== �޴� ���� ==========\n1. ���\n2. ã��\n3. ����\n4. ��ü���"
				+ "\n -------------\n0. ����\n ------------\n ��ȣ�� ������ �ּ���.. ");
		try {
			num = Integer.parseInt(in.readLine());
			if(num==1) {
				registerMenu();
			}else if (num==2) {
				findNameMenu();
			}else if (num==3) {
				deleteMenu();
			}else if (num==4) {
				selectAll();
			}else if(num==0) {
				processExit();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registerMenu() {
		System.out.println("========== �޴� ����==========");
		System.out.println("1.�л�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.���� �޴�");
		int age;
		String name;
		int key;
		String value;
		int num = 0;
		int inn = 0;
		
		try {
			inn = Integer.parseInt(in.readLine());
			if(inn > 5){
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				registerMenu();
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			registerMenu() ;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			System.out.println(inn);
			System.out.println("��ȣ�� ������ �ּ���.." + inn);

			System.out.println("���� : ");
			age = Integer.parseInt(in.readLine());
			System.out.println("�̸� : ");
			name = in.readLine();
			key = inn; 
			if(key == 1) {
				System.out.println(" " + "�й�" + " : ");
			}else if(key == 2){
				System.out.println(" " + "����" + " : ");
			}else if(key == 3 ) {
				System.out.println(" " + "�μ�" + " : ");
			}
			value = in.readLine();
			HaksaDto haksaDto = new HaksaDto(age,name,key,value);
			dao.register(haksaDto);
			processExit();
		} catch (NumberFormatException e) {

			System.out.println("���̸� �ٽ� �Է����ּ��� ");
			try {
				age = Integer.parseInt(in.readLine());
				System.out.println("�̸� : ");
				name = in.readLine();
				key = inn - 1;
				if(key == 1) {
					System.out.println(" " + "�й�" + " : ");
				}else if(key == 2){
					System.out.println(" " + "����" + " : ");
				}else if(key == 3 ) {
					System.out.println(" " + "�μ�" + " : ");
				}
				value = in.readLine();
				HaksaDto haksaDto = new HaksaDto(age, name,key,value);
				dao.register(haksaDto);
				processExit();
			} catch (Exception e2) {
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void findNameMenu() {
		System.out.println("ã�� �̸��� �Է����ּ���");
		try {

			HaksaDto haksaDto = dao.findName(in.readLine());
			System.out.print("���� : " + haksaDto.getAge());
			System.out.print("\t�̸�  : " + haksaDto.getName());
			System.out.println("\t" + haksaDto.getKeyName() + " : "
					+ haksaDto.getValue());
			processExit();

		} catch (IOException e) {
			e.printStackTrace();
		}catch (NullPointerException e1){
			System.out.println("ã�� �̸��� �����ϴ�. �ٽ� �Է����ּ���.");
			findNameMenu();
		}
	}

	@Override
	public void deleteMenu() {
		System.out.println("������ ����� �̸��� �Է��� �ּ���.");
		try {
			String name = in.readLine();
			if(dao.delete(name)>0) {
				System.out.println(name + " ���� �����Ͽ����ϴ�.");
				processExit();
			}else {
				System.out.println("��������");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectAll() {
		ArrayList<HaksaDto>list = dao.selectAllList();
		
		int leng = list.size();
		for (int i = 0; i < leng; i++) {
			if(list.get(i).getKey() == 1) {
			System.out.print("�̸� : " + list.get(i).getName() + "     ");
			System.out.print("���� : " + list.get(i).getAge() + "     ");
//			System.out.println(list.get(i).getKeyName() + " : "
//					+ list.get(i).getValue());
			System.out.println("�й�" + " : "
					+ list.get(i).getValue());
			}else if(list.get(i).getKey() == 2) {
				System.out.print("�̸� : " + list.get(i).getName() + "     ");
				System.out.print("���� : " + list.get(i).getAge() + "     ");
				System.out.println("����" + " : "
						+ list.get(i).getValue());
			}else if(list.get(i).getKey() == 3) {
				System.out.print("�̸� : " + list.get(i).getName() + "     ");
				System.out.print("���� : " + list.get(i).getAge() + "     ");
				System.out.println("�μ�" + " : "
						+ list.get(i).getValue());
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		processExit();
	}
//�̸� : tt     ���� : 55     ������ : ohyeah
//�̸� : tt     ���� : 55     �й�,�μ�,���� : ohyeah
	@Override
	public void processExit() {
		System.out.println("��� �Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���");
		try {
			int inn = Integer.parseInt(in.readLine());
			if (inn == 0) {
				System.exit(0);
			} else if (inn == 1) {
				menu();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
