
public class Ani_Find  {
	
	//public String Animal;
		
	public void find(Animal a) {
		if (a instanceof Ani_Monkey) {
			Ani_Monkey monkey = (Ani_Monkey)a;
				System.out.println(monkey.special()+a.name()+"��"+a.action()+"��"
				+a.eat()+"�� �Խ��ϴ�.");	
		}
		else if (a instanceof Ani_Rabbit) {
			Ani_Rabbit rabbit = (Ani_Rabbit)a;  
				System.out.println(rabbit.run() + " " + a.name()+"��"+a.action()+"��"
						+a.eat()+"�� �Խ��ϴ�.");
		}
		
		
		
	
	}
	
//		Ani_Monkey monkey = (Ani_Monkey)a;  //�ٿ� ĳ���� �ڽ��� ������ �ִ� �޼��忡 �����ϴ� ���

	
	
//	Ani_Rabbit rabbit = (Ani_Rabbit)a;  ������ ������ �ȳ����� �����Ҷ� ������
//	public void find(Ani_Rabbit rabbit ) {
//		System.out.println(rabbit.run() + " " + rabbit.name()+"��"+rabbit.action()+"��"
//				+rabbit.eat()+"�� �Խ��ϴ�.");
//	}
}