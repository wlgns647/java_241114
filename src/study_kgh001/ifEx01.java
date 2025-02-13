package study_kgh001;

public class ifEx01 {
	public static void main(String[] args) {
		// if 문을 이용한 홀짝 판별 예제
		int num = 4;
		// num 가 홀수이면 홀수라고 출력
		if(num % 2 !=0) {
				System.out.println("홀수");
		}
		if(num % 2==0) {
			System.out.println("짝수");
		}
	}
}