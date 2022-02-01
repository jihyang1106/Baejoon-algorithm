
import java.util.Scanner;

public class Main8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;   // 합을 넣을 변수 생성
		for(int i=0;i<n+1;i++) {  // 입력받은 수+1까지만 for문 실행
			sum += i;             // sum = sum + i 
		}
		System.out.println(sum);
		sc.close();
	}
}
