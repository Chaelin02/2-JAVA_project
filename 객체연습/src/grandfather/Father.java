package grandfather;
public class Father extends GrandFa {
	
	private int nai =55;
	private int house=1;
	public String gabo="Ȳ�ݵ���";
	
	public Father() {
		super();
		System.out.println("�ƹ��� ������");
	}

	public Father(int nai) {
		super();
		this.nai = nai;
	}

	public int getNai() { //��������
		return nai;
	}

	public int getHouse() { //��������
		return house;
	}
	
	public String say() {
		return "�ƹ��� ���� : �λ��� ��ܶ�~";
	}
	
	public void show() {
		System.out.println(this.gabo);     //���� �ƹ�����
		System.out.println(super.gabo);  //�ƺ���  //�Ҿƹ�����. 
		System.out.println("�ƹ��� ����:"+this.getNai());
		System.out.println("�Ҿƹ��� ����:"+super.getNai());
		System.out.println(say());
	}
}