
public class Main4673 {

	public static void main(String[] args) {  // 128ms
		// 한 줄에 하나씩
		// 0보다 크고 10000보다 작거나 같은 수 중에 셀프 넘버 출력
		// 생성자로 하는 수가 있으면 그 수를 거르기

		// 셀프넘버인지 확인하는 boolean 배열 생성
		boolean[] isNotSelfNum = new boolean[10001]; // 인덱스는 1부터 이니까

		for (int i = 1; i <= 10000; ++i) { // for(int i=1; i<10001; i++)와 동일
			int n = d(i); // 함수를 이용해서 생성자를 n으로 넣기
			if (n < isNotSelfNum.length) {
				isNotSelfNum[n] = true; // 원래 초기값은 false, 생성자가 있는 인덱스만 true로
			}
			if (isNotSelfNum[i] == false) { // 배열에 셀프넘버인 수만 false로 변환
				System.out.println(i); // 셀프넘버가 없는 인덱스는 false일 때
			}
		}
	}

	private static int d(int num) {

		int tmp = num; // 생성자를 구하기 위한 변수
		while (num > 0) { // 계속해서 10을 나누다 보면 0으로 되서 반복문 탈출
			tmp += num % 10; // num의 일의 자리수를 계속 tmp에 더하게 되면 생성자가 나오게 된다.
			num /= 10; // num의 수를 줄이기 위해서 10으로 나눈 몫을 num으로
		}
		return tmp;
	}
}
