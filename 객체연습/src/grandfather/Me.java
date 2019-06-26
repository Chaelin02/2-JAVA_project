package grandfather;
// final 을 붙이면 상속하지 못한다. 
public class Me extends Father {
	public Me() {
		System.out.println("내 생성자");
	}
	
	public void biking() {
		System.out.println("자전거로 전국일주~~");
	}
}
