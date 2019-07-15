package freetest5;

import java.util.ArrayList;
import java.util.List;

public class SonataArrayTest {

	public static void main(String[] args) {
		
		Sonata car1 = new Sonata("Èò»ö",5000,"½Â¿ë","NF");
		Sonata car2 = new Sonata("Àº»ö",7000,"¾÷¹«","Brilliant");
		Sonata car3 = new Sonata("°¨È«»ö",4000,"ÅÃ½Ã","EF");
		Sonata car4 = new Sonata("°ËÁ¤»ö",6000,"½Â¿ë","Hybrid");
		
		List<String> list = new ArrayList<String>();
		list.add(car1.toString());
		list.add(car2.toString());
		list.add(car3.toString());
		list.add(car4.toString());
		
		int size=list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+list.get(i));
		}
		

	}

}
