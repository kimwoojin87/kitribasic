package good;

import java.sql.Date;
import java.util.*;

public class GoodMain {

	public static void main(String[] args) {
		Dao dao = Dao.sharedInstance();

		Good dto = new Good();
//		추가구문
//		dto.setCode("7");
//		dto.setName("천일염");
//		dto.setManufacture("신안군");
//		dto.setPrice(10000);
//
//		// 2015년 1월 10일을 java.sql.date타입 객체로 생성
		Calendar cal = new GregorianCalendar(2017, 1, 10);
		Date date = new Date(cal.getTimeInMillis());
//		dto.setMakingdate(date);
//
//		boolean r = dao.InsertGood(dto);
//		if (r) {
//			System.out.println("삽입에 성공함");
//		} else {
//			System.out.println("삽입에 실패함");
//		}
		
//		삭제구문
//		dto.setCode("7");
//		boolean r = dao.DeleteGood(dto);
//		if(r) {
//			System.out.println("삭제 성공!!");
//		}else {
//			System.out.println("삭제 실패!!");
//		}
//		
//		수정구문
		dto.setCode("006");
		dto.setName("장아찌");
		dto.setManufacture("일본");
		dto.setPrice(7000);
		dto.setMakingdate(date);
//		dto.setCode("5");
		boolean r = dao.modifyGood(dto,"007");
		if(r) {
			System.out.println("수정 성공!!");
		}else {
			System.out.println("수정 실패 !!");
		}

		List<Good> list = dao.getlist();
		for (Good good : list) {
			System.out.println(good);
		}
	}

}
