package grandfather;
 //정보은닉 : 정당한 권한을 갖고 있는 사람만 접근가능한 것  public,private등등 
// 캡슐화를 한 것 .
public class GrandFa {
	private int nai = 80;						//나만
	public String gabo = "상감청자";				//모두가
	protected String gahun = "모든 일에 최선을";    //나 포함 가족만
		
//오브젝트를 객체로 만들어 주고 
// 유지보수하기 위해서 중복된 소스를 최소화해라
	
		public GrandFa() {
			System.out.println("할아버지 생성자");
		}
		
		public GrandFa(int nai) {
			this();   //생성자를 의미하는 this.   //중복된 소스를 최소화하기 위해서 쓴다
			//this()안에 아무것도 없으니까 GrandFa로 간다.
			this.nai = nai;   //자기자식을 의미하는 this
		}
		public String say() {
			return "할아버지 말씀 : 어려울수록 즐겨라~~~";
		}
	
		public String eat() {
			return "밥은 맛있게 먹자~~";
		}

		public int getNai() {   //정보은닉에 의해 get만 사용 가능 
			return nai; 
		}
	
	}
