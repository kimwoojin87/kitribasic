public class Car{
	
	public String carName;//��������
	String color;  //�ʱ�ȭ ���������� �ڵ����� null�� ǥ���.
	String maker;  //
	int speed;     //

	//public Car() {} �����ڸ� ������ ������ ����Ʈ �����ڰ� ���������� �����ִ�. �����ڴ� ����Ÿ���� �����������.

	public void speedUp() {
		speed += 10; //������������ ���������ڸ� ����� �� ����.
	}

	public void speedDown() {
		speed -= 10;
		if(speed<0)    //if,for�� �����ڵ��ϰ�� �߰�ȣ �������� {}
			stop();    //������ Ŭ������ �ڱ� ���ϰ�� ��ü�� �Ƚᵵ��.
	}
	
	public void stop(){
		speed = 0;
	}
	
}