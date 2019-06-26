package 객체연습;

public class PhysicalInfo {
	public String name;
	public int age;
	public float height, weight;
	
	public PhysicalInfo(String name,int age, float height,float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
//	하나만 알아도 만들수 있다. =>오버로딩
//	parameter로 받은 age
	void update(int age) {  //update는 메서드
		this.age=age;
	}
	
	void update(int age,float height) {
		this.age=age;
		this.height = height;
	}
	
	void update(int age, float height , float weight) {
		this.age=age;
		this.height = height;
		this.weight = weight;
	}
	
	//다양한 형태를 제공받을 수 있다. 
	
}
