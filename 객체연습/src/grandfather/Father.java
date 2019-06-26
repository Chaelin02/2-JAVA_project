package grandfather;
public class Father extends GrandFa {
	
	private int nai =55;
	private int house=1;
	public String gabo="황금돼지";
	
	public Father() {
		super();
		System.out.println("아버지 생성자");
	}

	public Father(int nai) {
		super();
		this.nai = nai;
	}

	public int getNai() { //정보은닉
		return nai;
	}

	public int getHouse() { //정보은닉
		return house;
	}
	
	public String say() {
		return "아버지 말씀 : 인생을 즐겨라~";
	}
	
	public void show() {
		System.out.println(this.gabo);     //내꺼 아버지꺼
		System.out.println(super.gabo);  //아빠꺼  //할아버지꺼. 
		System.out.println("아버지 나이:"+this.getNai());
		System.out.println("할아버지 나이:"+super.getNai());
		System.out.println(say());
	}
}