package ��ü����;

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
//	�ϳ��� �˾Ƶ� ����� �ִ�. =>�����ε�
//	parameter�� ���� age
	void update(int age) {  //update�� �޼���
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
	
	//�پ��� ���¸� �������� �� �ִ�. 
	
}
