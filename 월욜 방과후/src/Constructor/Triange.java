package Constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Triange {
	public static void main(String[] args) {
		// 외부로부터 데이터를 입력받도록 처리하기 위하여
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 주요 변수 선언
		int underLength, height;		//-- 밑변과 높이
		double area;					//-- 넓이
		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("삼각형 밑변 입력 : ");
		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후 변수 underLength에 담아내기
		underLength = Integer.parseInt(br.readLine());
		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("삼각형 높이 입력 : ");
		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후 변수 height에 담아내기
		height = Integer.parseInt(br.readLine());
		// ⑤ 삼각형의 넓이를 구하는 연산 처리
		area = underLength * height / 2.0;
		//-- 실수 자료형이 결과값으로 나오는 과정에서
		//   실수 기반의 연산이 필요한 상황이다.
		//   정수형 2 가 아닌 실수형 2.0 으로 나눗셈 연산을 수행하게 되면
		//   이 연산은 실수 기반으로 처리된다.
		// 결과 출력
		System.out.println(); //-- 개행
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n", underLength, height, area);

	}

}


