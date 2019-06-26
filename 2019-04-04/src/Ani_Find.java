
public class Ani_Find  {
	
	//public String Animal;
		
	public void find(Animal a) {
		if (a instanceof Ani_Monkey) {
			Ani_Monkey monkey = (Ani_Monkey)a;
				System.out.println(monkey.special()+a.name()+"는"+a.action()+"에"
				+a.eat()+"를 먹습니다.");	
		}
		else if (a instanceof Ani_Rabbit) {
			Ani_Rabbit rabbit = (Ani_Rabbit)a;  
				System.out.println(rabbit.run() + " " + a.name()+"는"+a.action()+"에"
						+a.eat()+"를 먹습니다.");
		}
		
		
		
	
	}
	
//		Ani_Monkey monkey = (Ani_Monkey)a;  //다운 캐스팅 자식이 가지고 있는 메서드에 접근하는 방법

	
	
//	Ani_Rabbit rabbit = (Ani_Rabbit)a;  문법상 에러는 안나지만 실행할때 에러남
//	public void find(Ani_Rabbit rabbit ) {
//		System.out.println(rabbit.run() + " " + rabbit.name()+"는"+rabbit.action()+"에"
//				+rabbit.eat()+"를 먹습니다.");
//	}
}