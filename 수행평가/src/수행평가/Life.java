package 수행평가;

import java.util.Scanner;

public class Life {
	public void life() {

		String[] tema = { "0.교무실에서 \n1.교실에서", null, "0.패스트푸드점에서\n1.쇼핑할때\n2.대중교통을 이용할때", null };

		String tema_li = "\n 0.뭐하고 지냈어\n 1.가끔 만나고 지내자\n 2.안녕, 오랜만이야\n 3. 바빠 죽겠어.";

		String sc_go_1lang[] = {
				"[뭐하고 지냈어] \n 영어: What have you been up to?(왓 해브 유 빈 업 투) \n \r" + " 중국어: 做什么过(푸어 샹 마 그어)\n \r"
						+ "일본어: 何して過ごしたの(나니 시테 스고시타노)\n \r" + " 스페인어: ¿Qué has hecho?(큐아세츄)\n \r"
						+ " 프랑스어: Qu'est-ce que tu as fait ?(케스큐 츄에 펫?)",
				"[가끔 만나고 지내자 ] \n   영어: Let's meet once in a while.(렛스 밋 원스 인 어 와일)\n \r"
						+ " 중국어: 偶尔见面吧(오 알 치엔 밍 빠)\n \r" + " 일본어: たまには会って過ごそう(타마니와 앗테 스고소오)\n \r"
						+ "스페인어: Nos vemos de vez en cuando.(노스 베모스 데 벵 덴꼬안노)\n \r"
						+ "프랑스어: On se voit de temps en temps.(온 스 부앗도 돔 송 통) ",
				"[안녕, 오랜만이야] \n  영어: Hi, long time no see. (하이 롱 타임 노우 시)\n \r"
						+ "중국어: 嗨,好久不见了,我真想你了(하이 하우 치오 붕 취엔 라 워 쯩 시앙니라)\n \r" + "일본어: こんにちは,久しぶりだね(콘니치와 히사시부리다네)\n \r"
						+ "스페인어: Hola, ha pasado mucho tiempo.(올라 아빠 무체 시엔포)\n \r"
						+ "프랑스어:Bonjour, ça fait longtemps.(봉쥬르 셰피 롱 뎀프)",
				"[바빠 죽겠어 ]\n    영어: I'm so busy. (아임 소우 비지)\n \r" + "중국어: 忙死了 (망 쓸라)\n \r"
						+ " 일본어: 忙しくてたまらない(이송가시쿠테 타마라나이)\n \r" + "스페인어: Estoy ocupada.(에이스띠오 꾸 빠라)\n \r"
						+ "프랑스어: Je suis occupé. Je meurs.(쥬 시어 큐핏 쥼마)" };

		Scanner sc = new Scanner(System.in);

		System.out.print(tema_li);
		int User_B = sc.nextInt();
		System.out.print(sc_go_1lang[User_B]);
		System.out.println();

	}

}// main
// }
