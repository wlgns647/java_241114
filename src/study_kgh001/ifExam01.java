package study_kgh001;

import java.util.Scanner;

public class ifExam01 {
	
	public static void main(String[] args) {
		// 나이를 입력받아 나이가 19세 이상이면 성인을 출력하고 19세 미만이면 미성년자로 출력하는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int age = scan.nextInt();
		
		if(age >= 19) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("미성년자입니다");
		}
	}
}
