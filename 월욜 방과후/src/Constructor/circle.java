package Constructor;
//������ ���� �ݰ� ���� Ŭ������ �ּ� ���� ������ ���� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
public class circle {

		 double radius;
		 
		 public circle(){
		  this.radius = 0;
		 }
		 public double getRadius() {
		  return radius;
		 }

		 public void setRadius(double radius) {
		  this.radius = radius;
		 }
		 
		 public double print_extent(){ //���� ���� ��ȯ
		  return radius*radius*Math.PI;
		 }
		 
		 public double print_circumference(){ //���� �ѷ� ��ȯ
		  return 2*radius*Math.PI;
		 }
		
	}


