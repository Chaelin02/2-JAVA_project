package Constructor;

public class Car {
	String company="����";
	String model="���������";
	String color="�Ķ���";
	int maxspeed=100;
	int speed=30;	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void print() {
		System.out.println("����ȸ��:"+company);
		System.out.println("�𵨸�:"+model);
		System.out.println("����:"+color);
		System.out.println("�ְ�ӵ�:"+maxspeed);
		System.out.println("����ӵ�:"+speed);
	}
}
