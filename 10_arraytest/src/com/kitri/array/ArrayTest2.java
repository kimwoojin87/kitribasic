package com.kitri.array;

public class ArrayTest2 {//클래스를 만들고 클래스를 이용한 배열형태의 객체를 생성할 수 있다.

	public static void main(String[] args) {
		Car car[] = new Car[6];// 공간만 만들어 놓는 것 -아직 차가 들어오지 않았다.(주차장 만들어 놓는 것이라고 생각)
								// 생성자를 호출하지 않았기 때문에 아직 차가 만들어지지 않은 것. 그래서 nullpointerexception에러가 난다.
								// new가 나온다고 무조건 객체가 만들어 지는 것이 아니다.
								// 생성자가 나와야 객체가 생성되는것
		car[0] = new Car("쏘나타", "검정색", "현대");// 생성자
		car[1] = new Car("K5", "흰색", "기아");
		car[2] = new Car("SM5", "은색", "삼성");
		car[3] = new Car("아반떼", "흰색", "현대");
		car[4] = new Car("니어로", "비둘기색", "기아");
		car[5] = new Car("산타페", "검정색", "현대");

//		System.out.println(car[0].getCarName());//NullPointerException(.앞에가 null이어서 난다) 에러남 //new했는데 왜 car[0]이 0이야? 

		int len = car.length;
		for (int i = 0; i < len; i++) {
			System.out.println(i + 1 + "번째 구역 : " + car[i]);
		}
		
		
		
		
		

		System.out.println("--------------------------------------------------------------");

//		String name = "니어로";// 비둘기색 니어로(기아)는 5번째에 있습니다.
		String name = "QM5"; //QM5는 없습니다.
		
		Car findCar = null; // Car 타입의 변수를 초기화한다. 
		int count = 0; //밖에 빼는 생각. 
		
		for (int i = 0; i < len; i++) {
			if (name.equals(car[i].getCarName())) {
				findCar = car[i];
				count = i+1; //밖에 있는 조건에는 i가 없기 때문에 count를 새로 만든다.
				break;
			} 
		}
//			else
//				System.out.println(name+ "은 없습니다."); //내가 한거 틀림
		if(findCar != null) {	
		System.out.println(findCar.getColor() + " " + findCar.getCarName() + "(" + findCar.getMaker() + ") 는 "
					+ count + "번째에 있습니다.");	
		}else {
			System.out.println(name+ "은 없습니다.");
		}
		

		
		
//		for (int i = 0; i < len; i++) { 
//			if(name.equals(car[i].getCarName())) {//문자열 같다 비교하지마!!! equals 사용해!
//				System.out.println(car[4].getColor() +" "+ car[4].getCarName() + "("+ car[4].getMaker()+") 는 " + (i+1) + "번째에 있습니다.");
//				
//				break; //이거 없으면 쓸데 없는 for문이 돌아갈 수 있다. 프로그램 성능이 떨어진다.
//				//찾으면 for문 더 돌리지마
//			}
//		}

	}
}
