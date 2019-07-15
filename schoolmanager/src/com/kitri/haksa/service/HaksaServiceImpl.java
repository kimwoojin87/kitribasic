package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;






public class HaksaServiceImpl implements HaksaService{
	
	private List<HaksaDto> list = new ArrayList<HaksaDto>();
	private String job[] = {"�й�","����","�μ�"};
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public HaksaServiceImpl() {
		super();
	}
	
	@Override
	public void menu() {
		int num =0;
		
		System.out.println("========== �޴� ���� ==========\n1. ���\n2. ã��\n3. ����\n4. ��ü���"
				+ "\n -------------\n0. ����\n ------------\n ��ȣ�� ������ �ּ���.. ");
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(num==1) {
			registerMenu();
		}else if (num==2) {
			findNameMenu();
		}else if (num==3) {
			deleteMenu();
		}else if (num==4) {
			seletAll();
		}else if(num==0) {
			processExit();
		}
		
	}
	@Override
	public void registerMenu() {
		int num =0;
		int age;
		String name;
		int key;
		String value;
		
		System.out.println("========== �޴� ���� ==========\n1. �л�\n2. ����\n3. ������\n4. �����޴�"
				+ "\n ------------\n ��ȣ�� ������ �ּ���.. "+num);
		try {
			num = Integer.parseInt(in.readLine());
			System.out.println("�� �� :");
			age = Integer.parseInt(in.readLine());
			System.out.println("�� �� :");
			name = in.readLine();
			key = num-1;
			System.out.println(" "+job[key]+" :");
			value = in.readLine();
			
			
			HaksaDto haksaDto = new HaksaDto(age, name, num-1, value);
			register(haksaDto);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		if(num==1) {
//			�л�(����,�̸� �й� ����ϰ� ����� �� �־���ϴ� �޽��)
//		}else if (num==2) {
//			����(����,�̸�,��������ϰ� ����� �� �־���ϴ� �޽��)
//		}else if (num==3) {
//			������(����,�̸�,�μ� �Է�â ����ϰ� ����� �� �־���ϴ� �޽��)
//		}else if (num==4) {
//			menu();
//		}
		
	}
	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
		System.out.println("��� �Ϸ�");
		processExit();
	}
	@Override
	public void findNameMenu() {
		System.out.println("ã�� �̸��� �Է��� �ּ���.");
		System.out.println("�̸� : "  /*+ �̸��Է¹޴°�*/);
		try {
			String name = in.readLine();
			HaksaDto haksaDto =findName(name);
			if(haksaDto == null) {
				return;
			}else {
			System.out.println("�̸� : "+haksaDto.getName()+"        ���� : "
			+haksaDto.getAge()+"\t"+job[haksaDto.getKey()]+" : "+haksaDto.getValue());
			}
			System.out.println("�˻��Ϸ�!");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		findName�� �̿��ؼ� �̸��Է¹޾����� ��¼�� ��¼�� �޼ҵ�
//		�Է¹��� ���Ŀ���
			processExit();
	}
	@Override
	public HaksaDto findName(String name) {
//		����� �̸��� �Է¹޾Ƽ� list ���� ã�� �޽��
		HaksaDto haksaDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if(name.equals(list.get(i).getName())) {
				haksaDto = list.get(i);
				return haksaDto;
			}
		}
		return haksaDto;
	}
	@Override
	public void deleteMenu() {
		System.out.println("������ ����� �̸��� �Է��� �ּ���.");
		System.out.println("�̸� : ");
		String name;
		try {
			name = in.readLine();
			delete(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      		delete�� �̿��ؼ� �̸��� �˻��ϰԵǸ�
		System.out.println(/* */ " ���� ���� �Ͽ����ϴ�.");
			processExit();
	}
	@Override
	public void delete(String name) {
//		����� �̸��� �Է¹޾� list ���� �����ϴ� �޽��
		HaksaDto haksaDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getName());
				list.remove(i);
				break;
			}
		}

	}
	@Override
	public void seletAll() {
		//��ü����ϸ��. ���� ������ list��� ����ϸ� �ɵ�.
		if(list != null) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("�̸� : "+list.get(i).getName()+"        ���� : "
		+list.get(i).getAge()+"\t"+job[list.get(i).getKey()]+" : "+list.get(i).getValue());
		}
		}else {
			processExit();
		}
	}
	@Override
	public void processExit() {
		int num = 0;
		System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է����ּ���");
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(num == 1) {
			menu();
		}else if (num == 0) {
			System.exit(0);
		}
		
	}
	
	

	
}
