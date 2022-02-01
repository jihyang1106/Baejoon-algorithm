
import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();   
		int arr[] = new int[t];  // 입력한 수로 배열의 크기 만들기(5를 받으면 5칸의 배열 생성)
		
		for(int i=0;i<t;i++) {  // 배열크기만큼 for문 진행
			int a = sc.nextInt();
			int b = sc.nextInt();
		    arr[i] = a + b;     
		    // 입력받은 수를 더해서 arr에 집어 넣기 a=1, b=2이면 1+2=arr[0]
		}
		// 향상된 for문
		for(int n:arr) { // 임의로 넣은 수 n. n은 0부터 시작 arr의 크기만큼 for문 실행 
			System.out.println(n);
		}

//		for(int n=0;n<t;n++) { // 기본 for문
//			System.out.println(arr[n]);
//		}
		sc.close();
	}
}
