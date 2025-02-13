package study_kgh001;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {

		//산술 연산자와 두 정수를 입력받아 산술 연산자에 맞는 연산결과를 출력하는 코드를 작성하세요.
		//예: 
		// 두 정수와 산술 연산자를 입력하세요(예 : 1 + 2 ) : 1 + 2 [엔터]
		// 1 + 2 = 3
		
		//Scanner를 이용하여 두 정수와 산술 연산자를 입력받기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 산술연산자를 입력하세요(예: 1+2) : ");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		double result;
		if(operator == '+') {
				result = num1 + num2;
				System.out.println(""+num1+operator+num2+"="+(int)result);
		}
		if(operator == '-') {
			result = num1 - num2;
			System.out.println(""+num1+operator+num2+"="+(int)result);
		}	
		if(operator == '*') {
			result = num1 * num2;
			System.out.println(""+num1+operator+num2+"="+(int)result);
		}
		if(operator == '/') {
			result = (double)num1 / num2;
			System.out.println(""+num1+operator+num2+"="+result);
		}
		if(operator == '%') {
			result = num1 % num2;
			System.out.println(""+num1+operator+num2+"="+(int)result);	
		}
		else {
			System.out.println(operator + "는 산술 연산자가 아닙니다.");
		}
		

		
		
	}
}
