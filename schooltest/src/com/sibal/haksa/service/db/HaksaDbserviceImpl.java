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
		System.out.println("========== 메뉴 선택 ==========\n1. 등록\n2. 찾기\n3. 삭제\n4. 전체출력"
				+ "\n -------------\n0. 종료\n ------------\n 번호를 선택해 주세요.. ");
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
		System.out.println("========== 메뉴 선택==========");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전 메뉴");
		int age;
		String name;
		int key;
		String value;
		int num = 0;
		int inn = 0;
		
		try {
			inn = Integer.parseInt(in.readLine());
			if(inn > 5){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				registerMenu();
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			registerMenu() ;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			System.out.println(inn);
			System.out.println("번호를 선택해 주세요.." + inn);

			System.out.println("나이 : ");
			age = Integer.parseInt(in.readLine());
			System.out.println("이름 : ");
			name = in.readLine();
			key = inn; 
			if(key == 1) {
				System.out.println(" " + "학번" + " : ");
			}else if(key == 2){
				System.out.println(" " + "과목" + " : ");
			}else if(key == 3 ) {
				System.out.println(" " + "부서" + " : ");
			}
			value = in.readLine();
			HaksaDto haksaDto = new HaksaDto(age,name,key,value);
			dao.register(haksaDto);
			processExit();
		} catch (NumberFormatException e) {

			System.out.println("나이를 다시 입력해주세요 ");
			try {
				age = Integer.parseInt(in.readLine());
				System.out.println("이름 : ");
				name = in.readLine();
				key = inn - 1;
				if(key == 1) {
					System.out.println(" " + "학번" + " : ");
				}else if(key == 2){
					System.out.println(" " + "과목" + " : ");
				}else if(key == 3 ) {
					System.out.println(" " + "부서" + " : ");
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
		System.out.println("찾을 이름을 입력해주세요");
		try {

			HaksaDto haksaDto = dao.findName(in.readLine());
			System.out.print("나이 : " + haksaDto.getAge());
			System.out.print("\t이름  : " + haksaDto.getName());
			System.out.println("\t" + haksaDto.getKeyName() + " : "
					+ haksaDto.getValue());
			processExit();

		} catch (IOException e) {
			e.printStackTrace();
		}catch (NullPointerException e1){
			System.out.println("찾는 이름이 없습니다. 다시 입력해주세요.");
			findNameMenu();
		}
	}

	@Override
	public void deleteMenu() {
		System.out.println("삭제할 사람의 이름을 입력해 주세요.");
		try {
			String name = in.readLine();
			if(dao.delete(name)>0) {
				System.out.println(name + " 님을 삭제하였습니다.");
				processExit();
			}else {
				System.out.println("삭제실패");
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
			System.out.print("이름 : " + list.get(i).getName() + "     ");
			System.out.print("나이 : " + list.get(i).getAge() + "     ");
//			System.out.println(list.get(i).getKeyName() + " : "
//					+ list.get(i).getValue());
			System.out.println("학번" + " : "
					+ list.get(i).getValue());
			}else if(list.get(i).getKey() == 2) {
				System.out.print("이름 : " + list.get(i).getName() + "     ");
				System.out.print("나이 : " + list.get(i).getAge() + "     ");
				System.out.println("과목" + " : "
						+ list.get(i).getValue());
			}else if(list.get(i).getKey() == 3) {
				System.out.print("이름 : " + list.get(i).getName() + "     ");
				System.out.print("나이 : " + list.get(i).getAge() + "     ");
				System.out.println("부서" + " : "
						+ list.get(i).getValue());
			}else {
				System.out.println("잘못된 양식입니다.");
			}
		}
		processExit();
	}
//이름 : tt     나이 : 55     관리자 : ohyeah
//이름 : tt     나이 : 55     학번,부서,과목 : ohyeah
	@Override
	public void processExit() {
		System.out.println("계속 하시려면 1, 종료하시려면 0을 입력해 주세요");
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
