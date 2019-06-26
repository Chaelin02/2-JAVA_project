package Constructor;

public class Car {
	String company="현대";
	String model="람보르기니";
	String color="파란색";
	int maxspeed=100;
	int speed=30;	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void print() {
		System.out.println("제작회사:"+company);
		System.out.println("모델명:"+model);
		System.out.println("색상:"+color);
		System.out.println("최고속도:"+maxspeed);
		System.out.println("현재속도:"+speed);
	}
}
