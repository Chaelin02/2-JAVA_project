package Constructor;

public class Circle_Main extends circle {

	public static void main(String[] args) {
		 Circle_Main circleInfo = new Circle_Main ();
		  
		  circleInfo.setRadius(5); //���� �������� �־��� ������ ����
		  System.out.println("���� ������ : "+circleInfo.getRadius());
		  System.out.println("���� ���� : "+circleInfo.print_extent());
		  System.out.println("���� �ѷ� : "+circleInfo.print_circumference());
		 }
}
