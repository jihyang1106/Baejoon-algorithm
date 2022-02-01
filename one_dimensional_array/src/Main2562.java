import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {  //116ms 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; // 9개의 공간이 들어있는 배열 생성
		int max = 0;  // 최대값 변수, 0으로 초기화
		int index = 0; // 최댓값이 몇번째 인덱스인지 출력하는 변수
		
		for(int i=0;i<arr.length;i++) { // 배열의 크기만큼 for문 실행
			arr[i] = sc.nextInt();      // 입력받는 수가 배열에 들어간다.
			if(arr[i]>max) {            // 만약 입력받은 수가 max보다 크다면
				max = arr[i];           // 입력받은 수를 max에 넣어준다. 
				index = i+1;	        // 인덱스는 0부터 시작하기 때문에 +1을 더해주기
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
