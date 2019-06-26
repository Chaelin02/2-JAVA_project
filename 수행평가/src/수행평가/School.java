package 수행평가;

import java.util.Scanner;

public class School {

	public void school() {
		String[] tema = { "0.교무실에서 \n1.교실에서", null, "0.패스트푸드점에서\n1.쇼핑할때\n2.대중교통을 이용할때", null };

		String[] tema_go = { "0. 선생님 여쭈어볼게 있어요\n 1.들어가도 될까요?\n 2.선생님 계신가요?\n 3.안녕히계세요",
				"0.문 좀 닫아줘 \n 1.이것 좀 주워주라\n 2.다음 과목이 뭐야?\n 3.조용히 좀 해주라" };

		String sc_go_1lang[] = {
				"[선생님 여쭈어 볼게 있어요] \n   	<영어> - I need to ask you something.(아이 니드 투 에스크 유 섬띵)\r\n"
						+ "	<일본어> - 先生,聞きたいことがあります。(센세이 키키타이 코토가 아리마스)\r\n"
						+ "	<프랑스어> -J'ai une question.(주에잉 퀘스치용)\r\n" 
						+ "	<중국어> -老师,我有话要说。(라오쉬 워요 화야우 슈어)\r\n"
						+ "	<스페인어> - Profesor, tengo algo que preguntar.(프로프소어 텡고 아르고 쿠 프레공타ㄹ)",
				"[들어가도 될까요?] \n <영어> - May I come in? (메이 아이 컴 인)\r\n" 
						+ " <일본어> - 入ってもいいですか。(하잇 테모 이이데스카)\r\n"
						+ " <프랑스어> -Est-ce que je peux entrer?(에스 츠 크 쥬 푸쉉 엔트위?)\r\n"
						+ " <중국어> - 我可以进去吗？ (워커이 이친 슈마)\r\n" 
						+ " <스페인어> - Puedo entrar? (푸에도 엔트롸)",
				"[선생님 계신가요?] \n 	<영어> - Is there a teacher? (이즈 데얼 어 티쳘?)\r\n"
						+ " <일본어> - 先生いらっしゃいますか? (센세이 이랏샤이 마스카?)\r\n"
						+ " <프랑스어> - Y a-t-il un professeur ?(이 가잇 겟 틸 언 프로페서) \r\n"
						+ "  <중국어> - 有老师吗?(요 라우 쉬 마)\r\n"
						+ " <스페인어> - ¿Está el profesor adentro? (이스타렐  프로페쇼 러어덴트롤)",
				"[안녕히계세요]\n	  <영어> - Goodbye.(굳 바이)\r\n" 
						+ " <일본어> - お気をつけて(오키오 츠케테)\r\n"
						+ " <프랑스어> - Au revoir(오 뷔 부아)\r\n" 
						+ " <중국어> -再见。(짜이찌엔)\r\n" 
						+ " <스페인어> - ¡Adiós!(아디오스)" };
		String sc_go_2lang[] = {
				"[문 좀 닫아줘] \n	  <영어> - Please close the door. (플리즈 클로우즈 더 도어)\r\n"
						+ "  <일본어> - ドアを閉めてくれ(도아오 시메테쿠레)\r\n" 
						+ "  <중국어> - 把门关上 (바뭉궝샤)\r\n"
						+ "  <스페인어> - Cierra la puerta.(시롸 라  푸에레타) \r\n" 
						+ "  <프랑스어> -Fermez la porte. (셔우미 레 포우트) ",
				"[이것 좀 주워주라]  \n 영어 : Pick this up, please.(픽 디스 업 플리즈)\r\n" 
						+ "  일본어: これちょっと拾ってやれ (코레 초토 힛토테야레)\r\n"
						+ "  중국어: 把这个捡起来(빠 쳐 끄어 칭췰라우 )\r\n" 
						+ "  프랑스어: s'il te plaît. (실 토 플렡)\r\n"
						+ "  스페인어: Dame esto. (다메 예시토)",
				"[다음과목이 뭐야?]  \n 영어 : What's the next subject? (왓츠 더 넥스트 서브직트)\r\n"
						+ "  일본어: 次の科目は何? (츠키노 카모쿠와 나니)\r\n" 
						+ "  중국어: 下一个科目是什么? (샤이 크어크어 무 슈어 샹마) \r\n"
						+ "  프랑스어:Quelle est la prochaine matière ? (케릴라 푸슈엉 마츠하)\r\n"
						+ "  스페인어: ¿Cuál es el siguiente curso? (꽐리 셸리 슈기엔트 구숴)",
				"[조용히 좀 해주라]  \n 영어 : Please be quiet. (플리즈 비 콰이엍)\r\n" 
						+ " 일본어: 静かにしてくれ(시즈카니 시테쿠레)\r\n"
						+ " 중국어: 安静点 (안 증 디언)\r\n" 
						+ " 프랑스어:Tais-toi. (데 투아) \r\n" 
						+ " 스페인어: Cállate. (까이야테)" };

		Scanner sc = new Scanner(System.in);

		System.out.println(tema[0]);			//학교에서인 교실에서 교무실에서가 출력됨
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("한번더 선택해 주세요"); 
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		int User_B = sc.nextInt();				// #교무실, 교실중 선택하기
		System.out.print(tema_go[User_B]);		//User_B가 0일때 tema_go의 0번째가 출력되고 1일때는 1의 내용이 출력됨 
		int User_C = sc.nextInt();				//tema_go의 내용에서 한번 더 선택 을 함

		if (User_B == 0) {		//만약 User_B가 0일때 User_C가 선택한 것의 sc_go_1lang 의 내용을 출력.
			System.out.println(sc_go_1lang[User_C]);
		} else if (User_B == 1) {
			System.out.println(sc_go_2lang[User_C]);
		}
		System.out.println();
	}

}// main
	// }
