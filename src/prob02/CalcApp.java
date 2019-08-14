package prob02;

import java.util.Scanner;



public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		//4칙연산 코딩
		Arithmetic arith = null ; //arithmetic 객체 생성
		
		switch(operation){ // 입력된 값에대한 계산
			case "+":
				arith = new Add();
				break;
			case "-":
				arith = new Sub();
				break;
			case "*":
				arith = new Mul();
				break;
			case "/":
				arith = new Div();
				break;
		}

		System.out.println(arith.calculate(a, b));
	}
	
}
