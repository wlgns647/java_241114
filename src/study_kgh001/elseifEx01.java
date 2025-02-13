package study_kgh001;

public class elseifEx01 {
	public static void main(String[] args) {
		int num=0;
		//num가 0이면 0을 출력
		//num가 양수이면 양수 출력
		//num가 0과 양수가 아니면 음수라고 출력
		
		if(num == 0) {
			System.out.println("0 입니다");
		}
		else if(num %2 == 0) {
			System.out.println("짝수 입니다");
		}
		else {
			System.out.println("짝수 입니다");
		}
	}
}
