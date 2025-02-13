package study_kgh001;

import java.util.Scanner;

public class IfExam04 {
	
	public static void main(String[] args) {

		// 점수를 입력받아 3의 배수인지 아닌지 판별하는 코드를 작성.
		// 3의 배수입니다 / 3의 배수가 아닙니다 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = scan.nextInt();
		//num가 3의 배수면 3의 배수라고 출력
		//num를 3으로 나누었을때 나머지가 0과 같다면 3의 배수라고 출력
		
		if(num %3 == 0) {
			System.out.println(num+ "는 3의 배수입니다");
		}
		else {
			System.out.println(num+" 는 3의 배수가 아닙니다");
		}
	}
}
