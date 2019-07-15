package freetest6;


import java.util.ArrayList;
import java.util.List;



public class DramaArrayTest {

	public static void main(String[] args) {
		List<Drama> list = new ArrayList<Drama>();
		
		
		list.add(new Drama("그 겨울 바람이 분다","SBS","김규태","조인성","송혜교"));
		list.add(new Drama("백년의 유산","MBC","주성우"));
		list.add(new Drama("아이리스2","KBS","김규태","표민수","이다해"));
		list.add(new Drama("최고다 이순신","KBS","윤성식",null,"아이유"));
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+""+list.get(i));
		}
		
		

	}

}
