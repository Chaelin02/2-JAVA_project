
public class Ani_Monkey extends Animal {
	//추상메서드는 반드시 오버라이디응ㄹ 해줘야함 
	//자식이 우선순위가 더 높음
	
	public String special() {    //이건 Animal이 사용 못함
		return "긴팔";
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "원숭이";
	}
	
	public String eat() {
		// TODO Auto-generated method stub
		return "바나나";
	}
	
	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "낮";
	}
	
	
}




