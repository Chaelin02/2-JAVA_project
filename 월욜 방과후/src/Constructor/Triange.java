package Constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Triange {
	public static void main(String[] args) {
		// �ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���Ͽ�
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �ֿ� ���� ����
		int underLength, height;		//-- �غ��� ����
		double area;					//-- ����
		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("�ﰢ�� �غ� �Է� : ");
		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ���� underLength�� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�ﰢ�� ���� �Է� : ");
		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		// �� �ﰢ���� ���̸� ���ϴ� ���� ó��
		area = underLength * height / 2.0;
		//-- �Ǽ� �ڷ����� ��������� ������ ��������
		//   �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ 2 �� �ƴ� �Ǽ��� 2.0 ���� ������ ������ �����ϰ� �Ǹ�
		//   �� ������ �Ǽ� ������� ó���ȴ�.
		// ��� ���
		System.out.println(); //-- ����
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n", underLength, height, area);

	}

}


