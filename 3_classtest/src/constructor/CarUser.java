package constructor;

public class CarUser{
	public static void main(String[] args) {
		Car car1 = new Car();
//		System.out.println("car1. ���̸� : " + car1.carName + " ����: " + car1.color +" ������: " + car1.maker);
		System.out.println(car1.info());
		Car car2 = new Car("���");
//		System.out.println("car2. ���̸� : " + car2.carName + " ����: " + car2.color +" ������: " + car2.maker);
		System.out.println(car2.info());
		Car car3 = new Car("�׷���","�ʷϻ�");
//		System.out.println("car3. ���̸� : " + car3.carName + " ����: " + car3.color +" ������: " + car3.maker);
		System.out.println(car3.info());
		Car car4 = new Car("k5","����","���");
//		System.out.println("car4. ���̸� : " + car4.carName + " ����: " + car4.color +" ������: " + car4.maker);
		System.out.println(car4.info());
		System.out.println("car4�� �ӵ��� 3ȸ ����!!");
		for(int i=0;i<3;i++)
			car4.speedUp();
		System.out.println("car4 �ӵ� : " + car4.speed);

		System.out.println("car4�� �ӵ��� 85 ����!!");
		int speed = car4.speedUp(85);
		System.out.println("car4 �ӵ� : " + speed);
		System.out.println("car4 �ӵ� : " + car4.speed);
	}
}