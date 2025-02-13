package study_kgh001;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		// 한번에 여러 값을 받는 예재 
		// 3학생의 성적을 한 번에 입력받는 예제 
		
		int score1, score2, score3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세 학생의 성적을 입력하세요: ");
		score1 = scan.nextInt();
		score2 = scan.nextInt();
		score3 = scan.nextInt();
		
		System.out.println("학생들의 성적 : "+score1+ ","+score2+ ","+score3);
	}

}
