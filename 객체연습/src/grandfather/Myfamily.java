package grandfather;

public class Myfamily {

	public static void main(String[] args) {
		
//		Father father = new Father();
//		father.show();
		
//		Me me = new Me();
		GrandFa gr = new GrandFa();
		System.out.println("����:"+gr.gabo);
		System.out.println("����:"+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.eat());
		System.out.println("�Ҿƹ�������:"+gr.getNai());   //��������
		//System.out.println("�Ҿƹ������� ����:"+gr.setNai());  set�� ���� �ʾƼ� ������ == ��������
		
		System.out.println();
		System.out.println("=================================");
		GrandFa gr1= new GrandFa(99);  //������ �����ε�
		System.out.println("���Ҿƹ��� ���� : "+gr1.getNai());
		System.out.println("���� : "+gr1.gabo);

		System.out.println("==========��ӽ���============");
		Father fa = new Father();
		System.out.println("�ƹ��� ����:"+fa.getNai());
		System.out.println("�ƹ��� ��"+fa.getHouse());    //Father�� ��������.
		System.out.println("���� : "+fa.gabo);
		System.out.println("���� :"+fa.gahun);   //father�� �����ϱ� grandFa���� ��µȴ�. 
		System.out.println(fa.say());
		System.out.println(fa.eat());  //father��� grandfa�� 
		System.out.println("======================================");
		fa.show();
		System.out.println("=====================================");
		
		System.out.println();
		System.out.println("===============Me====================");
		Me me = new Me();
		
		System.out.println("���� : "+me.getHouse());  //�ƹ����� ���پ�
		System.out.println("�� ���� : "+me.gabo);
		System.out.println("���� : "+me.gahun);  //�Ҿƺ���
		System.out.println(me.say());
		System.out.println(me.eat());
		me.biking();
		
		System.out.println("============================");
//		fa.biking();   //fa���� biking�޼ҵ尡 ��� ������
		// gr.biking();
		
		//GrandFa gr2 = new Father();
		Father fa1 = new Me();   //���Ⱑ ���߿�
		Me me1 = (Me)fa1;
		me1.biking();  //���� ���ϴ°� ������
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
