package grandfather;
 //�������� : ������ ������ ���� �ִ� ����� ���ٰ����� ��  public,private��� 
// ĸ��ȭ�� �� �� .
public class GrandFa {
	private int nai = 80;						//����
	public String gabo = "��û��";				//��ΰ�
	protected String gahun = "��� �Ͽ� �ּ���";    //�� ���� ������
		
//������Ʈ�� ��ü�� ����� �ְ� 
// ���������ϱ� ���ؼ� �ߺ��� �ҽ��� �ּ�ȭ�ض�
	
		public GrandFa() {
			System.out.println("�Ҿƹ��� ������");
		}
		
		public GrandFa(int nai) {
			this();   //�����ڸ� �ǹ��ϴ� this.   //�ߺ��� �ҽ��� �ּ�ȭ�ϱ� ���ؼ� ����
			//this()�ȿ� �ƹ��͵� �����ϱ� GrandFa�� ����.
			this.nai = nai;   //�ڱ��ڽ��� �ǹ��ϴ� this
		}
		public String say() {
			return "�Ҿƹ��� ���� : �������� ��ܶ�~~~";
		}
	
		public String eat() {
			return "���� ���ְ� ����~~";
		}

		public int getNai() {   //�������п� ���� get�� ��� ���� 
			return nai; 
		}
	
	}
