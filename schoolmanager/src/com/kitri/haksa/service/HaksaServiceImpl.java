package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;






public class HaksaServiceImpl implements HaksaService{
	
	private List<HaksaDto> list = new ArrayList<HaksaDto>();
	private String job[] = {"학번","과목","부서"};
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public HaksaServiceImpl() {
		super();
	}
	
	@Override
	public void menu() {
		int num =0;
		
		System.out.println("========== 메뉴 선택 ==========\n1. 등록\n2. 찾기\n3. 삭제\n4. 전체출력"
				+ "\n -------------\n0. 종료\n ------------\n 번호를 선택해 주세요.. ");
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
		
		System.out.println("========== 메뉴 선택 ==========\n1. 학생\n2. 교수\n3. 관리자\n4. 이전메뉴"
				+ "\n ------------\n 번호를 선택해 주세요.. "+num);
		try {
			num = Integer.parseInt(in.readLine());
			System.out.println("나 이 :");
			age = Integer.parseInt(in.readLine());
			System.out.println("이 름 :");
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
//			학생(나이,이름 학번 출력하고 등록할 수 있어야하는 메쏘드)
//		}else if (num==2) {
//			교수(나이,이름,과목출력하고 등록할 수 있어야하는 메쏘드)
//		}else if (num==3) {
//			관리자(나이,이름,부서 입력창 출력하고 등록할 수 있어야하는 메쏘드)
//		}else if (num==4) {
//			menu();
//		}
		
	}
	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
		System.out.println("등록 완료");
		processExit();
	}
	@Override
	public void findNameMenu() {
		System.out.println("찾을 이름을 입력해 주세요.");
		System.out.println("이름 : "  /*+ 이름입력받는것*/);
		try {
			String name = in.readLine();
			HaksaDto haksaDto =findName(name);
			if(haksaDto == null) {
				return;
			}else {
			System.out.println("이름 : "+haksaDto.getName()+"        나이 : "
			+haksaDto.getAge()+"\t"+job[haksaDto.getKey()]+" : "+haksaDto.getValue());
			}
			System.out.println("검색완료!");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		findName을 이용해서 이름입력받았을시 어쩌고 저쩌고 메소드
//		입력받은 이후에는
			processExit();
	}
	@Override
	public HaksaDto findName(String name) {
//		사람의 이름을 입력받아서 list 에서 찾는 메쏘드
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
		System.out.println("삭제할 사람의 이름을 입력해 주세요.");
		System.out.println("이름 : ");
		String name;
		try {
			name = in.readLine();
			delete(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      		delete를 이용해서 이름을 검색하게되면
		System.out.println(/* */ " 님을 삭제 하였습니다.");
			processExit();
	}
	@Override
	public void delete(String name) {
//		사람의 이름을 입력받아 list 에서 삭제하는 메쏘드
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
		//전체출력하면됨. 포문 돌려서 list목록 출력하면 될듯.
		if(list != null) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("이름 : "+list.get(i).getName()+"        나이 : "
		+list.get(i).getAge()+"\t"+job[list.get(i).getKey()]+" : "+list.get(i).getValue());
		}
		}else {
			processExit();
		}
	}
	@Override
	public void processExit() {
		int num = 0;
		System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해주세요");
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
