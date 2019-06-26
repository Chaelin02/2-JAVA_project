package grandfather;

public class Myfamily {

	public static void main(String[] args) {
		
//		Father father = new Father();
//		father.show();
		
//		Me me = new Me();
		GrandFa gr = new GrandFa();
		System.out.println("가보:"+gr.gabo);
		System.out.println("가훈:"+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.eat());
		System.out.println("할아버지나이:"+gr.getNai());   //정보은닉
		//System.out.println("할아버지나이 설정:"+gr.setNai());  set은 주지 않아서 에러남 == 정보은닉
		
		System.out.println();
		System.out.println("=================================");
		GrandFa gr1= new GrandFa(99);  //생성자 오버로딩
		System.out.println("새할아버지 나이 : "+gr1.getNai());
		System.out.println("가보 : "+gr1.gabo);

		System.out.println("==========상속시작============");
		Father fa = new Father();
		System.out.println("아버지 나이:"+fa.getNai());
		System.out.println("아버지 집"+fa.getHouse());    //Father만 갖고있음.
		System.out.println("가보 : "+fa.gabo);
		System.out.println("가훈 :"+fa.gahun);   //father가 없으니까 grandFa꺼가 출력된다. 
		System.out.println(fa.say());
		System.out.println(fa.eat());  //father없어서 grandfa꺼 
		System.out.println("======================================");
		fa.show();
		System.out.println("=====================================");
		
		System.out.println();
		System.out.println("===============Me====================");
		Me me = new Me();
		
		System.out.println("내집 : "+me.getHouse());  //아버지꺼 갖다씀
		System.out.println("내 가보 : "+me.gabo);
		System.out.println("가훈 : "+me.gahun);  //할아벚꺼
		System.out.println(me.say());
		System.out.println(me.eat());
		me.biking();
		
		System.out.println("============================");
//		fa.biking();   //fa에는 biking메소드가 없어서 에서뜸
		// gr.biking();
		
		//GrandFa gr2 = new Father();
		Father fa1 = new Me();   //여기가 개중요
		Me me1 = (Me)fa1;
		me1.biking();  //동의 구하는거 다형성
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
