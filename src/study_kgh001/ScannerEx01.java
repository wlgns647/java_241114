package study_kgh001;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

		//콘솔창에서 원하는 값을 읽어와서 변수에 저장하는 예제
		Scanner scan = new Scanner(System.in);
		// printin(값) : 값을 출력하고 자동으로 줄바꿈 함
		// print(값) : 값을 출력
		
		System.out.print("정수를 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.println(num1);
		
		System.out.print("실수를 입력하세요: ");
		double num2 = scan.nextInt();
		System.out.println("단어 : "+ num2);
		
		System.out.print("문자열(단어)를 입력하세요: ");
		String str2 = scan.next(); //콘솔에서 공백(엔터,스페이스 등) 전까지 문자열을 가져옴
		System.out.println(str2);
		
		System.out.print("문자열(문장)을 입력하세요: ");
		String str1 = scan.nextLine(); //엔터까지 한 문장을 가져와서 엔터 전까지 저장함 
		System.out.println("문장 : "+ str1);
		
		System.out.println("문자를 입력하세요 : ");
		// next()를 통해서 문자열을 가져오고, String 클래스에서 재공하는 charAt(번지) 기능을 통해 0번지(첫번째) 글자를 가져옴
		char ch = scan.next().charAt(0);
		System.out.println(ch);
		
	}

}
