import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {  //108ms
		Scanner sc = new Scanner(System.in);

		int count = 0;   
		int[] arr = new int[10];  // 입력받은 수를 42로 나눠서 나온 나머지를 넣은 배열 생성

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;     // 입력받은 수를 42로 나눈 나머지를 배열에 넣기
		}

		for (int i = 0; i < arr.length; i++) { // 세로 크기 만큼의 for문 실행(i=0, j가 0~9까지의 비교)
			int tmp = 0;   // 배열 i과 i+1를 비교해서 넣은 임시 변수 생성
			for (int j = i + 1; j < arr.length; j++) {  
					if (arr[i] == arr[j]) {  // i와 i+1를 비교해서 같으면  tmp에다가 저장
						tmp++;
					}
				}
			if (tmp == 0) {  //i와 i+1를 비교해서 같지 않으면 0이 나오고 0이면 count에 더해준다.
				count++;
			}
		}System.out.println(count);
		sc.close();
	}
}
