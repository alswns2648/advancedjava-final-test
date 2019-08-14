package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		//l, r을 1~9로 랜덤화
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		// 결과값은 두 값의 곱
		resultNumber = l * r;
		//answerNumbers 배열  : randomizeAnswers함수애 의한 리턴 값(random) 입력
		int[] answerNumbers = randomizeAnswers();
		//loc이라는 배열 생성 : 0~8 의 랜덤한 값 입력
		int loc = randomize( 0, 8 );
		//배열 answerNumbers에 0~8(9개의 숫자)까지의 랜덤한 위치에 대입 = resultNumber
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println( l + " x " + r + " = ?" );
		
		//length 객체 생성 (배열 answer
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );
		Scanner s = new Scanner( System.in );
		int inputNum = s.nextInt();
		
		System.out.print( "\n" );
		
		if(inputNum == resultNumber) {
			System.out.println( "정답" );
		}else {
			System.out.println( "오답" );
		}
		
		
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	
	private static int[] randomizeAnswers() {
		// 화면에 보여질 정답의 갯수
		final int COUNT_ANSWER_NUMBER = 9;
		// 최대 숫자
		final int MAX_ANSWER_NUMBER = 81;
		// 화면에 보여질 숫자들이 저장될 배열
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		
		int occupied = 0;
		//화면에 보여질 숫자 배열의 index 0~ index8  반복
		while( occupied < COUNT_ANSWER_NUMBER ) {
			// 0+1~80+1 > 1~81까지 숫자 중 하나가 random 값
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        //i가 0~8 까지 반복
	        for( int i = 0; i < occupied; i++ ) {
	        	//정답 배열안에 random값이 있거나 (or) 정답에 random값이 있는경우
	        	if(boardNumbers[i] == random || random == resultNumber ) {
	        		evaluted = true; //중복발생
	        		break; //값 대입 x
	        	}
	        }
	        //중복 발생 X 인경우
	        if( !evaluted ) {
	        	//화면에 보여질 숫자가 담긴 배열의 index[0]:첫번째 값 = random
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		//random값 반환
        return boardNumbers;
	}	
}
