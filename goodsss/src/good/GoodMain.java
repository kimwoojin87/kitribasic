package good;

import java.sql.Date;
import java.util.*;

public class GoodMain {

	public static void main(String[] args) {
		Dao dao = Dao.sharedInstance();

		Good dto = new Good();
//		�߰�����
//		dto.setCode("7");
//		dto.setName("õ�Ͽ�");
//		dto.setManufacture("�žȱ�");
//		dto.setPrice(10000);
//
//		// 2015�� 1�� 10���� java.sql.dateŸ�� ��ü�� ����
		Calendar cal = new GregorianCalendar(2017, 1, 10);
		Date date = new Date(cal.getTimeInMillis());
//		dto.setMakingdate(date);
//
//		boolean r = dao.InsertGood(dto);
//		if (r) {
//			System.out.println("���Կ� ������");
//		} else {
//			System.out.println("���Կ� ������");
//		}
		
//		��������
//		dto.setCode("7");
//		boolean r = dao.DeleteGood(dto);
//		if(r) {
//			System.out.println("���� ����!!");
//		}else {
//			System.out.println("���� ����!!");
//		}
//		
//		��������
		dto.setCode("006");
		dto.setName("�����");
		dto.setManufacture("�Ϻ�");
		dto.setPrice(7000);
		dto.setMakingdate(date);
//		dto.setCode("5");
		boolean r = dao.modifyGood(dto,"007");
		if(r) {
			System.out.println("���� ����!!");
		}else {
			System.out.println("���� ���� !!");
		}

		List<Good> list = dao.getlist();
		for (Good good : list) {
			System.out.println(good);
		}
	}

}
