package 객체연습;

public class PhysicalInfoMain {
//  static 메소드 호출을 해야만
	public static void main(String[] args) {
		PhysicalInfo obj;
		obj = new PhysicalInfo("해리", 10 , 132.0f , 35.0f );
		printPhysicalInfo(obj);
		
		obj.update(11, 145.0f, 45.0f);
		printPhysicalInfo(obj);
		
		obj.update(12, 157.0f);
		printPhysicalInfo(obj);
		
		obj.update(13);
		printPhysicalInfo(obj);
		
		
		} //main
	
	 static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : "+obj.name);
		System.out.println("나이 : "+obj.age);
		System.out.println("키 : "+obj.height);
		System.out.println("몸무게 : "+obj.weight);
		System.out.println();	

	}

}
