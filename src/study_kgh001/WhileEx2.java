package study_kgh001;

public class WhileEx2 {

	public static void main(String[] args) {
		// 구구단 2단을 출력하는 코드를 작성
		int i = 1;
		
		int num = 2;
		
		while(i<=9) {
			int res = num*i;
			System.out.println(num+"*"+i+"="+ res);
			i++;
		}
	}
}
