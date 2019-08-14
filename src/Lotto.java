
public class Lotto {

	//1~45까지 숫자 중 6가지가 랜덤으로 출력
	public static void main(String[] args) {


		//		//1~45를 담을 int형 배열 (Numbers)
		//		int Numbers[] = new int [45] ;
		//		//1~45를 Numbers에 대입
		//		for(int i = 0; i < 45; i++) {
		//			Numbers[i] = i+1;	
		//		}

		//랜덤한 값들을 생성하여 배열에 넣을 객체
		//	}
		//		 int[] Randomize() {
		int MAX_NUM = 45;
		int ANS_NUM = 6;


		//6가지 당첨번호를 담을 배열 (Answers)
		int Answers[] = new int [ANS_NUM] ;


		//Answers의 index가 0~5일때 까지만 반복
		for(int i = 0; i < ANS_NUM; i++) {
			//1~45 숫자들중 6개 숫자 랜덤으로 선택
			//0~MAX_NUM-1(44) >> 1~45중 랜덤으로 숫자 하나 출력 = random
			int random = (int)(Math.random() * MAX_NUM)+1;
			Answers[i] = random;
//			for(int j =0; j<i; j++) {
//				//random값들중 중복인경우 삽입 중지
//				if(Answers[j]==random) {
//					break;
//				}
//				//중복이 없다면 다음index에 랜덤 삽입
//				if(Answers[j] != random) {
//					Answers[j++] = random;
//				}
//			}
	}
		for(int i =0; i < ANS_NUM;i++)
			System.out.println(Answers[i]);

	}
}



